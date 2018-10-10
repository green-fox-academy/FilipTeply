public class Anagram {


    String str1 = "dada";
    String str2 = "adda";





    public boolean isAnagram(String str1, String str2) {

        String tempstr2 = str2;

        str1.


        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == tempstr2.charAt(j)) {
                        tempstr2 = tempstr2.replace(tempstr2.charAt(j), '');

                    }
                    else {continue;}

                }
                return true;
            }
            return true;
        }
    }
}
