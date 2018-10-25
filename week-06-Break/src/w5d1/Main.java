package w5d1;


import java.util.ArrayList;
        import java.util.List;

public class Main {

    public int getIndex(List list, Object itemToSearchFor) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i) != null && list.get(i).equals(itemToSearchFor))
                        || (list.get(i) == null && itemToSearchFor == null)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
