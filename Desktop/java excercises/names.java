public class names {
    String name;
    public names(String name){
        this.name = name;
    }
    void print(){
        System.out.println(name);
    }
}

class List extends names{
    int age;
 public List(String name,int age){
    super(name);
    this.age = age;
 }
void print(){
    super.print();
    System.out.println(name + " " + age);
}

}
class Main{
    public static void main(String[] args) {
        List l = new List("Rahul", 20);
        l.print();
    }
}
