package android.testappsynebo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

/**
 * Created by Sola2Be on 14.10.2015.
 */
public class ProductsAdapter extends ArrayAdapter<Products> {

    private LayoutInflater inflater;
    private List<Products> products;
    private Picasso picasso;
    private ViewHolder holder;
    private Context context;
    private Resources res;

    public ProductsAdapter(Context context, int resource, List<Products> objects) {
        super(context, resource, objects);
        products = objects;
        inflater = LayoutInflater.from(context);
        picasso = Picasso.with(context);
        this.context = context;
        res = context.getResources();
    }

    class ViewHolder {
        ImageView imageViewProduct;
        TextView textViewFamily;
        TextView textViewNew;
        TextView textViewProductCode;
        TextView textViewRate;
        TextView textViewProductName;
        TextView textViewStok;
        TextView textViewProductPrice;
        TextView textViewDescription;
        TextView getTextViewDescriptionC;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Products getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        Products p = getItem(position);
        if(v == null) {
            v = inflater.inflate(R.layout.list_item_layout,null,false);
            holder = new ViewHolder();
            holder.imageViewProduct = (ImageView) v.findViewById(R.id.imageViewProduct);
            holder.textViewProductName = (TextView) v.findViewById(R.id.textViewProductName);
            holder.textViewFamily = (TextView) v.findViewById(R.id.textViewFamily);
            holder.textViewProductCode = (TextView) v.findViewById(R.id.textViewProductCode);
            holder.textViewProductPrice = (TextView) v.findViewById(R.id.textViewPrice);
            holder.textViewNew = (TextView) v.findViewById(R.id.textViewNew);
            holder.textViewRate = (TextView) v.findViewById(R.id.textViewRate);
            holder.textViewDescription = (TextView) v.findViewById(R.id.textViewDescription);
            holder.getTextViewDescriptionC = (TextView) v.findViewById(R.id.textViewDescriptionC);
            holder.textViewStok = (TextView) v.findViewById(R.id.textViewStock);
            v.setTag(holder);
        }
        else
            holder = (ViewHolder) v.getTag();
        picasso.load(p.getImage_Url__c()).resize(420,420).into(holder.imageViewProduct);
        String str;
        holder.textViewProductName.setText(p.getName());
        if(p.is_New_Product__c())
            holder.textViewNew.setVisibility(View.VISIBLE);
        if(p.getFamily() != null) {
            holder.textViewFamily.setText(p.getFamily());
            holder.textViewFamily.setVisibility(View.VISIBLE);
        }
        if(p.getProductCode() != null) {
            holder.textViewProductCode.setText(p.getProductCode());
            holder.textViewProductCode.setVisibility(View.VISIBLE);
        }
        if(p.getStock__c() != 0) {
            str = String.format(res.getString(R.string.stock), p.getStock__c());
            holder.textViewStok.setText(str);
            holder.textViewStok.setVisibility(View.VISIBLE);
        }
        if(p.getPrice__c() != 0) {
            str = String.format(res.getString(R.string.price), p.getPrice__c());
            holder.textViewProductPrice.setText(str);
            holder.textViewProductPrice.setVisibility(View.VISIBLE);
        }
        if(p.getRate__c() != 0) {
            str = String.format(res.getString(R.string.rate), p.getRate__c());
            holder.textViewRate.setText(str);
            holder.textViewRate.setVisibility(View.VISIBLE);
        }
        if(p.getDescription() != null) {
            holder.textViewDescription.setText(p.getDescription());
            holder.textViewDescription.setVisibility(View.VISIBLE);
        }
        if(p.getDescription__c() != null)
            holder.getTextViewDescriptionC.setText(Html.fromHtml(p.getDescription__c()));
        return v;
    }
}
