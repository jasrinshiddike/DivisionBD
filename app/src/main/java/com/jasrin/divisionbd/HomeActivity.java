package com.jasrin.divisionbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ListView listView;

    String nameList[]={"Dhaka","Chittagong","Sylhet","Barisal","Khulna","Rajshahi","Rangpur","Mymensingh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView=findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(HomeActivity.this,R.layout.support_simple_spinner_dropdown_item,nameList);//adapter initialize

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name",nameList[position]);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, nameList[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
