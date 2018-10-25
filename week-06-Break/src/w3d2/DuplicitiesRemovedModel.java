package w3d2;

public class DuplicitiesRemovedModel {

    public static void main(String[] args) {

        String line = "TThhee  ZZeenn  ooff  PPyytthhoonn";

        StringBuilder sb = new StringBuilder(line);
        for (int j = 0; j < sb.length() - 1; j++) {

            if (sb.charAt(j) == sb.charAt(j + 1)) {
                sb.deleteCharAt(j);
                j--;
            }
        }

        System.out.println(sb.toString());


    }


}
