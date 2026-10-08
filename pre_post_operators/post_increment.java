package pre_post_operators;

public class post_increment {
    public static void main(String[] args) {
        int x = 10; // store the value of x = 10
        int y = x++; // in y we store the x value and after store increase the value of x by 1
                     // because we use post increment

        System.out.println("The value of x is : " + x); // print x = 11
        System.out.println("The value of y is : " + y); // print y = 10
    }
}
