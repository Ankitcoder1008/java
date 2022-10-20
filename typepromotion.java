public class typepromotion {
    public static void main(String args[]) {
        /*java automatically promotes each byte,short,or char operand to int when evelauting an expression. */
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
         System.out.println((int)(b));
        System.out.println(b-a);

        /*if one operand is long , float or double the whole expression is promoted to long, float, or double respectively */

        int x = 10;
        float y = 20.25f;
        long z = 25;
        double d = 30;
        double ans = x + y + z + d;
        System.out.println(ans);


    }
    
}
