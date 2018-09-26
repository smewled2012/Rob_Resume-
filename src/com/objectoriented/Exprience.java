package com.objectoriented;

import java.util.ArrayList;

public class Exprience {

    private String position;
    private String company;
    private String duration;
   ArrayList<Duties> duty;
  //  ArrayList<String> duty;
   // private ArrayList<String> duty;
  //  private ArrayList<ArrayList> dutys;

    public Exprience() {
        this.position = position;
        this.duration = duration;
     //    duty = new ArrayList<String>();
        duty = new ArrayList<Duties>();
    }

   /* public void setDuty(ArrayList<String> duty){
        this.duty=duty;

    }
  */
    public void setDuty(ArrayList<Duties> duty) {
        this.duty = duty;
    }

    public Exprience(String position, String duration, ArrayList<Duties> duty) {
        this.position = position;
        this.duration = duration;
        duty = new ArrayList<Duties>();
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

    public ArrayList<Duties> getDuty() {
        return duty;
    }
    public void addDuties(Duties firstDuty){
        this.duty.add(firstDuty);

    }


}
