import java.util.Scanner;
class wage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day");
        int d=sc.nextInt();
        System.out.println("enter no of hours worked:");
        int h=sc.nextInt();
        int wage=switch(d){
            case 1,2,3->200;
            case 4,5->400;
            case 6->600;
            case 7->800;
            default->0;
        };
        int totalwork=h*wage;
        if(totalwork>2000){
            totalwork*=1.10;
                    System.out.println("oh you got bonus!!!"+totalwork);
        }
        else{
            System.out.println("your salary is: "+totalwork);
        }
    }
}
