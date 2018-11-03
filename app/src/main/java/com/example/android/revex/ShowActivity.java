package com.example.android.revex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
   ImageView imageView;
    TextView nam,sho,pric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle bundle=getIntent().getExtras();

       // String image=getIntent().getStringExtra("image");
        String name=getIntent().getStringExtra("name");
        String sh=getIntent().getStringExtra("short");
        //String price=getIntent().getStringExtra("price");
        nam=findViewById(R.id.name);
        nam.setText(name);
        sho=findViewById(R.id.sh);
        sho.setText(sh);
        //pric=findViewById(R.id.price);
        //pric.setText((int) bundle.getDouble("price"));
        imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(bundle.getInt("image"));



    }
}
