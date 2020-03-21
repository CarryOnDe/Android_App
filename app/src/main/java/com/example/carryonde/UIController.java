package com.example.carryonde;

import android.app.Activity;
import android.os.Bundle;


import androidx.annotation.Nullable;

public class UIController extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainController.getInstance().isFirstUserStart()) {
            //val intent = Intent(this, DisplayMessageActivity::class.java).apply
           // startActivity(intent);

        }
    }

}
