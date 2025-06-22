package patternmatching;

import java.util.Objects;
import java.util.Scanner;

public class BasedOnDT {

    public void processObject(Object obj){
        if(obj instanceof Integer){
            int a = ((Integer) obj).intValue();
            System.out.println("Integer squared :"+ (a*a));
        }else if(obj instanceof String){
            System.out.println(((String) obj).length());
        }else{
            System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args){

        String s = "Hello";
        int a = 10;

        BasedOnDT obj = new BasedOnDT();
        obj.processObject(a);
        obj.processObject(s);
        obj.processObject(new Object());

    }
}
