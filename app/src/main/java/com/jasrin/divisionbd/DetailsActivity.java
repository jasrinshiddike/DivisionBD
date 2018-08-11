package com.jasrin.divisionbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName,txtDesc;
    Button btnLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace=findViewById(R.id.img_place);

        txtName=findViewById(R.id.txt_name);
        txtDesc=findViewById(R.id.txt_desc);

        btnLoc =findViewById(R.id.btn_loc);


        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Dhaka")){
            txtName.setText("Dhaka");
            txtDesc.setText(R.string.dhaka_city);
            imgPlace.setImageResource(R.drawable.dhaka1);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Chittagong")){
            txtName.setText("Chittagong");
            txtDesc.setText(R.string.chittagong_city);
            imgPlace.setImageResource(R.drawable.chittagong1);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity1.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Sylhet")){
            txtName.setText("Sylhet");
            txtDesc.setText(R.string.sylhet_city);
            imgPlace.setImageResource(R.drawable.shy);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity2.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Barisal")){
            txtName.setText("Barisal");
            txtDesc.setText(R.string.barisal_city);
            imgPlace.setImageResource(R.drawable.bari);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity3.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Khulna")){
            txtName.setText("Khulna");
            txtDesc.setText(R.string.khulna_city);
            imgPlace.setImageResource(R.drawable.khulna);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity4.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Rajshahi")){
            txtName.setText("Rajshahi");
            txtDesc.setText(R.string.rajshahi_city);
            imgPlace.setImageResource(R.drawable.rajshahi);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity5.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Rangpur")){
            txtName.setText("Rangpur");
            txtDesc.setText(R.string.rangpur_city);
            imgPlace.setImageResource(R.drawable.rang);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity6.class);
                    startActivity(intent);
                }
            });

        }
        else if(getName.equals("Mymensingh")){
            txtName.setText("Mymensingh");
            txtDesc.setText(R.string.man_city);
            imgPlace.setImageResource(R.drawable.myan1);

            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DetailsActivity.this,MapsActivity7.class);
                    startActivity(intent);
                }
            });

        }






    }
}
