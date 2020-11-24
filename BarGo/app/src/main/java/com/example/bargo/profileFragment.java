package com.example.bargo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class profileFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView userName = (TextView) view.findViewById(R.id.user_name_profile);
        userName.setText(User.getInstance().getName());

        TextView points = (TextView) view.findViewById(R.id.points);
        String p = String.valueOf(User.getInstance().getPoints());
        points.setText(p + " " + getString(R.string.points));

        return view;
    }
}
