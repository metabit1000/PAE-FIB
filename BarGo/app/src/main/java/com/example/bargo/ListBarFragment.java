package com.example.bargo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ListBarFragment extends Fragment {

    private ListView barsListView;
    private BarListInfo barsListInfo = new BarListInfo();
    private int[] barsListImages;
    private String[] barsListNames;
    private String[] barsListAdresses;
    private Boolean[] barsListVisited;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_bar, container, false);

        barsListImages = barsListInfo.getImages();
        barsListNames = barsListInfo.getBars();
        barsListAdresses = barsListInfo.getAdresses();
        barsListVisited = barsListInfo.getVisited();

        barsListView = view.findViewById(R.id.barsList);
        AdaptadorListBar adaptador = new AdaptadorListBar();
        barsListView.setAdapter(adaptador);

        return  view;
    }

    class AdaptadorListBar extends BaseAdapter {

        @Override
        public int getCount() {
            return barsListImages.length;
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
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.bar_item_list, null);
            ImageView barImage = view.findViewById(R.id.barImage);
            TextView barName = view.findViewById(R.id.barNameText);
            TextView barAdress = view.findViewById(R.id.adressText);
            CheckBox barVisited = view.findViewById(R.id.visitedCheckBox);

            barImage.setImageResource(barsListImages[position]);
            barName.setText(barsListNames[position]);
            barAdress.setText(barsListAdresses[position]);
            barVisited.setChecked(barsListVisited[position]);

            return view;
        }
    }
}

