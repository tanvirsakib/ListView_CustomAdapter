package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Intent intent;
    private String[] counrtyNames;
    int[] flags = {R.drawable.ban_icon,R.drawable.pak_icon,R.drawable.india_icon,R.drawable.aus_icon,
            R.drawable.nz_icon, R.drawable.eng_icon, R.drawable.sf_icon, R.drawable.wi_icon,
            R.drawable.afg_icon, R.drawable.sri_icon, R.drawable.ire_icon, R.drawable.zim_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListViewId);
        counrtyNames = getResources().getStringArray(R.array.country_name);
        final MyCustomAdapter adapter = new MyCustomAdapter(MainActivity.this,counrtyNames,flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = counrtyNames[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name",value);
                startActivity(intent);
            }
        });

    }
}
