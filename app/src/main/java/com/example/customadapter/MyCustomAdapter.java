package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    int[] flags;
    String[] countryNames;
    Context context;
    private LayoutInflater inflater;

    MyCustomAdapter(Context context, String[] countryNames, int[] flags){
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
    }


    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_layout,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.ImageViewId);
        TextView textView = convertView.findViewById(R.id.TextView1Id);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);


        return convertView;
    }
}
