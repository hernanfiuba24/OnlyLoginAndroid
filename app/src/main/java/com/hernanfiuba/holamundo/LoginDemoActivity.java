package com.hernanfiuba.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginDemoActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);

        loginButton = (Button) findViewById(R.id.loginButton);
        name = (EditText) findViewById(R.id.loginName);
        password = (EditText) findViewById(R.id.loginPassword);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    public void validate(String name, String password) {
        if (name.equals("admin") && password.equals("1234")) {
            Intent intent = new Intent(this, IndexDemoActivity.class);
            startActivity(intent);
        }
    }
}
