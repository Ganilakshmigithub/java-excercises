public class Student2 {
    String name;
    int rollno;
    static String course="B.Tech";
    static int coursefee=50000;
    public Student2(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Course: "+course);
        System.out.println("Course Fee: "+coursefee);
    }
    public static void main(String[] args) {
        Student2 s1 = new Student2("John", 101);
        Student2 s2=new Student2("Smith", 102);
        s1.display();
        s2.display();

    }
}
