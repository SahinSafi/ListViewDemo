package com.cyberwith.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private int[] icon;
    private String[] title;
    private String[] details;
    private Context context;

    public CustomAdapter(int[] icon, String[] title,String[] details, Context context) {
        this.icon = icon;
        this.title = title;
        this.details = details;
        this.context = context;
    }

    @Override
    public int getCount() {
        return title.length;
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

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.sample_layout, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageID);
        TextView tile = convertView.findViewById(R.id.titleTextID);
        TextView detailsText = convertView.findViewById(R.id.detailsTextID);

        imageView.setImageResource(icon[position]);
        tile.setText(title[position]);
        detailsText.setText(details[position]);

        return convertView;
    }
}
