package w3d2;

public class TestASCIIEncoding {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {

            System.out.println(i + "=" + (char) (i));
        }


    }

}
