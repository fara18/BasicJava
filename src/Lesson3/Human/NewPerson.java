package Lesson3.Human;

public class NewPerson {
    public static void main(String[] args) {

        Human person1 = new Human();

        person1.name="Fara";
        person1.age=20;
        person1.home="KG";

        Human person2 = new Human();
        person2.age = 19;
        person2.name = "Davlya";
        person2.home = "KG";

        Human person3 = new Human();
        person3.name = "Alish";
        person3.age = 20;
        person3.home = "KG";

        person1.greeting();


    }
}
