package com.objectoriented;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Personallnfo {

    private String name;
    private String email;

    ArrayList<EducationalBack> eduBackground;
    ArrayList<Exprience> pastExpriences;

    public Personallnfo() {
        this.name = name;
        this.email = email;
        eduBackground =new ArrayList<EducationalBack>();
        pastExpriences= new ArrayList<Exprience>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEducation(EducationalBack firstEducation){
        eduBackground.add(firstEducation);
    }

    public void addExprience(Exprience firstExprience){
        pastExpriences.add(firstExprience);
    }

    public int getSizeofPersonalInfo(){
        return  eduBackground.size();
    }

    public ArrayList<EducationalBack> getEduBackground() {
        return eduBackground;
    }

    public ArrayList<Exprience> getPastExpriences() {
        return pastExpriences;
    }

}
