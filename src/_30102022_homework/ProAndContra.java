package _30102022_homework;

import java.util.Random;

public class ProAndContra {
    public static int maxFinder(int a, int b) {
        int max;

        if (a < b)
            max = b;
        else {
            max = a;
        }
        return max;
    }

    static void theWarning() {
        System.out.println("Мне все это надо? Надо");
    }

    public static int getTax(int taxFree1, int taxFree2) {
        int tax;
        if (taxFree1 > taxFree2)
            tax = taxFree1;
        else {
            tax = taxFree2;
        }
        return tax;
    }

    public String constructSentence(String name) {
        String resultSentence = "Какая планета третья от Солнца? " + name;
        System.out.println(resultSentence);
        return resultSentence;
    }

    protected String constructSentence(String firstName, String secondName) {
        String resultSentence = "Какая планетатретья от Солнца? " + firstName + "Не знаю " + secondName;
        System.out.println(resultSentence);
        return resultSentence;
    }

    public static int[] getSum(int[] nam1, int[] nam2) {
        return new int[0];
    }

    public static class HelloWorld {

        private int number = 2;
    }

    public static class GameOver {
        int timeout = 23;
        int max = 12;

        public GameOver() {
            this.timeout = timeout;
            this.max = max;
            this.min = min;
        }

        public int getA() {
            return A;
        }

        public void setA(int a) {
            A = a;
        }

        public int getB() {
            return B;
        }

        public void setB(int b) {
            B = b;
        }

        int min = 00;
        int A = min - max;

        int B = min / max;

    }


    public static void main(String[] args) {
        System.out.println(maxFinder(67, 87));
        theWarning();
        System.out.println(getTax(15, 25));
        ProAndContra proAndContra = new ProAndContra();
        proAndContra.constructSentence("Angela Merkel");
        proAndContra.constructSentence("Angela Merkel", "сказала");
        HelloWorld object = new HelloWorld();
        System.out.println(object.number);

        GameOver time = new GameOver();
        System.out.println(time.timeout);
        GameOver lastname = new GameOver();
        System.out.println(lastname.A);
        GameOver finish = new GameOver();
        System.out.println(finish.B);

        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);

            System.out.println("1-ое случайное число: " + new Random());
            System.out.println("2-ое случайное число: " + new Random());
            System.out.println("3-е случайное число: " + new Random());


//int nextInt(int n) - возвращает следующее случайное значение типа int в диапазоне от 0 до n
//int nextInt() - возвращает следующее случайное значение типа int


        }
    }


}



