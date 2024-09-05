public class methods {
    public void run() {
        System.out.println("Hello World");
    }
    public int add(int a,int b){
        return a+b;
    }
}
class main extends methods{
    public void run(){
        System.out.println("in running");
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        methods r=new main();
        main m=new main();
        r.run();
        System.out.println(r.add(10, 20));
        System.out.println(m.add(10, 20, 30));
    }
}