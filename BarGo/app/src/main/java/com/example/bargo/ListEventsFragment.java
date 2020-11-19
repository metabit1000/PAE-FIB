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
    private ListView mChatListView;
    private EventListInfo eventListInfo = new EventListInfo();
    private int[] chatsListImage;
    private String[] chatsListName;

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
        mChatListView = root.findViewById(R.id.eventsList);
        chatsListImage = eventListInfo.getImages();
        chatsListName = eventListInfo.getNames();
        //creat an adapter class
        ChatsListAdapter chatsListAdapter = new ChatsListAdapter();
        mChatListView.setAdapter(chatsListAdapter);
        return root;
    }

    public class ChatsListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return chatsListImage.length;
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
            ImageView mImageView = view.findViewById(R.id.contactImage);
            TextView mTextView = view.findViewById(R.id.contactName);
            mImageView.setImageResource(chatsListImage[position]);
            mTextView.setText(chatsListName[position]);
            return view;
        }
    }

}
