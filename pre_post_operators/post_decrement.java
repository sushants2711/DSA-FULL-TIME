package pre_post_operators;

public class post_decrement {
    public static void main(String[] args) {
        int x = 10; // the value of x = 10
        int y = x--; // in y first we store the value of x that is the 10 and than subtract the value
                     // of x by 1 so the value is x-1 so that is 10 - 1 = 9 so the value of x = 9 and
                     // y = 10

        System.out.println(x); // x = 9
        System.out.println(y); // y = 10
    }
}
