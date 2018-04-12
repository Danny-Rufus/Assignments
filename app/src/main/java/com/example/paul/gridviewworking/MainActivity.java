package com.example.paul.gridviewworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    GridView androidGridView;
   String[]  gridViewString = {"Facebook","Skull","Instagram","Abstract","Street","Facebook","Skull","Instagram","Abstract","Street","Facebook","Skull","Instagram","Abstract","Street"};
   int[]  gridViewImageId={R.drawable.fb,R.drawable.icon,R.drawable.ig,R.drawable.tw,R.drawable.yt,R.drawable.fb,R.drawable.icon,R.drawable.ig,R.drawable.tw,R.drawable.yt,R.drawable.fb,R.drawable.icon,R.drawable.ig,R.drawable.tw,R.drawable.yt,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
            androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
            androidGridView.setAdapter(adapterViewAndroid);
            androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    makeText(MainActivity.this, "GridView Item: " + gridViewString[+i], LENGTH_SHORT).show();
                }
            });


        }
}
