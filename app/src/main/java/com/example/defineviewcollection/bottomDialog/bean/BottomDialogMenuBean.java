package com.example.defineviewcollection.bottomDialog.bean;
/*************************************
 * @Author : liangjuqing
 * @Date : 17:35  2020/7/18
 * @Email : 72078083@vivo.com
 * @title :
 * @Company : www.vivo.com
 * @Description :
 ************************************/
public class BottomDialogMenuBean {

    private int iconId;
    private String name;


    public BottomDialogMenuBean(int iconId, String name) {
        this.iconId = iconId;
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BottomDialogMenuBean{" +
                "iconId=" + iconId +
                ", name='" + name + '\'' +
                '}';
    }
}
