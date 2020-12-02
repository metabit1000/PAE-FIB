package com.example.bargo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListProductActivity extends AppCompatActivity {

    private ListView productsListView;
    private ProductListInfo productListInfo = new ProductListInfo();
    private int[] productListImage;
    private String[] productListName;
    private String[] productListUnit;
    private String[] productListPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        productsListView = findViewById(R.id.productsList);

        productListImage = productListInfo.getImages();
        productListName = productListInfo.getProductos();
        productListUnit = productListInfo.getUnidades();
        productListPoint = productListInfo.getPoints();

        //creat an adapter class
        ProductListAdapter productListAdapter = new ProductListAdapter();
        productsListView.setAdapter(productListAdapter);
    }

    public class ProductListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return productListImage.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View covertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.layout_list_product_item, null);
            ImageView mImageView = view.findViewById(R.id.productImage);
            TextView mNameView = view.findViewById(R.id.productName);
            TextView mCountView = view.findViewById(R.id.productCount);
            TextView mPointView = view.findViewById(R.id.productPoints);

            mImageView.setImageResource(productListImage[position]);
            mNameView.setText(productListName[position]);
            mCountView.setText(productListUnit[position]);
            mPointView.setText(productListPoint[position]);
            return view;
        }
    }
}