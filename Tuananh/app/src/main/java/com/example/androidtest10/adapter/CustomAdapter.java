package com.example.androidtest10.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest10.R;

public class CustomAdapter extends BaseAdapter {
    private final Activity context;
    private final String[] socialNetworkNames;
    private final int[] socialNetworkIcons;

    public CustomAdapter(Activity context, String[] socialNetworkNames, int[] socialNetworkIcons) {
        this.context = context;
        this.socialNetworkNames = socialNetworkNames;
        this.socialNetworkIcons = socialNetworkIcons;
    }

    @Override
    public int getCount() {
        return socialNetworkNames.length;
    }

    @Override
    public Object getItem(int position) {
        return socialNetworkNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item_icon_mxh, null, true);

        TextView title = rowView.findViewById(R.id.title);
        ImageView icon = rowView.findViewById(R.id.icon);

        title.setText(socialNetworkNames[position]);
        icon.setImageResource(socialNetworkIcons[position]);

        return rowView;
    }
}
