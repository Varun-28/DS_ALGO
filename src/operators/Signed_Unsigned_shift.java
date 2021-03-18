package operators;

public class Signed_Unsigned_shift {
    public static void main(String[] args){
        int a = 10;          int b = -4;        int c = 0;
        System.out.println("60  = " + Integer.toBinaryString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));

        //signed shift
        c = a >> 1;
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));
        System.out.println("60 >> 1  = " + c);

        //unsigned shift
        c = a >>> 2;
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );
        System.out.println("60 >>> 1  = " + c);

        c = b >> 1;
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );
        System.out.println("-60 >> 1  = " + c);

        c = b >>> 1;
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
        System.out.println("-60 >>> 1  = " + c);

    }
}
