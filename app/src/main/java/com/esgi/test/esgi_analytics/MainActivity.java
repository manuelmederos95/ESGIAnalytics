package com.esgi.test.esgi_analytics;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);

    }

    public void onLogin(View view){

        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();

        /**String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);*/

        if(username.equals("123") && password.equals("123")) {
             Intent intent = new Intent(this, MainActivity2.class);
             startActivity(intent);
        }
        else{
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Login Status");
            alertDialog.setMessage("Wrong user or password");
            alertDialog.show();
        }
        /**Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);*/
    }
}
