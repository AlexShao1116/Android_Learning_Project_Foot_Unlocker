package com.learning.footunlocker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurfaceActivity extends AppCompatActivity {
        Button btn_1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_surface);
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.stilldre);
            btn_1 = findViewById(R.id.btn_1); // 寻找xml里面真正的id  与自己定义的id绑定

            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new
                            Intent(SurfaceActivity.this,MainActivity.class);//this前面为当前activty名称，class前面为要跳转到得activity名称
                    startActivity(intent);
                    if(mediaPlayer.isPlaying()){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.start();
                    }
                }
            });

        }
}