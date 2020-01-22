package com.electronicrecycle.ecycle.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.models.ListItems;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private ArrayList<ListItems> listData;
    private LayoutInflater layoutInflater;
    public CustomListAdapter(Context aContext, ArrayList<ListItems> listData)
    {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.list_view_items, null);
            holder = new ViewHolder();
            holder.uName = (TextView) v.findViewById(R.id.tvDesc);
            holder.imgHolder=(ImageView)v.findViewById(R.id.imgHolder);



            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.uName.setText(listData.get(position).getName());
        holder.imgHolder.setImageResource(listData.get(position).getId());
        return v;
    }

    static class ViewHolder {
        TextView uName;
        ImageView imgHolder;
    }
}
