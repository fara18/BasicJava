package Lesson3;

public class lesson3 {
    public static void main(String[] args) {

// Дано трехзначное число. Вывести на экран все цифры этого числа по одной
        int all = 432;
        System.out.println("third number-"+ all%10);
        System.out.println("second number-"+ all/10%10);
        System.out.println("first number-"+ all/100);



        // lesson 3
        int a = 10;
        int b = 15;
        int a1 = 10;
        int b1 = 15;
        int a2 = 10;
        int b2= 15;

        int result = summ(a,b);
    }

public static int summ (int x, int y) {
       int summ = x+y;
       return summ;

}
   // public void static void printText ()
}