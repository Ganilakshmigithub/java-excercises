interface shape{
    void Area();
    void circumference();
}
class Circle implements shape{
    int r=10;
    public void Area(){
        System.out.println("Circle Area is: "+Math.PI*r*r);
    }
    public void circumference(){
        System.out.println("Circle Circumference is: "+2*Math.PI*r);
    }
}
class Square implements shape{
    int s=4;
    public void Area(){
        System.out.println("Square Area is: "+s*s);
    }
    public void circumference(){
        System.out.println("Square Circumference is: "+4*s);
    }
}
public class shapes {
    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        c.Area();
        c.circumference();
        s.Area();
        s.circumference();
    }
}
