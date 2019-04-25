package com.lee.pmd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<String> datas;

    public MyAdapter(List<String> datas){
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas == null?0:datas.size();
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
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = View.inflate(parent.getContext(),R.layout.item,null);
            viewHolder = new ViewHolder();
            viewHolder.title = convertView.findViewById(R.id.tv_title);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(datas.get(position));
        return convertView;
    }

    class ViewHolder{
        TextView title;
    }

}
