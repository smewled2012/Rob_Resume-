package com.objectoriented;

public class EducationalBack {

    private String stream;
    private String university;
    private String year;

    public EducationalBack(){
        this.stream = stream;
        this.university = university;
        this.year = year;

    }
    public EducationalBack(String stream, String university, String year) {
        this.stream = stream;
        this.university = university;
        this.year = year;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
