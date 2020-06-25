package com.codesample.alarm;

import android.os.Build;
import android.os.Bundle;
import android.widget.SeekBar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.codesample.alarm.databinding.ActivityOptionBinding;

import java.time.LocalDate;

public class optionActivity extends AppCompatActivity {
    private ActivityOptionBinding binding;
    public int volume = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                volume = binding.seekBar.getProgress();
                update();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                volume = binding.seekBar.getProgress();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                volume = binding.seekBar.getProgress();
            }
        });

    }

    private void update(){
        binding.textViewVolume.setText(new StringBuilder().append(volume));
    }

    /*private Alarm getAlarm(){

        return alarm;
    }*/

}
