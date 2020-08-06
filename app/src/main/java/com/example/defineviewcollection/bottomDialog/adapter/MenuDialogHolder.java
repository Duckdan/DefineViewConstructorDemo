package com.example.defineviewcollection.bottomDialog.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.defineviewcollection.R;


public class MenuDialogHolder {
    public LinearLayout item;
    public ImageView icon;
    public TextView name;

    public MenuDialogHolder(@NonNull View itemView) {
        item = itemView.findViewById(R.id.item_menu_dialog);
        icon = itemView.findViewById(R.id.iv_item_icon);
        name = itemView.findViewById(R.id.tv_item_name);
    }
}
