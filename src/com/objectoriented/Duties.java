package com.objectoriented;


import java.util.ArrayList;

public class Duties {
   private String duty1;
  //  ArrayList<String> myduty;
    ArrayList<Duties> myDuties;

    public ArrayList<Duties> getMyDuties() {
        return myDuties;
    }

    public void setMyDuties(ArrayList<Duties> myDuties) {
        this.myDuties = myDuties;
    }

    public Duties() {
       this.duty1 = duty1;
     //   myduty=new ArrayList<String>();
        this.myDuties = new ArrayList<>();

    }

   /*public ArrayList<String> getFirstduty() {
        return myduty;
    }

    public void setFirstduty(ArrayList<String> myduty) {
        this.myduty = myduty;
    }*/


    public String getDuty1() {
        return duty1;
    }
    public void setDuty1(String duty1){
        this.duty1=duty1;

    }

    public void getAddDuties(Duties aduty){
        this.myDuties.add(aduty);
    }

   /* public void setMyduty(ArrayList<String> myduty) {
        this.myduty = myduty;
    }*/

}
