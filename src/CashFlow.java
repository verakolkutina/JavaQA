public class CashFlow {
//     Задача: написать алгоритм, который из разных сумм подсчитывает минимальное количество монет для сдачи.
//     Монеты есть только номиналом: 25, 10, 5, 1 цент.

    public static int dropCash(int many) {
        int many1 = 0;


        while (many != 0) {
            if (many >= 25) {
                many = many - 25;
            } else if (many >= 10) {
                many = many - 10;
            } else if (many >= 5) {
                many = many - 5;
            } else if (many >= 1)
                many = many - 1;
            many1++;


        }
        return many1;
    }


    public static void main(String[] args) {
        int[] test =  {-1, 0, 1, 4, 5, 24, 25, 26, 99};
        for (int test_number : test) {
            System.out.println(dropCash(test_number));
            System.out.println();
        }
    }

}
