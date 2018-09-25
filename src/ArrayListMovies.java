import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMovies {

    public static void main(String[] args){


        ArrayList<String> movies = new ArrayList<String>();
       // ArrayList<String> sorted = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        boolean check =true;


        System.out.println("Please Enter Your  Favourite Movies and when you are done press the Enter button : ");

        while(check) {

            String title= input.nextLine();
            if(!title.isEmpty()) {
                movies.add(title);
            }
            else{
                System.out.println("Thank You for your input Good Bye !");
                check =false;

            }

        }

        System.out.println("The List of Your favourite Movies will be:");

        for (String list : movies) {
            System.out.println(list);
        }

        Collections.sort(movies);

        System.out.println("the sorted Movies will be : " + movies);


        //  ArrayList<String> name = new ArrayList<String>();
        //  ArrayList<String> email = new ArrayList<String>();
       /* ArrayList<EducationalBack> education = new ArrayList<>();
        ArrayList<String> exprience = new ArrayList<String>();
        boolean check = true;

        Scanner input = new Scanner(System.in);

        Personallnfo person1 = new Personallnfo();

        System.out.print("Please Enter Your First name and Last name: ");
        String name1 = input.nextLine();
        person1.setName(name1);
        // person1.setName("Semeneh M. Hailemariam");
        System.out.println("name you have enetered : "+person1.getName());
        System.out.print("Please Enter Your email: ");
        String email1 = input.nextLine();
        person1.setName(email1);
        //person1.setEmail("smewled2012@gmail.com");
        System.out.println("Email you have Enetered : "+person1.getEmail());

        // Entering the educational background

        EducationalBack education1 = new EducationalBack("","", 2010);
        System.out.println("Please Enter Your Educational Background !");
        //education1.setEducation("BS in Electrical and Computer Engineering, \n University of Hawassa , 2010");
        String edu = input.nextLine();
        education1.setStream(edu);
        // education.add(education1);
       // education.add(education1);
       person1.addEducation(education1);
        System.out.println("the educational background you have Enetered : "+education1.getStream());


       // ResumeInformation();
*/

        /*System.out.println("Name: "+ person1.getName() +"\nEmail: "+ person1.getEmail()+ "\n");
        Exprience exprience1=new Exprience();

        System.out.println("Please Enter Your Working Exprience !");
        String pos = input.nextLine();
        System.out.println("Eneter the position: ");
        exprience1.setPosition(pos);

        System.out.println("the working Exprience you have Enetered : "+exprience1.getPosition());*/


        // System.out.println("The personal information: "+ person1.toString());

        //Personallnfo person1=new Personallnfo("Semeneh Hailemariam","smewled@gmail.com");
        //EducationalBack education1 = new EducationalBack("Electrical Engineering ","University of Hawassa", 2010);
        //person1.addEducation(education1);

        //System.out.println("The person Information: \nName : "+person1.getName()+"\nEmail: "+person1.getEmail()+ "\nEducation Background :" + person1.);

        //  System.out.println(person1.toString());



    }
}
