class Ex4_25 {

    public static void main(String[] args) {

        char charArr[][] = {
            {'a', 'b', 'c', 'd', 'e'},
            {'a', 'b', 'c', 'd', 'e'},
            {'a', 'b', 'c', 'e', 'e'},
        };

        char ch = 'e';

        System.out.println("Count = " + countChar(charArr, ch));

    }

    static int countChar(char charArr[][], char ch) {
        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[0].length; j++) {
               if (charArr[i][j] == ch) count++;
            }
        }

        return count;
    }

}
