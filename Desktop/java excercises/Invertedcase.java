import java.util.*;
class Invertedcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string :");
        String s=sc.nextLine();
        if(s.equals(s.toLowerCase())){
        String m=s.toUpperCase();
        System.out.print("inverted case: "+m);
        }
        else{
            String p=s.toLowerCase();
            System.out.print("inverted case: "+p);
        }
        }
}
