class StringEquality {
    public static void main(String args[]) {
        String str1 = "Here is a string";
        String str2 = "Here is a string";

        String s1 = new String("Here is a string");
        String s2 = new String("Here is a string");

        if (str1 == str2) System.out.println("str1 == str2 works");
        if (str1.equals(str2)) System.out.println("only str1.equals(str2) works");

        if (s1 == s2) System.out.println("s1 == s2 works");
        if (s1.equals(s2)) System.out.println("only s1.equals(s2) works");

        String st1 = "Hello";
        String st2 = "Hello";

        if (st1 == st2) System.out.println("st1 == st2 works");

        st2 = "World";
        String st3 = "World";

        if (st2 == st3) System.out.println("st2 == st3 works");

        /*
         * Equality operator in java allegedly checks for equality of the object
         * represented in memory.
         *
         * Java "interns" str1 and str2 in the same string pool, so when "==" 
         * makes the check, it finds that both variables are pointing to the 
         * same memory location.
         *
         * On the other hand, creating a string using "new" allocates the contents
         * of the string in a new location, even though it might be a duplicate of
         * the contents of another string variable.
         */

    }
}
