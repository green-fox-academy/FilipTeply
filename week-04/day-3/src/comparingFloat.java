public class comparingFloat {

    public static void main(String[] args) {

        float f1 = 1;
        float f2 = 2;


        if (Float.compare(f1+f2, 3) == 0){
            System.out.println("Comparison1 works");
        }

        if (Math.abs(f1 - f2) < 0.000001){
            System.out.println("Comparison2 works");
        }

        if (f1 == f2) {
            System.out.println("Comparison3 works");
        }


    }

}
