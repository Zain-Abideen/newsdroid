package com.btn.newsdroid.classes;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {


    private Context context;

    public MySharedPreference(Context context){
        this.context = context;

    }


    public void storeString(String key,String value) {
        SharedPreferences  sharedPref = context.getSharedPreferences("UserData",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key,value);
        editor.commit();
    }


    public String getString(String key) {
        String value = "Nothing found";
        SharedPreferences  sharedPref = context.getSharedPreferences("UserData",Context.MODE_PRIVATE);
        if(sharedPref.contains(key))
                value = sharedPref.getString(key,"Nothing found");
        return value;
    }






}
