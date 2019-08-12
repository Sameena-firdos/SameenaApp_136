package com.example.sameenafirdos.sameenaapp;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendmessage(View view)
    {
        Intent newintent=new Intent(this,SecondPage.class);
        startActivity(newintent);
    }

}
