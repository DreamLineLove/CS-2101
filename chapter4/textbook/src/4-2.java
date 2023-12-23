class Ex4_2a {

    static void mysteryMethod(int testCase) {
    
        switch (testCase) {
            case 10: 
                System.out.println("case is 10");
                break;
            case 20:
                System.out.println("case is 20");
                break;
            default:
                System.out.println("case not 10 or 20");
        }

    }

}

class Ex4_2 {

    public static void main(String[] args) {

        Ex4_2a.mysteryMethod(10);              
        Ex4_2a.mysteryMethod(20);              
        Ex4_2a.mysteryMethod(99);              

    }

}
