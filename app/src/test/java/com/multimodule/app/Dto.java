package com.multimodule.app;

public class Dto {
    private String key;
    private String value;
    private boolean used;

    public Dto(String key, String value, boolean used) {
        this.key = key;
        this.value = value;
        this.used = used;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean free) {
        this.used = free;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", used=" + used +
                '}';
    }
}
