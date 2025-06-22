package textblock;

import java.util.Scanner;

public class TextBlock {

    String name;
    String age;
    String status;

    public TextBlock() {}

    public TextBlock(String name,String age, String status){
        this.age=age;
        this.name=name;
        this.status=status;
    }

    @Override
    public String toString(){

        String jsonTemplate = """
                {
                    "name" : "%s",
                    "age" : "%s",
                    "status" : "%s",
                }
                """;

        return new String(String.valueOf(System.out.printf(jsonTemplate,name,age,status)));


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, age and student status");
        String name = sc.nextLine();
        String age = sc.nextLine();
        String studentStatus = sc.nextLine();

        TextBlock obj = new TextBlock(name,age,studentStatus);
        System.out.println(obj.toString());
    }
}
