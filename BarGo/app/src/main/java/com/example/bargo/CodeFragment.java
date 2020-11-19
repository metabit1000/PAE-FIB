package com.example.bargo;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class CodeFragment extends Fragment {
    EditText introducedCode;
    Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_code, container, false);

        introducedCode = (EditText)rootView.findViewById(R.id.code);
        button = (Button)rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Pasar a una altre pantalla
                  Intent i = new Intent (MainActivity.this, MapsActivity.class);
                  startActivity(i);
                */
                
                String code = introducedCode.getText().toString();
                if (TextUtils.isEmpty(code)) Toast.makeText(getActivity().getBaseContext(), "Introduzca un código valido", Toast.LENGTH_SHORT).show();
                else Toast.makeText(getActivity().getBaseContext(), "¡Canjeado!", Toast.LENGTH_SHORT).show();

            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
}
