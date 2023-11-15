import java.io.*;
 
class swapping {
 
    public static void main(String a[])
    {
        int x = 15;
        int y = 9;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }
}
 