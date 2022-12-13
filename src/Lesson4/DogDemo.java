package Lesson4;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class DogDemo {
    public static void main(String[] args) {

       dog myDog = new dog();

           myDog.name="Emma";
           myDog.age=3;
           myDog.breed="German";

        myDog.voice("GAV!");

        myDog.age= myDog.age+1;

        System.out.println(myDog);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Dog name - ");
        String dogName= scanner.nextLine();

        System.out.println("Dog breed - ");
        String dogBreed= scanner.nextLine();

        System.out.println("Dog age - ");
        int dogAge= scanner.nextInt();

        dog myDog5 = new dog(dogName,dogBreed,dogAge);
        System.out.println(myDog5);












    }

}
