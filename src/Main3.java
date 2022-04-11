public class Main3 {
    public static void main(String[] args) {
        int i = 0;

        System.out.println(i++); // i = 1
        System.out.println(++i); // i = 2
        System.out.println(i--); // i = 1
        System.out.println(--i); // i = 0

        int age = 10;

        System.out.println(age);

        String[] names = new String[10];

        /*names[0] = "sdfgh";
        names[1] = "dfgh";
        names[2] = "dfgh";
        names[3] = "dfgh";
        names[4] = "dfgh";
        names[5] = "dfgh";
        names[6] = "dfgh";
        names[7] = "dfgh";
        names[8] = "dfgh";
        names[9] = "Janusz";*/

        System.out.println(names[3]);

        int y = 15;
        int[] liczby = new int[y];

        double[] inneLiczby = new double[50];

        System.out.println(liczby[5]);
        System.out.println(liczby[10]);
        System.out.println(liczby[0]);
        System.out.println(liczby[13]);

        char[] znaki = new char[10];

        System.out.println(names[0]);

        String x = "";

        int[][] tab = new int[10][10];

        tab[2][5] = 10;

        int[] innerTab = tab[7];

        int[][][] tab3D = new int[1][5][10];
    }
}
