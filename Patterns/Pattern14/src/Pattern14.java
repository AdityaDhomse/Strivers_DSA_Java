public class Pattern14 {
    public static void main(String[] args) {
        /*
        A
        AB
        ABC
        ABCD
        ABCDE
        */
    
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
