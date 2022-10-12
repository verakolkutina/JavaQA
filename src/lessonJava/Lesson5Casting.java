package lessonJava;

public class Lesson5Casting {
    // int -> byte
    int a = 4;
    byte p = (byte) a;


    // byte -> int
    byte b = 7;
    int d = b;


    // long -> short
    long l = 115;
    short sh = (short) l;

    //          char -> int
    char c = 'Y';
    int i = c;

    //          long -> byte
    long g = 115;
    byte by = (byte) l;

    //          float -> double
    float fl = 1.15f;
    double db = fl;

    //          double -> float
    double dl = 1.35d;
    float flt = (float) dl;

    //          long -> double
    long q = 123;
    double n = q;

    int nam1 = 2147483647;
    float m = nam1;
         System.out.println(nam1);   // почему пишет система Cannot resolve symbol 'println'  ? ошибка системы?

    byte с1 = 3;
    short с2 = 4;
   byte с3 = (byte)(с1+с2);     
    }

