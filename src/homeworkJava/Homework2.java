package homeworkJava;

public class Homework2 {


    static int getSum(int a, int b) {
        return a + b;
    }

    static int getResult(int num1){
        return num1;
    }

    public static void getMultiply(float w, float q){
        float multiply = w * q;
        System.out.println(multiply);
    }

    static double getCollect(double price1){
        return price1 / 3;

    }

    static void getDivide(short q, short q1){
        float divide = q / q1 ;
        System.out.println(divide);
    }





    public static void main(String[] args) {
        System.out.println(getSum(22,33));
        System.out.println(getResult(76));
        getMultiply(32.4f, 46.8f);
        System.out.println(getCollect(8));
        getDivide((short) 2, (short) 8);

    }

}
