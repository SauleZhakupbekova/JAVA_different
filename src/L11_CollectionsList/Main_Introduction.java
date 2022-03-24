package L11_CollectionsList;

//Java.Util - Collections --> Interface Set and Interface List
// Collection - non-dimensional Array
// Collections Set - no indexes, Lists -has indexes
// Collections Set - no duplicates, Lists - keep duplicates
// Collections Set - no order, Lists - has order
// ArrayList is realization of interface List

// Interface of List: ArrayList and LinkedList
// ArrayList -


import java.util.LinkedList;

public class Main_Introduction {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();
        texts.add("qqq");
        texts.add("ooo");
        texts.add(0,"!!!");
        texts.set(0, "QQQ"); // set - replace

        System.out.println(texts);
    }
}
