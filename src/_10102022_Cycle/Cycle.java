package _10102022_Cycle;

public class Cycle {

            public static void main(String[] args) {
                // Посчитать средний возраст в группе
                int[] years = {42, 27, 35, 29, 51};

                testForeach(years);

                testFor(years);

                testWhile(years);
            }

            private static void testWhile(int[] years) {
                double sum = 0; // суммарное количество лет в группе
                int i = 0;
                while (i < years.length) {
                    int year = years[i];
                    sum += year;
                    i++;
                }
                System.out.println("[while] Среднее арифмитическое возраста = " + (sum / years.length));
            }

            private static void testFor(int[] years) {
                double sum = 0;
                for (int i = 0; i < years.length; i++) {
                    int year = years[i];
                    sum += year;
                }
                System.out.println("[For] Среднее арифмитическое возраста = " + (sum / years.length));
            }

            private static void testForeach(int[] years) {
                double sum = 0; // суммарное количество лет в группе

                for (int year: years) {
                    sum += year;
                }
                System.out.println("[Foreach] Среднее арифмитическое возраста = " + (sum / years.length));
            }


}
