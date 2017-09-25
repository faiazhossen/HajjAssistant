
package com.musta.faiaz.hajjassistant.model;

import java.util.HashMap;
import java.util.Map;

public class Extra {


    private String data;

    private String quran;

    private String hadith;

    private String story;

    private String sp1;

    private String sp2;

    private String sp3;

    private String sp4;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public String getQuran() {
        return quran;
    }


    public void setQuran(String quran) {
        this.quran = quran;
    }


    public String getHadith() {
        return hadith;
    }


    public void setHadith(String hadith) {
        this.hadith = hadith;
    }


    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }


    public String getSp1() {
        return sp1;
    }


    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }


    public String getSp2() {
        return sp2;
    }


    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }


    public String getSp3() {
        return sp3;
    }


    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }


    public String getSp4() {
        return sp4;
    }


    public void setSp4(String sp4) {
        this.sp4 = sp4;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
