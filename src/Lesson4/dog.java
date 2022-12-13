package Lesson4;

public class dog {

    String name;
    String breed;
    int age;

    public dog() {

    }

    public dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void voice (String voice){

    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
