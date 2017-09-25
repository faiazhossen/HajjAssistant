
package com.musta.faiaz.hajjassistant.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataModel {


    private List<Extra> extra = null;

    private Months months;

    private String name;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public List<Extra> getExtra() {
        return extra;
    }


    public void setExtra(List<Extra> extra) {
        this.extra = extra;
    }


    public Months getMonths() {
        return months;
    }


    public void setMonths(Months months) {
        this.months = months;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
