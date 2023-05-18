package com.itp.intenttestitp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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



        btn_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                startActivity(intent);


            }
        });

    }
}