package com.objectoriented;

import java.util.ArrayList;

public class Exprience {

    private String position;
    private String company;
    private String duration;
   ArrayList<Duties> myDuties;

    public Exprience() {
        this.position = position;
        this.duration = duration;
        myDuties = new ArrayList<Duties>();
    }

    public Exprience(String position, String duration, ArrayList<Duties> duty) {
        this.position = position;
        this.duration = duration;
      //  duty = new ArrayList<Duties>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<Duties> getMyDuties() {
        return myDuties;
    }

    public void setMyDuties(ArrayList<Duties> myDuties) {
        this.myDuties = myDuties;
    }

    public void addDuties(Duties firstDuty){
        this.myDuties.add(firstDuty);

    }


}
