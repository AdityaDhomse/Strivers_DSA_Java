public class Pattern15 {
    public static void main(String[] args) {

        /*
        A B C D E
        A B C D
        A B C
        A B
        A
        */

        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
