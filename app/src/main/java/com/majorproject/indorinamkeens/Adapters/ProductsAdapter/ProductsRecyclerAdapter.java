package com.majorproject.indorinamkeens.Adapters.ProductsAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.majorproject.indorinamkeens.Dashboard.Products.ProductsFragment;
import com.majorproject.indorinamkeens.Pojo.Products;
import com.majorproject.indorinamkeens.R;

import java.util.List;

/**
 * Created by Shreya Dhoot on 4/1/2016.
 */
public class ProductsRecyclerAdapter extends RecyclerView.Adapter<ProductsHolder> {
    List<Products> productsList = null;
    private Context context = null;
    ProductsFragment productsFragment;

    public ProductsRecyclerAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;

    }

    @Override
    public ProductsHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.productlist_item_row, viewGroup, false);
        ProductsHolder holder = new ProductsHolder(view, productsList, productsFragment);
        return holder;
    }


    @Override
    public void onBindViewHolder(final ProductsHolder holder, final int position) {

        holder.productName.setText(productsList.get(position).getProductName());
        holder.price.setText(productsList.get(position).getPrice());
        holder.shopName.setText(productsList.get(position).getShopName());
        holder.description.setText(productsList.get(position).getDescription());

        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Item " + productsList.get(position).getProductName() + " added to cart",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return productsList.size();
    }

}

