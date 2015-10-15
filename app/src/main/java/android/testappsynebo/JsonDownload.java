package android.testappsynebo;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Sola2Be on 14.10.2015.
 */
public interface JsonDownload {

    @GET("/Customers/services/apexrest/DiplomatProducts")
    public Call<List<Products>> getProducts();
}
