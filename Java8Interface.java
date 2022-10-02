interface running{
default void run(){
System.out.println("Running");
}
}
interface walking{
default void walk(){
System.out.println("Walking");
}
}

public class Java8Interface implements running,walking{
public static void main(String[] args){
Java8Interface ji = new Java8Interface();
ji.walk();
ji.run();
}
}
