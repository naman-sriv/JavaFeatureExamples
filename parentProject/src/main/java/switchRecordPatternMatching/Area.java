package switchRecordPatternMatching;

public class Area{

    public Double getArea(Shape s){

        return switch(s){
            case Circle(double r) -> Math.PI*r*r;
            case Rectangle(double w, double h) -> w*h;
            default -> throw new IllegalArgumentException("Unknown Shape Type :"+s.getClass().getName());
        };
    }

    public static void main(String[] args){

        Area ar = new Area();
        System.out.println(ar.getArea(new Circle(5.2)));
        System.out.println(ar.getArea(new Rectangle(10,20)));

    }
}
