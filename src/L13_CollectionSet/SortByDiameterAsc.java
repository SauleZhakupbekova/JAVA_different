package L13_CollectionSet;

import java.util.Comparator;
// we implements Interface Comparator but not Comparable because Comparable is used only
// if we are insight of Coin class but if we make comparing outside then we should use Comparator

public class SortByDiameterAsc implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        // o1 - first coin
        // o2 - second coin

        if(o1.getDiameter() != o2.getDiameter()) {
            return Double.compare(o1.getDiameter(), o2.getDiameter()); //for type Double we have method "Compare" from Util module
        }

        if(o1.getYear() != o2.getYear()){
            return o1.getYear() - o2.getYear();
        }

        if(o1.getNominal() != o2.getNominal()) {
            return o1.getYear() - o2.getYear();
        }

        if(o1.getMetal().equals(o2.getMetal())) {
            return o1.getMetal().compareTo(o2.getMetal()); // for Type String we don't have method "CompareTo" but for object "this.getMetal" we have it.
        }
        return 0;
    }
}
