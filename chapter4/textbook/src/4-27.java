class Ex4_27 {

    public static void main(String[] args) {

        int [][] arr = {{1, 2, 3, 4}, {3, 2}, {4, 6, 1}};                     

        System.out.println(arr.length); // 3
        System.out.println(arr[0].length); // 4
        System.out.println(arr[1].length); // 2
        System.out.println(arr[2].length); // 3
        System.out.println(arr[arr[0][1]][2]); // 1
        System.out.println(arr[2][1]++); // 6 I'm not sure if the actual value will be incremented or not
        System.out.println(arr[2][1]); // probably incremented to 7

    }

}
