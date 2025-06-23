package generics;

public class Example {

    public static void main(String[] args){

        Box<String> stringBox = new Box<>();
        stringBox.setData("Hello");
        System.out.println(stringBox.getData());

        Box<Integer> intBox = new Box<>();
        intBox.setData(5);
        System.out.println(intBox.getData());
    }
}
