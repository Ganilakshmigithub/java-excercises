import java.util.Scanner;
class positive{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int nums[]={1,2,3,4,5,6,-23};
        double average=calavg(nums);
        System.out.println("avg of positive nums is: "+average);
    }
    public static double calavg(int[]arr){
        double sum=0;
        int count=0;
        double avg=0;
        for(int n:arr){
            if(n<0){
                break;
            }
            else{
                sum+=n;
                count++;
            }
        }
        if(count==0){
        System.out.println("no valid numbers");
        }
        else{
            avg=sum/count;
        }
        return avg;
    }
}
