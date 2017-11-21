package com.example.parteek.icr;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.VideoView;

public class Registration extends AppCompatActivity {
    VideoView videoView;
    Spinner spinnerState,spinnerCity;
    ArrayAdapter<String> adapterState,adapterCity;
    AppCompatButton buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        videoView();
        spinnerCity=(Spinner)findViewById(R.id.spinner2);
        spinnerState=(Spinner)findViewById(R.id.spinner);
        setSpinner();
        buttonLogin=(AppCompatButton)findViewById(R.id.reg_signin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registration.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        videoView();

    }
    public void videoView(){
        videoView=(VideoView)findViewById(R.id.videoView);
        Uri uri=Uri.parse("android.resource://com.example.parteek.icr/raw/videoplayback");
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }
    public void setSpinner(){
        adapterState=new ArrayAdapter<String>(this,R.layout.spinner_text);
        adapterState.add("----Select State----");
        adapterState.add("Punjab");
        adapterState.add("Jammu & Kashmir");
        adapterState.add("Himachal");
        adapterState.add("Uttarakhand");
        spinnerState.setAdapter(adapterState);
        spinnerState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterState.getItem(i).equals("Punjab")){
                    adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                    adapterCity.add("----Select City----");
                    adapterCity.add("Ludhiana");
                    adapterCity.add("Amritsar");
                    adapterCity.add("Patiala");
                    adapterCity.add("Jalandhar");
                    adapterCity.add("Bathinda");
                    spinnerCity.setAdapter(adapterCity);
                }else if(adapterState.getItem(i).equals("Jammu & Kashmir")){
                    adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                    adapterCity.add("----Select City----");
                    adapterCity.add("Jammu");
                    adapterCity.add("Srinagar");
                    adapterCity.add("leh Ladakh");
                    adapterCity.add("Sonamarg");
                    adapterCity.add("Pahalgam");
                    spinnerCity.setAdapter(adapterCity);
                }else if(adapterState.getItem(i).equals("Himachal")){
                    adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                    adapterCity.add("----Select City----");
                    adapterCity.add("Shimla");
                    adapterCity.add("Kufri");
                    adapterCity.add("Kullu Manali");
                    adapterCity.add("Rohtang Pass");
                    adapterCity.add("Chail");
                    spinnerCity.setAdapter(adapterCity);
                }else if(adapterState.getItem(i).equals("Uttarakhand")){
                    adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                    adapterCity.add("----Select City----");
                    adapterCity.add("Dehradun");
                    adapterCity.add("Haridwar");
                    adapterCity.add("Rishikesh");
                    spinnerCity.setAdapter(adapterCity);
                }else{
                    adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                    adapterCity.add("----Select City----");
                    spinnerCity.setAdapter(adapterCity);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
