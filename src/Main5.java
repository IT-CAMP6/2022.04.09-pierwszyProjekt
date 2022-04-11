public class Main5 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("Cos innego");
        }

        System.out.println("Jakieś czynnosci po pętli");

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j <10; j++) {
                System.out.println("cos");
            }
        }

        int[] tab = new int[5];

        tab[0] = 5;
        tab[1] = 10;
        tab[2] = 15;
        tab[3] = 20;
        tab[4] = 25;

        for(int element : tab) {
            int result = element * element;
            System.out.println(result);
        }

        int counter = 0;
        while (counter != 35) {
            System.out.println("Pętla się kręci !!");
            System.out.println(counter);
            counter++;
        }


        int counter2 = 0;
        do {
            System.out.println("Pętla się kręci !!");
            System.out.println(counter2);
            counter2++;
        } while (counter2 < 35);


        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
