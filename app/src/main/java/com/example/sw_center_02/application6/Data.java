package com.example.sw_center_02.application6;

/**
 * Created by SOMN on 2017-04-10.
 */

public class Data {
    private String name;
    private String tel;
    private String menu[] = new String[3];
    private String homepage;
    private String date;
    private int categoryNum;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String name) {
        this.tel = tel;
    }
    public String[] getMenu(){
        return menu;
    }
    public void setMenu(String[] menu){
        this.menu = menu;
    }
    public String getHomepage(){
        return homepage;
    }
    public void setHomepage(String homepage){
        this.homepage = homepage;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public int getCategoryNum(){
        return categoryNum;
    }
    public void setCategoryNum(int categoryNum){
        this.categoryNum = categoryNum;
    }
}
