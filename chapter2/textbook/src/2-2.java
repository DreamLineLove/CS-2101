class Ex2_2 {
    public static void main(String argv[]) {
        // int x = 5 + 5.0f; // incompatible types: possible lossy conversion
        
        // double x = 5 + 5; // works: the decimal point is optional 
        
        // short x = 80000; 
        // 16-bit short can represent only up to 65536 different numbers.
        // This means half of that is in the positive direction and another half 
        // is in the negative direction.
        
        // short x = 80000 - 70000; // this is within the accepatable (+) range
        
        // boolean x = True; // should be "true" instead

        // double y = 5.5;
        // float x = y;
        // Double cannot be assigned directly to float. Must do casting.

        // float y = 5.5f;
        // double x = y;
        // Float can be assigned directly to double.
        
        // System.out.println(x);
    }
}
