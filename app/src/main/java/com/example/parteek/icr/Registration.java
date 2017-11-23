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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.VideoView;

public class Registration extends AppCompatActivity {
    VideoView videoView;
    Spinner spinnerState,spinnerCity;
    ArrayAdapter<String> adapterState,adapterCity;
    AppCompatButton buttonLogin;
    EditText editText;
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
        editText=(EditText)findViewById(R.id.reg_KVK);
    }
    @Override
    protected void onResume() {
        super.onResume();
        videoView();

    }
    public void videoView(){
        videoView=(VideoView)findViewById(R.id.videoView);
        Uri uri=Uri.parse("android.resource://com.example.parteek.icr/raw/video");
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
        adapterState.add("Haryana");
        adapterState.add("Delhi");
        adapterState.add("Jammu & Kashmir");
        adapterState.add("Himachal Pradesh");
        spinnerState.setAdapter(adapterState);
        spinnerState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                adapterCity=new ArrayAdapter<String>(Registration.this,R.layout.spinner_text);
                if (adapterState.getItem(i).equals("Punjab")){
                    adapterCity.add("----Select City----");
                    adapterCity.add("KVK Amritsar");
                    adapterCity.add("KVK Abohar");
                    adapterCity.add("KVK Barnala");
                    adapterCity.add("KVK Bathinda");
                    adapterCity.add("KVK Faridkot");
                    adapterCity.add("KVK Fatehgarh Shaib");
                    adapterCity.add("KVK Ferozepur");
                    adapterCity.add("KVK Gurdaspur");
                    adapterCity.add("KVK Hoshiarpur");
                    adapterCity.add("KVK Jalandhar");
                    adapterCity.add("KVK Kapurthala");
                    adapterCity.add("KVK Ludhiana");
                    adapterCity.add("KVK Mansa");
                    adapterCity.add("KVK Moga");
                    adapterCity.add("KVK Mohali");
                    adapterCity.add("KVK Muktsar");
                    adapterCity.add("KVK Nawanshahr");
                    adapterCity.add("KVK Patiala");
                    adapterCity.add("KVK Pathankot");
                    adapterCity.add("KVK Ropar");
                    adapterCity.add("KVK Sangrur");
                    adapterCity.add("KVK Tarantaran");
                    adapterCity.add("Other");
                }else if(adapterState.getItem(i).equals("Haryana")){
                    adapterCity.add("----Select City----");
                    adapterCity.add("KVK Ambala");
                    adapterCity.add("KVK Bhiwani");
                    adapterCity.add("KVK Faridabad");
                    adapterCity.add("KVK Fatehbaad");
                    adapterCity.add("KVK Gurgaon");
                    adapterCity.add("KVK Hisar");
                    adapterCity.add("KVK Jhajjar");
                    adapterCity.add("KVK Jind");
                    adapterCity.add("KVK Kaithal");
                    adapterCity.add("KVK Karnal");
                    adapterCity.add("KVK Kurukshetra");
                    adapterCity.add("KVK Mahendergarh");
                    adapterCity.add("KVK Panipat");
                    adapterCity.add("KVK Rewari");
                    adapterCity.add("KVK Rohtak");
                    adapterCity.add("KVK Sirsa");
                    adapterCity.add("KVK Sonipat");
                    adapterCity.add("KVK Yamunanagar");
                    adapterCity.add("Other");
                }else if(adapterState.getItem(i).equals("Delhi")){
                    adapterCity.add("----Select City----");
                    adapterCity.add("KVK New Delhi");
                    adapterCity.add("Other");
                }else if(adapterState.getItem(i).equals("Himachal Pradesh")){
                    adapterCity.add("----Select City----");
                    adapterCity.add("KVK Bilaspur");
                    adapterCity.add("KVK Chamba");
                    adapterCity.add("KVK Hamirpur");
                    adapterCity.add("KVK Kangra");
                    adapterCity.add("KVK Kinnaur");
                    adapterCity.add("KVK Kullu");
                    adapterCity.add("KVK Lahaul and Spiti");
                    adapterCity.add("KVK Mandi");
                    adapterCity.add("KVK Shimla");
                    adapterCity.add("KVK Sirmaur");
                    adapterCity.add("KVK Solan");
                    adapterCity.add("KVK Una");
                    adapterCity.add("Other");
                } else if(adapterState.getItem(i).equals("Jammu & Kashmir")){
                    adapterCity.add("----Select City----");
                    adapterCity.add("KVK Anantnag");
                    adapterCity.add("KVK Bandipora");
                    adapterCity.add("KVK Baramulla");
                    adapterCity.add("KVK Budgam");
                    adapterCity.add("KVK Doda");
                    adapterCity.add("KVK Gandarbal");
                    adapterCity.add("KVK Jammu");
                    adapterCity.add("KVK Kargil");
                    adapterCity.add("KVK Kathua");
                    adapterCity.add("KVK Kulgam");
                    adapterCity.add("KVK Kupwara");
                    adapterCity.add("KVK Leh");
                    adapterCity.add("KVK Nyoma");
                    adapterCity.add("KVK Pooonch");
                    adapterCity.add("KVK Pulwama");
                    adapterCity.add("KVK Rajouri");
                    adapterCity.add("KVK Reasi");
                    adapterCity.add("KVK Samba");
                    adapterCity.add("KVK Shopian");
                    adapterCity.add("KVK Srinagar");
                    adapterCity.add("Other");
                }else{
                    adapterCity.add("----Select City----");
                }
                spinnerCity.setAdapter(adapterCity);
                spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!(adapterCity.getItem(i).contains("Other"))){
                            if (i!=0){
                                Toast.makeText(Registration.this, adapterCity.getItem(i), Toast.LENGTH_SHORT).show();
                                editText.setVisibility(View.GONE);
                            }
                        }else{
                            editText.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
