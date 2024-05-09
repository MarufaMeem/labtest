package com.example.myapplication;

public class Info {

    private int units;
    private String genreName;

    public Info(int units, String genreName) {
        this.units = units;
        this.genreName = genreName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
