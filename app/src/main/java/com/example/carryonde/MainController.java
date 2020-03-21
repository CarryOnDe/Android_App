package com.example.carryonde;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class MainController {
    private static String LOCATION_ = "test/.config";

    private static MainController instance;
    private User user;

    private MainController(){
        loadConfig();
    }



    public static MainController getInstance(){
        if(instance == null) {
            // Persistente Attribute aus Datei ziehen
            // firstStart ggf. setzen
            instance = new MainController();
        }
        return instance;
    }

    public boolean isUserHelper(){
        return this.user.isHelper();
    }
    public void makeUserHelper(){
        this.user.makeHelper();
    }

    public void makeUserOrga(){
        this.user.makeOrga();
    }

    public boolean isFirstUserStart(){
        return this.user.isFirstStart();
    }



    public void loadConfig() {

    }

    public void safeConfig() {

        /*FIRST TEST NOT FINAL VERSION*********

        User alex = new User(false);

        Gson b = new Gson();

        String xml = b.toJson(alex);
        Log.d("hululu", xml);

        User newOne = b.fromJson(xml, User.class);

        Log.d("hululu", newOne.toString());


        BufferedWriter writer = new BufferedWriter();
        */

    }

}

class User{
    private int id;
    private boolean isHelper;
    private boolean firstStart = true;

    public User(){
        this(true);
    }
    public User(boolean isHelper_){
        id = 4687954;
        isHelper = isHelper_;
    }

    public boolean isHelper(){
        return this.isHelper;
    }
    public void makeHelper(){
        this.isHelper = true;
    }

    public void makeOrga(){
        this.isHelper = false;
    }

    public boolean isFirstStart(){
        return this.firstStart;
    }

    @NonNull
    @Override
    public String toString() {
        return id + "; " + isHelper + "; " + firstStart + ";";
    }
}
