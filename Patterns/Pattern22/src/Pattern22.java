
public class Pattern22 {

    public static void main(String[] args) {

        /*
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4 
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4 
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4
         */
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                int top = i;
                int left = j;
                int bottom = size - i + 1;
                int right = size - j + 1;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print((n - min + 1) + " ");
            }
            System.out.println();
        }
    }
}
