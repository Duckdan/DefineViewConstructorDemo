package com.example.defineviewcollection.bottomDialog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import com.example.defineviewcollection.R;
import com.example.defineviewcollection.bottomDialog.bean.BottomDialogMenuBean;

import java.util.List;


public class MenuDialogAdapter extends BaseAdapter {

    private Context mContext;
    private List<BottomDialogMenuBean> mDatas;

    public MenuDialogAdapter(Context context, List<BottomDialogMenuBean> list) {
        mContext = context;
        mDatas = list;
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MenuDialogHolder menuDialogHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_bottom_dialog, null);
            menuDialogHolder = new MenuDialogHolder(convertView);
            convertView.setTag(menuDialogHolder);
        } else {
            menuDialogHolder = (MenuDialogHolder) convertView.getTag();
        }
        menuDialogHolder.name.setText(mDatas.get(position).getName());
//        Glide.with(mContext).load(mDatas.get(position).getIconId()).into(menuDialogHolder.icon);
        return convertView;
    }
}