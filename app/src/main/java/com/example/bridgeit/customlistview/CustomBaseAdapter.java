package com.example.bridgeit.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bridgeit on 2/11/16.
 */

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    List<RowItems> rowItemses;


    public CustomBaseAdapter(Context context, List<RowItems> rowItemses) {
        this.context = context;
        this.rowItemses = rowItemses;
    }
    /*private view holder class*/
    private class ViewHolder {
       ImageView imageView;
        TextView title;
        TextView subTitle;
    }

    @Override
    public int getCount() {
        return rowItemses.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItemses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItemses.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
ViewHolder holder = null;
        View view = convertView;
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if(view == null) {
          view =  mInflater.inflate(R.layout.custom_list,null);
            holder = new ViewHolder();
            holder.imageView = (ImageView)view.findViewById(R.id.image_view);
            holder.title = (TextView)view.findViewById(R.id.text_title);
            holder.subTitle = (TextView)view.findViewById(R.id.text_sub_title);
            view.setTag(holder);

        } else {
            holder = (ViewHolder)view.getTag();
        }
        RowItems item = (RowItems)getItem(position);

        holder.imageView.setImageResource(item.getmImageId());
        holder.title.setText(item.getmTitle());
        holder.subTitle.setText(item.getmSubTitle());
        return view;
    }
}
