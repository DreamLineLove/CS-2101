class Chap4LettersArray {

    public static void main(String argv[]) {

        String s = "the quick brown fox jumps over the lazy dog and the ";
        s = s + "lazy dog got up and barked at the quick brown fox";
        int occurrences[] = new int[26];
        char line[] = new char[100];
        int i = 0;
        int j = 0;

        for (i = 0; i < s.length; i++) {
            if (s.charAt(i) != ' ') {
                line[j] = s.charAt(i);
                j++;
            }
        }

        for (i = 0; i < j; i++) {
            occurrences[line[i] - 'a']++;
        }

        System.out.println("\nThe line without spaces is:");
        for (i = 0; i < j; i++) {
            System.out.println(line[i]);
        }
        System.out.println();
        System.out.println("Total number of letters = " + j);

        for (i = 0; i < 26; i++) {
            System.out.println((char)(i + 'a') + " " + occurrences[i]);
        }

    }

}
