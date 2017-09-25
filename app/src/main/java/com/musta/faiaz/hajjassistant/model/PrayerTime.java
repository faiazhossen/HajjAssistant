package com.musta.faiaz.hajjassistant.model;

import java.util.ArrayList;

/**
 * Created by FAIAZ on 9/24/2017.
 */

public class PrayerTime extends ArrayList<PrayerTime> {
    String fajr_time;
    String zohr_time;
    String asr_time;
    String magrib_time;
    String esha_time;
    String hadith_of_day;
    String verse_of_day;
    String sp_message;
    String story_of_day;
    String day_no;

    public PrayerTime() {

    }

    public PrayerTime(String fajr_time, String zohr_time, String asr_time, String magrib_time, String esha_time, String hadith_of_day,
                      String verse_of_day, String sp_message, String story_of_day, String day_no) {
        this.fajr_time = fajr_time;
        this.zohr_time = zohr_time;
        this.asr_time = asr_time;
        this.magrib_time = magrib_time;
        this.esha_time = esha_time;
        this.hadith_of_day = hadith_of_day;
        this.verse_of_day = verse_of_day;
        this.sp_message = sp_message;
        this.story_of_day = story_of_day;
        this.day_no = day_no;
    }

    public String getFajr_time() {
        return fajr_time;
    }

    public void setFajr_time(String fajr_time) {
        this.fajr_time = fajr_time;
    }

    public String getZohr_time() {
        return zohr_time;
    }

    public void setZohr_time(String zohr_time) {
        this.zohr_time = zohr_time;
    }

    public String getAsr_time() {
        return asr_time;
    }

    public void setAsr_time(String asr_time) {
        this.asr_time = asr_time;
    }

    public String getMagrib_time() {
        return magrib_time;
    }

    public void setMagrib_time(String magrib_time) {
        this.magrib_time = magrib_time;
    }

    public String getEsha_time() {
        return esha_time;
    }

    public void setEsha_time(String esha_time) {
        this.esha_time = esha_time;
    }

    public String getHadith_of_day() {
        return hadith_of_day;
    }

    public void setHadith_of_day(String hadith_of_day) {
        this.hadith_of_day = hadith_of_day;
    }

    public String getVerse_of_day() {
        return verse_of_day;
    }

    public void setVerse_of_day(String verse_of_day) {
        this.verse_of_day = verse_of_day;
    }

    public String getSp_message() {
        return sp_message;
    }

    public void setSp_message(String sp_message) {
        this.sp_message = sp_message;
    }

    public String getStory_of_day() {
        return story_of_day;
    }

    public void setStory_of_day(String story_of_day) {
        this.story_of_day = story_of_day;
    }

    public String getDay_no() {
        return day_no;
    }

    public void setDay_no(String day_no) {
        this.day_no = day_no;
    }
}
