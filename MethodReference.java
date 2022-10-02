public class MethodReference {
    
   public static void multiplicn ()
    {
        int a=3;
        int b=2;
        int mul=a*b;
        System.out.println("Static method multiplication: "+mul);
    }
    void addsub()
    {
        int a=4;
        int b=7;
        int sum = a+b;
        int sub = a-b;
        System.out.println("Instance add method return sum: "+sum+" and returns substraction: "+sub);
    }
    public static void main(String[] args) {
    
    MethodReference methodrefer = new MethodReference();
//using (instance)method reference
 
Thread thread1=new Thread(methodrefer::addsub);
thread1.start();
//using (static)method reference
Thread thread2 = new Thread(methodrefer::multiplicn);
thread2.start();
   
    }
}

