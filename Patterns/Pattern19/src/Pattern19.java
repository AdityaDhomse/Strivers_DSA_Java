
public class Pattern19 {

    public static void main(String[] args) {

        /*
        * * * * * * * * * *
        * * * *     * * * *
        * * *         * * * 
        * *             * * 
        *                 *
        *                 * 
        * *             * *
        * * *         * * * 
        * * * *     * * * * 
        * * * * * * * * * * 
         */
        int n = 5;
        int iniS = 0;

        for (int i = 1; i <= n; i++) {

            //stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }

            //space
            for (int j = 1; j <= iniS; j++) {
                System.out.print("   ");
            }

            //stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }
            iniS += 2;

            System.out.println();
        }

        iniS = 2 * n - 2;

        for (int i = 1; i <= n; i++) {

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            //space
            for (int j = 1; j <= iniS; j++) {
                System.out.print("   ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            iniS -= 2;

            System.out.println();
        }

    }
}
