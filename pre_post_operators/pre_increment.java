package pre_post_operators;

public class pre_increment {
    public static void main(String[] args) {
        int x = 10; // it store the value inside x in 10
        int y = ++x; // first increase the value of x by 1 becasue we use the pre increment operators
                     // ++x and than use that value store inside the y becasue first increase and
                     // than store

        System.out.println("The value of x is : " + x); // print the x value comes 11
        System.out.println("The value of y is : " + y); // print the y value comes 11
    }
}
