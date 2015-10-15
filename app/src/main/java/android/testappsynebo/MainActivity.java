package android.testappsynebo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static List<Products> products;
    private ProductsAdapter productsAdapter;
    private ProgressBar progressBar;
    private boolean downloaded = false;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
            downloaded = savedInstanceState.getBoolean("downloaded");
        listView = (ListView) findViewById(R.id.listView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        if (!downloaded) {
            progressBar.setVisibility(View.VISIBLE);
            Retrofit retrofit = new Retrofit.Builder().baseUrl("https://sdo-demo-main-14898405b32.secure.force.com").
                addConverterFactory(GsonConverterFactory.create()).build();
            JsonDownload jsonDownload = retrofit.create(JsonDownload.class);
            Call<List<Products>> call = jsonDownload.getProducts();
            call.enqueue(callback);
        }
    }

    Callback<List<Products>> callback = new Callback<List<Products>>() {
        @Override
        public void onResponse(Response<List<Products>> response, Retrofit retrofit) {
            Log.d("TAG", "responce successfull");
            products = response.body();
            productsAdapter = new ProductsAdapter(MainActivity.this,R.layout.list_item_layout,products);
            listView.setAdapter(productsAdapter);
            listView.setOnItemClickListener(itemClickListener);
            progressBar.setVisibility(View.GONE);
            downloaded = true;
        }

        @Override
        public void onFailure(Throwable t) {
            Log.d("TAG", "download failed "+t.getMessage());
            progressBar.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this,"Failed to load list",Toast.LENGTH_SHORT).show();
        }
    };

    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView tv = (TextView) view.findViewById(R.id.textViewDescriptionC);
            if((tv.getVisibility() == View.GONE) && !(tv.getText().toString().isEmpty()))
                tv.setVisibility(View.VISIBLE);
            else
                tv.setVisibility(View.GONE);

        }
    };

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putBoolean("downloaded", downloaded);
        super.onSaveInstanceState(outState, outPersistentState);
    }


}
