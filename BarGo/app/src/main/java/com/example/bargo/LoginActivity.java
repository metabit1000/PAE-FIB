package com.example.bargo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText email;
    private EditText passw;
    private TextView registrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registrate = findViewById(R.id.textViewRegistrate);
        String text = "¿Aún no tienes tu cuenta? Regístrate";
        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                openRegisterActivity();
            }
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.colorBarGo));
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan1, 26, 36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        registrate.setText(ss);
        registrate.setMovementMethod(LinkMovementMethod.getInstance());

        email = findViewById(R.id.editTextEmail);
        passw = findViewById(R.id.editTextContra);
        loginButton = findViewById(R.id.buttonAcceder);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correu = email.getText().toString();
                String contra = passw.getText().toString();
                User usuari = User.getInstance();
                if (correu.equals(usuari.getEmail()) && contra.equals(usuari.getPassword())) openMainActivity();
                else Toast.makeText(getApplicationContext(), "Introduzca unas credenciales válidas", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void openRegisterActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}