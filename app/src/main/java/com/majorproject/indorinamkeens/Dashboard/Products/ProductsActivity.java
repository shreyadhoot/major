package com.majorproject.indorinamkeens.Dashboard.Products;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {
ListView listProduct;
    Toolbar toolbar;
    AppBarLayout appbar;
    ArrayList<Products> plist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_products);
//        linear.removeAllViews();
//        View v = getLayoutInflater().inflate(R.layout.activity_products, null);
//        linear.addView(v);


        listProduct = (ListView) findViewById(R.id.listProduct);

            plist= new ArrayList<Products>();
            plist.add(new Products(R.drawable.ic_launcher, "Chit Chat", "Mahendra","Rs. 0.0"));
            plist.add(new Products(R.drawable.ic_launcher, "Soya Chips", "Mishri","Rs. 0.0"));
            plist.add(new Products(R.drawable.ic_launcher, "Meetha Mixture","Om ke Namkeen","Rs. 0.0"));
            plist.add(new Products(R.drawable.ic_launcher, "Chocolate wafers", "Apna Sweets", "Rs. 0.0"));

            ProductAdapter adap = new ProductAdapter();
            listProduct.setAdapter(adap);

             listProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
                 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                     int index = position;
                     Products prod = plist.get(index);
                     Intent in = new Intent(ProductsActivity.this, CartActivity.class);
                     in.putExtra("product", prod);
                     startActivity(in);
                 }
             });


        }



        class ProductAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return plist.size();
            }

            @Override
            public Object getItem(int position) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public long getItemId(int position) {
                // TODO Auto-generated method stub
                return 0;
            }



            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                // TODO Auto-generated method stub
                Products p = plist.get(position);
                LayoutInflater linf = getLayoutInflater();
                View v =linf.inflate(R.layout.productlist_item_row, null);
                ImageView Pic = (ImageView) v.findViewById(R.id.imageLogo);
                TextView ProductName  = (TextView) v.findViewById(R.id.tvProductName);
                TextView ShopName = (TextView) v.findViewById(R.id.tvShopName);
                TextView Price = (TextView) v.findViewById(R.id.tvPrice);



                Pic.setImageResource(p.getLogo());
                ProductName.setText(p.getProductName());
                ShopName.setText(p.getShopName());
                Price.setText(p.getPrice());

                return v;
            }




        }
}
