package io.github.froger.instamaterial.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import io.github.froger.instamaterial.R;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      // FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_social);
    }

    public void goLogin(View view) {
        Intent intent = new Intent(SocialActivity.this, GoogleActivity.class);
        startActivity(intent);
    }

    public void goToRegistration(View view) {
       // Intent intent = new Intent(SocialActivity.this, onBoardActivity.class);
       // startActivity(intent);
    }

    public void goFeed(View view) {
        Intent intent = new Intent(SocialActivity.this, LandingActivity.class);
        startActivity(intent);
    }
}
