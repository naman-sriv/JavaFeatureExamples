package datatypeconversion;

import java.util.Scanner;

public class DataTypeConv {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        double a_conv = a;
        int b_conv = (int) b;

        try {
            int s_conv = Integer.parseInt(s);
            System.out.println(s_conv);
        }catch (NumberFormatException e){
            System.out.printf("message: %s", e.getMessage());
        }
        System.out.println(a_conv);
        System.out.println(b_conv);

    }
}
