package com.codesample.alarm;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Alarm {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String time;
    public String alarmSound;
    public int volume;
    public int mission;
}
