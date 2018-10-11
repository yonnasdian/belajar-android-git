package com.example.abdalim.abdielalim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abdalim.abdielalim.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {
    PreferencesHelper instance;
    private EditText name;
    private EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        instance = PreferencesHelper.getInstance(getApplicationContext());

        name = (EditText) findViewById(R.id.text1);
        email = (EditText) findViewById(R.id.text2);
    }

    public void Login(View view) {
        String n = name.getText().toString();
        String e = email.getText().toString();
        Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        Bundle kirim = new Bundle();
        kirim.putString("nama", n);
        intent.putExtras(kirim);
        startActivity(intent);
        finish();

    }
}
