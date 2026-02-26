public class Pattern18 {
    public static void main(String[] args) {
         
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
        */

        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(char ch = (char) ('E' - i + 1); ch <= 'E'; ch++) {
                System.out.print(" " + ch + " ");
            }
            System.out.println();
        }
    }
}
