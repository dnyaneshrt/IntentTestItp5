package com.itp.intenttestitp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText et_number,et_name;
        Button btn_dial,btn_linkedin,btn_facebook,btn_next;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name=findViewById(R.id.et_name);
        et_number=findViewById(R.id.et_mobileNumber);

        btn_dial=findViewById(R.id.btn_dial);
        btn_facebook=findViewById(R.id.btn_facebook);
        btn_linkedin=findViewById(R.id.btn_linkedin);
        btn_next=findViewById(R.id.btn_nxt);

//setAction(),putExtra(),setData(),setType(),getExtra().

        btn_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                String mobile_number=et_number.getText().toString();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+mobile_number));
                startActivity(intent);
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, NextActivity.class);
                String name=et_name.getText().toString();
                intent.putExtra("myname",name);//to send data from one activity to anather activity.
                startActivity(intent);
            }
        });

        btn_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("com.linkedin.android");
                if(intent!=null) {
                    startActivity(intent);
                }else
                {
                    Intent intent1=new Intent();
                    intent1.setAction(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.linkedin.android&hl=en&gl=US&pli=1"));
                    startActivity(intent1);
                }
            }
        });

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(intent);
            }
        });

    }
}