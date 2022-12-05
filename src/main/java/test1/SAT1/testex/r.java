package test1.SAT1.testex;

import java.lang.reflect.Parameter;

public class r {
    public static void main(String[] args) {
        int a=41;
        int b=10;
        boolean c;
        c= a>b;
        boolean d=c=true;
        boolean e=d=false;
        System.out.println(!(e));
        if (!e){
            System.out.println(e);
        }
    }
}
