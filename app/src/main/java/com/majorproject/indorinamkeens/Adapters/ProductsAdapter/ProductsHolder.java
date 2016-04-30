package com.majorproject.indorinamkeens.Adapters.ProductsAdapter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.majorproject.indorinamkeens.Dashboard.Products.ProductsFragment;
import com.majorproject.indorinamkeens.Pojo.Products;
import com.majorproject.indorinamkeens.R;

import java.util.List;

/**
 * Created by Punit on 4/1/2016.
 */
public class ProductsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    protected ImageView image;
    protected TextView productName;
    protected TextView price;
    protected TextView shopName;
    protected TextView description;
    protected Button addToCart;
    private List<Products> productsList;
    ProductsFragment productsFragment;

    public ProductsHolder(View view, List<Products> productsList, ProductsFragment productsFragment) {
        super(view);
        this.productsList = productsList;
        this.productsFragment = productsFragment;
        this.image = (ImageView) view.findViewById(R.id.image);
        this.productName = (TextView)view.findViewById(R.id.tvProductName);
        this.price = (TextView) view.findViewById(R.id.tvPrice);
        this.shopName = (TextView) view.findViewById(R.id.tvShopName);
        this.description = (TextView) view.findViewById(R.id.tvProductDescription);
        this.addToCart = (Button) view.findViewById(R.id.addToCart);
    }


    @Override
    public void onClick(View v) {
        String productName = productsList.get(getAdapterPosition()).getProductName();
        String shopName = productsList.get(getAdapterPosition()).getShopName();
        String price = productsList.get(getAdapterPosition()).getPrice();
        int logo = productsList.get(getAdapterPosition()).getLogo();
       }
}