package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.ImageViewPId);
        textView = findViewById(R.id.TextViewPID);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){

        if (countryName.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.ban);
            textView.setText(R.string.ban_txt);
        }

        if (countryName.equals("Pakistan")){
            imageView.setImageResource(R.drawable.pak);
            textView.setText(R.string.pak_txt);
        }

        if (countryName.equals("India")){
            imageView.setImageResource(R.drawable.ind);
            textView.setText(R.string.ind_txt);
        }

        if (countryName.equals("Australia")){
            imageView.setImageResource(R.drawable.ban);
            textView.setText(R.string.ban_txt);
        }

        if (countryName.equals("New Zeland")){
            imageView.setImageResource(R.drawable.nz);
            textView.setText(R.string.nz_txt);
        }

        if (countryName.equals("England")){
            imageView.setImageResource(R.drawable.eng);
            textView.setText(R.string.eng_txt);
        }

        if (countryName.equals("South Africa")){
            imageView.setImageResource(R.drawable.sa);
            textView.setText(R.string.sf_txt);
        }

        if (countryName.equals("West Indies")){
            imageView.setImageResource(R.drawable.wi);
            textView.setText(R.string.wi_txt);
        }

        if (countryName.equals("Afganistan")){
            imageView.setImageResource(R.drawable.afg);
            textView.setText(R.string.afg_txt);
        }

        if (countryName.equals("Srilanka")){
            imageView.setImageResource(R.drawable.sri);
            textView.setText(R.string.sri_txt);
        }

        if (countryName.equals("Ireland")){
            imageView.setImageResource(R.drawable.ire);
            textView.setText(R.string.ire_txt);
        }

        if (countryName.equals("Zimbabwa")){
            imageView.setImageResource(R.drawable.zim);
            textView.setText(R.string.zim_txt);
        }

    }
}
