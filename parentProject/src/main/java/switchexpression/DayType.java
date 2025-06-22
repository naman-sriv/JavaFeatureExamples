package switchexpression;

import java.util.Scanner;

public class DayType {

    public void getDayType(int dayOfWeek){

        switch(dayOfWeek){
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number between 1 and 7:");
        int dayNumber = sc.nextInt();

        DayType obj = new DayType();
        obj.getDayType(dayNumber);

    }
}
