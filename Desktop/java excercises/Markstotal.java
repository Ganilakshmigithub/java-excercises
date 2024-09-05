import java.util.Scanner;
class Markstotal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks seperated with commas:");
        String s=sc.nextLine();
        int total=0;
        String marks[]=s.split(",");
        for(String m:marks){
            int p=Integer.parseInt(m.trim());
            total+=p;
        }
        System.out.println("total of marks is: "+total);
        }
}