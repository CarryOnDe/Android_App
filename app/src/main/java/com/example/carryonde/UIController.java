package com.example.carryonde;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.annotation.Nullable;

public class UIController extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainController.instance().firstStart()) {
            //val intent = Intent(this, DisplayMessageActivity::class.java).apply
           // startActivity(intent);

        }
    }

}
