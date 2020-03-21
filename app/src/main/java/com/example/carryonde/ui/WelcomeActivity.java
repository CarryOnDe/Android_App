package com.example.carryonde.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.carryonde.MainController;
import com.example.carryonde.R;

public class WelcomeActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        MainController.getInstance().safeConfig();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button buttonHelper = findViewById(R.id.buttonHelper);
        Button buttonOrganisation = findViewById(R.id.buttonOrganisation);
        buttonHelper.setOnClickListener(this);
    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonHelper:
                MainController.getInstance().makeUserHelper();
                break;
            case R.id.buttonOrganisation:
                MainController.getInstance().makeUserOrga();;
                break;
        }



    }
}
