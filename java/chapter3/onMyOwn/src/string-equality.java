class StringEquality {
    public static void main(String args[]) {
        String str1 = "Here is a string";
        String str2 = "Here is a string";

        String s1 = new String("Here is a string");
        String s2 = new String("Here is a string");

        // if (str1.equals(str2)) {
        //     System.out.println("They are equal!");
        // }     

        if (str1 == str2) System.out.println("str1 == str2 works");
        if (str1.equals(str2)) System.out.println("only str1.equals(str2) works");

        if (s1 == s2) System.out.println("s1 == s2 works");
        if (s1.equals(s2)) System.out.println("only s1.equals(s2) works");
    }
}
