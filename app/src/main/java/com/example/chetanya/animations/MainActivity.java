package com.example.chetanya.animations;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bExplode;
    Button bSlide;
    Button bExplode2;
    Button bSlide2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bExplode=(Button)findViewById(R.id.bExplode);
        bSlide=(Button)findViewById(R.id.bSlide);
        bExplode2=(Button)findViewById(R.id.bExplode2);
        bSlide2=(Button)findViewById(R.id.bSlide2);

    }
    @Override
    public void onClick(View view) {
        int id=view.getId();
        Intent intent= new Intent(MainActivity.this, TransitionActivity.class);
        if(id==R.id.bExplode || id==R.id.bExplode2){
            setupWindowAnimationExplode();
        }else if(id==R.id.bSlide || id==R.id.bSlide2){
            setupWindowAnimationFade();
        }
        startActivity(intent);
    }
}
