package Lesson4;

public class text {
    public static void main(String[] args) {

        String text = ("SALAM VSEM SALAM KAK VI?");
        String text1=("");

        //Text lengt
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text1.length());

        //True/false
        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());

        char symbol = text.charAt(2);
        System.out.println(symbol);

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(6));
        System.out.println(text.charAt(2));

        String subText = text.substring(5,10);
        System.out.println(subText + " "+ subText.length());



    }
}
