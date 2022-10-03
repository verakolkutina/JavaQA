package homeworkJava;

import java.util.Scanner;

public class Homework3 {

    public static int getPlay(int window1, int window2 ) {
        return window1 + window2;
    }

    static double getRosa( double rosa1, double rosa2) {
        return rosa1 + rosa2;
    }

    public static void getDiscountPrice(int g1, int g2){
        System.out.println(g1/0.1);
        System.out.println(g2/0.2);
    }

    public static int getSum(int ... s) {
        System.out.println(78);
        return 0;
    }

    public static int getBank(int q1, int q2, int q3) {
        return q1/q2*q3;
    }

    public static boolean hasLuckyNumber(int luckyNumber, int min, int max ) {
        min = 20;
        max = 80;

        if (luckyNumber > min || luckyNumber < max) {
            System.out.println("Unfortunately, no prize");
            System.out.println("You've got a prize!");
        }
        return true;
    }
    static double getSum(double a, double b) {
        return a + b;
    }

    public static char myLetter(char D){
        return D;
    }

    public static void getStatistic(int Body) {
        System.out.println(90);
    }

    public static boolean getResult(boolean isJavaFun) {
        return false;
    }

    public static char myGrade(char B) {
        return B;
    }

    public static int getMultiplies(int a, int b){
        return a * b;
    }

    public static int getDivides(int y, int n){
        return y / n;
    }

    public static int getReturn(int p1, int p2) {
        return p1 % p2;
    }

    public static int getSum(int x1, int y1, int z1) {
        x1 = y1 = z1 = 50;
        return x1 + y1 + z1;
    }

    public static int dateTomorrow(int date) {
        return 3;
    }

    public static int getResult(int r, int r2, int r3) {
        return 03102022;
    }


    public static void main(String[] args) {

            System.out.println(getPlay(1, 0));

            System.out.println(getRosa(534, 987));

            getDiscountPrice(25, 28);

            getSum(78);

            System.out.println(getBank(4, 2, 1));

            hasLuckyNumber(45, 34, 89);
            hasLuckyNumber(89, 56, 98);
            hasLuckyNumber(98, 34, 78);

        System.out.println(getSum(7, 90));

        System.out.println(myLetter((char) 5.7));

        getStatistic(90);

        System.out.println(getResult(false));

        System.out.println(myGrade((char) 90));

        String greeting = "Hello World";
        System.out.println(greeting);

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        System.out.println(getMultiplies(89, 97));
        System.out.println(getDivides(7, 98));
        System.out.println(getReturn(64, 45));

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        char myLetter = 'D';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        String myText = "I don't understand";
        System.out.println(myText);

        System.out.println(getSum(23, 35, 98));

        System.out.println(dateTomorrow(3));

        System.out.println(getResult(03, 10, 2022));


            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();
            System.out.print("Input age: ");
            int age = in.nextInt();
            System.out.print("Input height: ");
            float height = in.nextFloat();
            System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);




    }

    }



