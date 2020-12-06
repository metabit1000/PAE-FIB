package com.example.bargo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ListEventsFragment extends Fragment {
   /* public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_events, container, false);
    }*/
    private ListView eventsListView;
    private EventListInfo eventListInfo = new EventListInfo();
    private int[] eventsListImage;
    private String[] eventsListName;
    private String[] barListName;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_events, container, false);
       /*final TextView textView = root.findViewById(R.id.text_chat);
        chatViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        eventsListView = root.findViewById(R.id.eventsList);
        eventsListImage = eventListInfo.getImages();
        eventsListName = eventListInfo.getEvents();
        barListName = eventListInfo.getBars();
        //creat an adapter class
        EventsListAdapter eventsListAdapter = new EventsListAdapter();
        eventsListView.setAdapter(eventsListAdapter);
        return root;
    }

    public class EventsListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return eventsListImage.length;
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
            View view = getLayoutInflater().inflate(R.layout.layout_eventslistitem, null);
            ImageView mImageView = view.findViewById(R.id.eventImage);
            TextView mTextView = view.findViewById(R.id.eventName);
            TextView mBarView = view.findViewById(R.id.barName);

            mImageView.setImageResource(eventsListImage[position]);
            mTextView.setText(eventsListName[position]);
            mBarView.setText(barListName[position]);
            return view;
        }
    }

}
