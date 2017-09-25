
package com.musta.faiaz.hajjassistant.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Months {

    private List<January> january = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public List<January> getJanuary() {
        return january;
    }


    public void setJanuary(List<January> january) {
        this.january = january;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
