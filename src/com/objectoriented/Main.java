package com.objectoriented;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //***********************************************************************************************

       // steps to be followed
        Scanner input = new Scanner(System.in);

        // define and instanitiate an object of PersonalInfo

        Personallnfo person = new Personallnfo();
        System.out.print("Please Enter Your Full name :");
        String name =input.nextLine();
        person.setName(name);
       // System.out.printf("\n%s \n", person.getName());
        System.out.print("Please Enter Your Email Address :");
        String email = input.nextLine();
        person.setEmail(email);
        input.nextLine();

    // ****** entering the educational Background of the above profile

        EducationalBack education1 = new EducationalBack();


        System.out.println("Please Enter the stream , the University and year of Your educational background !");
        String stream = input.nextLine();
        String university = input.nextLine();
        String year = input.nextLine();

        education1.setStream(stream);
        education1.setUniversity(university);
        education1.setYear(year);
        person.addEducation(education1);

        boolean check1=true;

        while(check1){
            System.out.println("Please Enter your other educational Background Stream, university and year in the new line !");
             stream = input.nextLine();
             university = input.nextLine();
             year = input.nextLine();
            if(!stream.isEmpty()&&!university.isEmpty()) {
                EducationalBack education = new EducationalBack();
                education.setStream(stream);
                education.setUniversity(university);
                education.setYear(year);
                person.addEducation(education);
            }
            else{
                System.out.println("Thank you For Entering the Educational Background !");
                check1=false;
            }

        }
        ArrayList<EducationalBack> perEducation= person.getEduBackground();

        System.out.printf("\nThe number of the Education will be : %s \n\n",perEducation.size());

          /*  System.out.println(person.getName());
            System.out.println(person.getEmail());
            System.out.println("\nEducation:");

            for(int i =0;i<perEducation.size();i++) {
               // System.out.printf("The " +i+1 " educational background of %s is %s ", person.getName(), person.getSizeofPersonalInfo());
                System.out.printf("%s, \n", perEducation.get(i).getStream());
                System.out.printf("%s University,in %s \n", perEducation.get(i).getUniversity(),perEducation.get(i).getYear());

           }*/

        // Entering the experience of the person

        Exprience exprience1 = new Exprience();
        ArrayList<String> duties =new ArrayList<String>();
        boolean check3 = true;

        System.out.println("Please Enter your Experiences inside the company !");
        System.out.println("Please Enter the position !");
        String position = input.nextLine();
        System.out.println("Please Enter the name of the company !");
        String company = input.nextLine();
        System.out.println("Please Enter the duration of your stay in the company !");
        String duration= input.nextLine();

        System.out.println("Please Enter your duties in the company ");
        String duty = input.nextLine();
        duties.add(duty);

        while(check3) {
            System.out.println("Please Enter your other duties in the company ");
            duty =input.nextLine();
            if (!duty.isEmpty()) {
                duties.add(duty);
            } else {
                System.out.println("Thank You for entering your duties !");
                check3=false;
            }
        }
        exprience1.setPosition(position);
        exprience1.setCompany(company);
        exprience1.setDuration(duration);
        exprience1.setDuty(duties);

        person.addExprience(exprience1);

        boolean check2=true;
        boolean check4 =true;

        while(check2){
            System.out.println("Please Enter your other position ,the name of the company, the duration of your Experience in the new lines !");
            position = input.nextLine();
            company = input.nextLine();
            duration= input.nextLine();

            System.out.println("Please Enter the duties inside the the this company !");
            duty = input.nextLine();
            duties.add(duty);
            while(check4) {
                System.out.println("Please Enter your other duties in the company ");
                duty =input.nextLine();
                if (!duty.isEmpty()) {
                    duties.add(duty);
                } else {
                    System.out.println("Thank You for Entering your duties !");
                        check4=false;
                }
            }
            if(!position.isEmpty()) {
                Exprience exprience = new Exprience();
                exprience.setPosition(position);
                exprience.setCompany(company);
                exprience.setDuration(duration);
                exprience.setDuty(duties);
                person.addExprience(exprience);
            }
            else{
                System.out.println("Thank you For Entering Your Experience in the company!");
                check2=false;
            }

        }

        ArrayList<Exprience> perExperience= person.getPastExpriences();

        System.out.printf("\nThe number of Experience you entered will be : %s \n\n",perExperience.size());
        System.out.printf("\nThe number of duties you entered in the companies will be  : %s \n",duties.size());

       // System.out.println(person.getName());
       // System.out.println(person.getEmail());
        System.out.println("\nExperience Output :");

        for(int i =0;i<perExperience.size();i++) {
            // System.out.printf("The " +i+1 " educational background of %s is %s ", person.getName(), person.getSizeofPersonalInfo());
            System.out.printf("%s, \n", perExperience.get(i).getPosition());
            System.out.printf("%s ,in %s \n", perExperience.get(i).getCompany(),perExperience.get(i).getDuration());
            for(int j=0; j<duties.size();j++) {
                System.out.printf("- Duty %d, %s ", (int)j+1, perExperience.get(j).getDuty());
            }

        }




    }

}
