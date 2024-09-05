import java.util.Scanner;
class Newline{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=sc.nextLine();
        String words[]=s.split("\\s+");
        for(String w:words){
            System.out.println(w);
        }
    }
}