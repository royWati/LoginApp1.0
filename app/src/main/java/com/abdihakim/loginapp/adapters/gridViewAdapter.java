package com.abdihakim.loginapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abdihakim.loginapp.R;

/**
 * Created by folio on 9/19/2018.
 */

public class gridViewAdapter extends BaseAdapter {

    Context context;
    int[] images;
    String[] texts;
    LayoutInflater inflater;

    public gridViewAdapter(Context context, int[] images, String[] texts) {
        this.context = context;
        this.images = images;
        this.texts = texts;
        inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.custom_grid_view_item,null);
        ImageView image = view.findViewById(R.id.img_item);
        TextView textView = view.findViewById(R.id.text_item);
        image.setImageResource(images[i]);
        textView.setText(texts[i]);

        return view;
    }
}
