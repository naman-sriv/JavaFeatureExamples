package records;

import java.util.Scanner;

public class RecordUsage {

    public record Point(int a, int b) {}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Point obj = new Point(a,b);

        System.out.println(obj.toString());

    }
}
