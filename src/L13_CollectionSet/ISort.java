package L13_CollectionSet;

import java.util.TreeSet;

public interface ISort {
   //abstract void method:
    void printSortByDiameterAsc(TreeSet<Coin> coins);

    void printSortByDiameterDsc(TreeSet<Coin> coins);

    void printSortByNominalAsc(TreeSet<Coin> coins);

    void printSortByNominalDsc(TreeSet<Coin> coins);

    void printSortByMetal(TreeSet<Coin> coins);
}
