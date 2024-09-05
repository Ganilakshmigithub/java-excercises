import java.util.*;
class Spaceindex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string :");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.println("position of space is: "+i);
            }
        }
        }
}
