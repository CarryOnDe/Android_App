package com.example.carryonde;

public class MainController {
    private boolean isHelper;
    private static MainController instance;
    private boolean firstStart = true;
    private MainController(){

    }

    public static MainController instance(){
        if(instance == null) {
            // Persistente Attribute aus Datei ziehen
            // firstStart ggf. setzen
            instance = new MainController();
        }
        return instance;
    }

    public boolean userIsHelper(){
        return this.isHelper;
    }
    public void makeUserHelper(){
        this.isHelper = true;
    }

    public void makeUserOrga(){
        this.isHelper = false;
    }

    public boolean firstStart(){
        return this.firstStart;
    }
}
