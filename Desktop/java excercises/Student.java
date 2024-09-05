public class Student {
    int Admno;
    String Name;
    int feepaid;
    String course;
    private static final int fee1=12000;
    private static final int fee2=10000;
    public Student(int Admno, String Name, int feepaid, String course) {
        this.Admno =Admno;
        this.Name = Name;
        this.feepaid =0;
        this.course = course;
    }
    Student(int Admno,String Name){
        this.Admno = Admno;
        this.Name = Name;
     }
     public int payment(int amount){
         feepaid = feepaid+amount;
         return feepaid;
     }
     public int getTotalpayment(){
        return course.equals("java")?fee1:fee2;
     }
        public int getDue(){
            return getTotalpayment()-feepaid;
        }
        public int getfeepaid(){
            return feepaid;
        }
        public String getcoursename(){
            return course;
        }
    }
    class StudentMain{
        public static void main(String[] args) {
            Student s=new Student(504,"Gani Lakshmi",500,"python");
            System.out.println("payment is:"+s.payment(5000));
            System.out.println("Total Payment: "+s.getTotalpayment());
            System.out.println("Due: "+s.getDue());
            System.out.println("Fee Paid: "+s.getfeepaid());
            System.out.println("Course Name: "+s.getcoursename());
        }
    }
