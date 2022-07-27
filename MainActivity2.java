package com.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.net.URL;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        TextView recievedlink = (TextView)findViewById(R.id.textView1);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        recievedlink.setText(str);
        Button Linkview = (Button)findViewById(R.id.button2);
        Linkview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = str;

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}