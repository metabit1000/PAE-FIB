package com.example.bargo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class profileFragment extends Fragment {

    private TextView points;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button mis_reservas = (Button) view.findViewById(R.id.misReservas_button);

        TextView userName = (TextView) view.findViewById(R.id.user_name_profile);
        userName.setText(User.getInstance().getName());

        TextView points = (TextView) view.findViewById(R.id.points);
        String p = String.valueOf(User.getInstance().getPoints());
        points.setText(p + " " + getString(R.string.points));

        mis_reservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mis_reservas_activity = new Intent(getActivity(), MisReservasActivity.class);
                startActivity(mis_reservas_activity);
            }
        });

        Button list_events = (Button) view.findViewById(R.id.exchangeBttn);
        list_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent list_products_activity = new Intent(getActivity(), ListProductActivity.class);
                startActivity(list_products_activity);
            }
        });

        return view;
    }
    
}
