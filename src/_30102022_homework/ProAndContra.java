package _30102022_homework;

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
        if (taxFree1>taxFree2)
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


    public static void main(String[] args) {
        System.out.println(maxFinder(67, 87));
        theWarning();
        System.out.println(getTax(15,25));
        ProAndContra proAndContra = new ProAndContra();
        proAndContra.constructSentence("Angela Merkel");
        proAndContra.constructSentence("Angela Merkel", "сказала");
    }


}
