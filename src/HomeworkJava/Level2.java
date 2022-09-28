package HomeworkJava;

public class Level2 {


    static int nam1 = 10;
    static int nam2 = 23;
    static int nam3 = 4;



    public static int returnResult(int a, int b, int c){
        return (a * b * c);
    }



    public static void main(String[] args) {
        System.out.println(returnResult(nam1, nam2, nam3));
        Level2 second1 = new Level2();
        second1.returnResult(567,5, 0);
        System.out.println(second1);

    }

}
