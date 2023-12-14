class Ex3_9 {

    public static void main(String[] args) {
        
        int h = 2, i = 4, j = 8, k = 16;

        System.out.println((h * h * h) == (h << 2));
        System.out.println(~i << 1);
        System.out.println(~(~i >> 2));
        System.out.println(k >>> 1 == j);

    }

}
