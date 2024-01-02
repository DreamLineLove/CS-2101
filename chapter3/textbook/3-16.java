class Ex3_16 {

    public static void main(String[] args) {

        int i = 10, j = 20, k = 7;

        System.out.println(k / i - j);
        System.out.println(i / (double)j);
        System.out.println(i % (j + k));
        System.out.println(i++ - --k);
        System.out.println(i);
        k = ++j * 3 % 5;
        System.out.println(j);
        System.out.println(k);
        
    }

}
