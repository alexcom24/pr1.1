import java.lang.*;
public class main {
public static void main (String[] args) {
    Ball b1 = new Ball (4,"Red");
    Ball b2 = new Ball (7,"Brown");
    Ball b3 = new Ball (5);
    b3.setColor("Blue");
    System.out.println(b2);
    System.out.println(b1.Obyem());
    System.out.println(b2.Obyem());
    System.out.println(b3.Obyem());
}
}
