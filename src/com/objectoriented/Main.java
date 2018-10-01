package com.objectoriented;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


       // steps to be followed
        Scanner input = new Scanner(System.in);

        // define and instanitiate an object of PersonalInfo

        // *************************personal Information ******************************************************************************************************

        Personallnfo person = new Personallnfo();
        System.out.print("Please Enter Your Full name :");
        String name =input.nextLine();
        person.setName(name);
       // System.out.printf("\n%s \n", person.getName());
        System.out.print("Please Enter Your Email Address :");
        String email = input.nextLine();
        person.setEmail(email);
        input.nextLine();

    // ****** Entering the educational Background of the above profile******************************************************************


        System.out.println("Please Enter the stream , the University and year of Your educational background !");
        String addEducation;
        do {
            EducationalBack education1 = new EducationalBack();
            System.out.println("Enter the stream of your study ");
            String stream = input.nextLine();
            education1.setStream(stream);
            System.out.println("Enter the University :");
            String university = input.nextLine();
            education1.setUniversity(university);
            System.out.println("Enter the year of graduation year :");
            String year = input.nextLine();
            education1.setYear(year);

            person.addEducation(education1);

            System.out.println("Do you have more Educational Background ?");
            addEducation = input.nextLine();

        }while(addEducation.equalsIgnoreCase("yes"));

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
      //****************************************Experience of a person *************************************************************************************************************************************


       // Duties dutyfirst = new Duties("");
       // ArrayList<Duties> firstDuty = new ArrayList<Duties>();

       // ArrayList<String> dutyy = new ArrayList<String>();
        ArrayList<String> duties =new ArrayList<String>();
        String addExperience;


        do {
            Exprience exprience1 = new Exprience();
            System.out.println("Please Enter your Experiences inside the company !");
            System.out.println("Please Enter the position !");
            String position = input.nextLine();
            exprience1.setPosition(position);
            System.out.println("Please Enter the name of the company !");
            String company = input.nextLine();
            exprience1.setCompany(company);
            System.out.println("Please Enter the duration of your stay in the company !");
            String duration = input.nextLine();
            exprience1.setDuration(duration);

            Duties duty1 = new Duties();
            System.out.println("Please Enter your duties in the company ");
            String duty = input.nextLine();
            duty1.setDuty(duty);
            exprience1.addDuties(duty1);
            boolean check3 = true;

            while (check3) {
                System.out.println("Do you have more duties in the company ?");
                String addDuty = input.nextLine();
                if(addDuty.equalsIgnoreCase("yes")){
                    Duties duty2 = new Duties();
                    System.out.println("Please Enter your other duties in the company ");
                    duty =input.nextLine();
                    duty2.setDuty(duty);
                    exprience1.addDuties(duty2);

                } else {
                    System.out.println("Thank You for entering your duties !");
                    check3 = false;
                }
            }

            System.out.println("Do you have more Experience ? if so please type yes ");
            addExperience = input.nextLine();
            person.addExprience(exprience1);
        }while(addExperience.equalsIgnoreCase("yes"));

        ArrayList<Exprience> perExperience= person.getPastExpriences();

        System.out.printf("\nThe number of Experience you entered will be : %s \n\n",perExperience.size());


      /*  System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println("\nExperience Output:\n");

        for(int i =0;i<perExperience.size();i++) {
            // System.out.printf("\nThe number of duties you entered in the companies will be  : %s \n",perExperience.get(i).getMyDuties().size());
            System.out.printf("%s, \n", perExperience.get(i).getPosition());
            System.out.printf("%s ,in %s \n", perExperience.get(i).getCompany(), perExperience.get(i).getDuration());
            for (int j = 0; j < perExperience.get(i).getMyDuties().size(); j++) {
                System.out.printf("- Duty %d, %s \n", j+1, perExperience.get(i).getMyDuties().get(j).getDuty());
            }

        }*/

        // Skills Section **********************************************************************************************************************

        String addSkill;

        do{
            SkillsGained skill = new SkillsGained();
            System.out.println("Please Enter the skills you have and its level !");
            System.out.println("Enter your skill ");
            String skill1 = input.nextLine();
            skill.setSkill(skill1);
            System.out.println("eneter the level ");
            String level = input.nextLine();
            skill.setLevel(level);
            person.addSkills(skill);

            System.out.println("Do you have more skills ?");
            addSkill = input.nextLine();

        }while(addSkill.equalsIgnoreCase("yes"));


        // To display the output of skills entered

        ArrayList<SkillsGained> perSkills = person.getMySkills();


        // The output of Experience and the Skills

        System.out.println("=====================================================================================\n");

        System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println("\nEducation:");

        for(int i =0;i<perEducation.size();i++) {
            // System.out.printf("The " +i+1 " educational background of %s is %s ", person.getName(), person.getSizeofPersonalInfo());
            System.out.printf("%s, \n", perEducation.get(i).getStream());
            System.out.printf("%s University,in %s \n\n", perEducation.get(i).getUniversity(),perEducation.get(i).getYear());

        }


        System.out.println("\nExperience:");

        for(int i =0;i<perExperience.size();i++) {
            // System.out.printf("\nThe number of duties you entered in the companies will be  : %s \n",perExperience.get(i).getMyDuties().size());
            System.out.printf("%s \n", perExperience.get(i).getPosition());
            System.out.printf("%s ,in %s \n", perExperience.get(i).getCompany(), perExperience.get(i).getDuration());
            for (int j = 0; j < perExperience.get(i).getMyDuties().size(); j++) {
                System.out.printf("- Duty %d, %s \n", j+1, perExperience.get(i).getMyDuties().get(j).getDuty());
            }

        }

        System.out.println("\nSkills");

        for(int i=0;i<perSkills.size();i++){
            System.out.printf("%s ,%s \n", perSkills.get(i).getSkill(),perSkills.get(i).getLevel());
        }


    }

}
