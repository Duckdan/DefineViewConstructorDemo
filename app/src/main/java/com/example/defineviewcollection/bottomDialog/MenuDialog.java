package com.example.defineviewcollection.bottomDialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;


import com.blankj.utilcode.util.BarUtils;
import com.example.defineviewcollection.R;
import com.example.defineviewcollection.bottomDialog.adapter.MenuDialogAdapter;
import com.example.defineviewcollection.bottomDialog.bean.BottomDialogMenuBean;
import com.example.defineviewcollection.utils.PhoneWithNotchUtils;

import java.util.ArrayList;
import java.util.List;


/*************************************
 * @Author : liangjuqing
 * @Date : 11:40  2020/7/4
 * @Email : 72078083@vivo.com
 * @title : 
 * @Company : www.vivo.com
 * @Description : 
 ************************************/
public class MenuDialog extends Dialog {

    private int[] icons = {R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};
    private String[] names = {"item1", "item2", "item3", "item4"};

    private List<BottomDialogMenuBean> list = new ArrayList<>();
    private GridView mGridView;
    private ImageView mCancel;
    private MenuDialogAdapter mAdapter;
    private Context mContext;

    public MenuDialog(@NonNull Context context) {
        super(context);
        mContext = context;
        for (int i = 0; i < icons.length; i++) {
            list.add(new BottomDialogMenuBean(icons[i], names[i]));
        }
        setCanceledOnTouchOutside(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_menu);
        mGridView = findViewById(R.id.dialog_grid);
        mCancel = findViewById(R.id.dialog_cancel);
        //避免内存泄漏，因为里面用了Glide加载
        mAdapter = new MenuDialogAdapter(mContext.getApplicationContext(), list);
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener((parent, view, position, id) -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
            dismiss();
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });

        int statusBarHeight = BarUtils.getStatusBarHeight();

        Window window = getWindow();
        window.setWindowAnimations(R.style.dialogWindowAnim);


        DisplayMetrics dm = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = width;
        //屏幕高度要减去状态栏高度,有刘海屏的情况下dm.heightPixels获取步到包含状态栏的高度
        lp.height = dm.heightPixels - (PhoneWithNotchUtils.hasNotchInScreen((Activity) mContext) ? 0 : statusBarHeight);
        lp.gravity = Gravity.BOTTOM;


        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setAttributes(lp);
    }


    private OnItemClickListener listener;


    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}