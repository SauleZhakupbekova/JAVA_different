package L13_CollectionSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Sort implements ISort{

    @Override
    public void printSortByDiameterAsc(TreeSet<Coin> coins) {
        //create new TreeSet and transfer all coins from first TreeSet to second TreeSet
        //insight TreeSet we have empty constructor which use method Sort by default.
        //But we can change constructor if we add object implementing interface Comparator in new TreeSet
        // and there create new way of sorting. For this aim we create new Class SortByDiameterAsc
        //(new SortByDiameterAsc()) - new means that I intend to create new Object


        TreeSet<Coin> sorted = new TreeSet<>(new SortByDiameterAsc());
        sorted.addAll(coins);
        for(Coin coin:sorted){
            System.out.println(coin);
        }
    }

    @Override
    public void printSortByDiameterDsc(TreeSet<Coin> coins) {
        // copied from Ascending
        //new TreeSet<>(new Comparator<Coin>() - we create object without name (because interface Comparator cannot have object).
        // new Comparator<Coin>{...} - internal nameless class
        
        TreeSet<Coin> sorted = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o2.getDiameter() != o1.getDiameter()) {
                    return Double.compare(o2.getDiameter(), o1.getDiameter()); //for type Double we have method "Compare" from Util module
                }

                if(o2.getYear() != o1.getYear()){
                    return o2.getYear() - o1.getYear();
                }

                if(o2.getNominal() != o1.getNominal()) {
                    return o2.getYear() - o1.getYear();
                }

                if(o2.getMetal().equals(o1.getMetal())) {
                    return o2.getMetal().compareTo(o1.getMetal()); // for Type String we don't have method "CompareTo" but for object "this.getMetal" we have it.
                }
                return 0;
            }

    });
        sorted.addAll(coins);
        for (Coin coin : sorted) {
            System.out.println(coin);
        }
    }
    @Override
    public void printSortByNominalAsc(TreeSet<Coin> coins) {

    }

    @Override
    public void printSortByNominalDsc(TreeSet<Coin> coins) {

    }

    @Override
    public void printSortByMetal(TreeSet<Coin> coins) {

    }
}
