package com.example.carryonde;

public class MainController {
    private boolean isHelper;
    private MainController instance;
    private MainController(){

    }

    public MainController getMainController(){
        if(this.instance == null) {
            this.instance = new MainController();
        }
        return this.instance;
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
}
