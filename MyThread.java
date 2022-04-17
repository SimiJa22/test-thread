public class MyThread extends Thread{
  public void run(){
    System.out.print("MyThread");
     }
public static void main(String[] args){
MyThread obj=new MyThread();
obj.start();
}
}