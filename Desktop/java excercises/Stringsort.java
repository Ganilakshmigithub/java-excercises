import java.util.Arrays;
import java.util.Scanner;
class Stringsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of strings ");
        int s=sc.nextInt();
        System.out.println("enter strings: ");
        String words[]=new String[s];
        for(int i=0;i<s;i++){
            words[i]=sc.nextLine();
        }     
        Arrays.sort(words);
        for(String w:words){
            System.out.print(w+" ");
        }
    }
}