package com.example.dong.kenburnsview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.flaviofaria.kenburnsview.KenBurnsView;

import static com.example.dong.kenburnsview.R.id.imageView;

public class MainActivity extends AppCompatActivity {
    KenBurnsView kenBurnsView;
    Button btn_resume,btn_pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kenBurnsView= (KenBurnsView) findViewById(imageView);
        btn_resume= (Button) findViewById(R.id.btn_resume);
        btn_pause= (Button) findViewById(R.id.btn_pause);

        Glide.with(MainActivity.this).load(R.drawable.sample3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(kenBurnsView);
        btn_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kenBurnsView.resume();
            }
        });

        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kenBurnsView.pause();
            }
        });
    }
}
