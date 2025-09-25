package Homework5.Problem4;

import java.util.ArrayList;
public class MergeList {
    public static void main(String[] args) {
        ArrayList lst1 = new ArrayList<String>(3);
        lst1.add("Austin");
        lst1.add("Dallas");
        lst1.add("San Francisco");

        ArrayList lst2 = new ArrayList<String>(4);
        lst2.add("Boston");
        lst2.add("Chicago");
        lst2.add("Denver");
        lst2.add("Seattle");


        ArrayList mergedList = mergeList(lst1, lst2);
        System.out.print(mergedList);

    }

    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> mergedLst = new ArrayList<String>(lst1.size() + lst2.size());
        int i = 0;
        int j = 0;
        while(i < lst1.size() & j < lst2.size()) {
            if (lst1.get(i).compareTo(lst2.get(j)) <= 0) {
                mergedLst.add(lst1.get(i));
                i++;
            }
            else {
                mergedLst.add(lst2.get(j));
                j++;
            }
        }
        while (i < lst1.size()) {
            mergedLst.add(lst1.get(i));
            i++;
        }

        while (j < lst2.size()) {
            mergedLst.add(lst2.get(j));
            j++;
        }
        return mergedLst;
    }
}
