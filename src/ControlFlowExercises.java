public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i+" ");
//            i++;
//        }

//        int x = 0;
//        do {
//            System.out.println(x);
//            x+=2;
//        } while (x < 100);

//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);

//        int z = 2;
//        do {
//            System.out.println(z);
//            z = (int) Math.pow(z, 2);
//        } while (z < 1000000);

        for (int i = 5; i <= 15; i ++) {
            System.out.print(i+" ");
        }

        for (int x = 0; x < 100; x+=2) {
            System.out.println(x);
        }

        for (int y = 100; y >= -10; y-=5) {
            System.out.println(y);
        }

        for (int z = 2; z < 1000000; z = (int) Math.pow(z, 2)) {
            System.out.println(z);
        }

    }
}
