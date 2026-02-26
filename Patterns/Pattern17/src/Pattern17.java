
public class Pattern17 {

    public static void main(String[] args) {

        /*
              A
            A B A
          A B C B A 
        A B C D C B A 
         */
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // space 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // characters
            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + ch + " ");
                if (j <= breakpoint) {
                    ch++; 
                }else {
                    ch--;
                }
            }

            // space 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            System.out.println();

        }

    }
}
