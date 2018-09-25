package com.objectoriented;

import java.util.ArrayList;

public class Exprience {

    private String position;
    private String company;
    private String duration;
    private ArrayList<String> duty;

    public Exprience() {
        this.position = position;
        this.duration = duration;
        duty = new ArrayList<String>();
    }

    public void setDuty(ArrayList<String> duty) {
        this.duty = duty;
    }

    public Exprience(String position, String duration, ArrayList<String> duty) {
        this.position = position;
        this.duration = duration;
        duty = new ArrayList<String>();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<String> getDuty() {
        return duty;
    }
}
