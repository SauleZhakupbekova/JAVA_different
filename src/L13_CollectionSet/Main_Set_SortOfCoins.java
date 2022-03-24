package L13_CollectionSet;

// HashSet - no index, no duplicates, no order
// linked HashSet - no index, no duplicates, order exists
// Hash method - creating HashCode
// TreeSet - sortedList. Keep data by BI tree.

import java.util.TreeSet;

public class Main_Set_SortOfCoins {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2000, 5, 2.4, "Gold");
        Coin coin2 = new Coin(2000, 5, 2.4, "Gold");
        Coin coin3 = new Coin(2020, 10, 2.6, "Gold");
        Coin coin4 = new Coin(1900, 1, 2.5, "Bronze");
        Coin coin5 = new Coin(1850, 5, 1, "Silver");

        TreeSet<Coin> coins = new TreeSet<>();//TreeSet always sort by one parameter
        coins.add(coin2);
        coins.add(coin1);
        coins.add(coin4);
        coins.add(coin3);
        coins.add(coin5);

       //create object Sort
        Sort sortCoins = new Sort();
        System.out.println("----Sort by Diameter Ascending");
        // call from object method printSortByDiameterAsc
        sortCoins.printSortByDiameterAsc(coins);
        System.out.println("-----------------------");
        System.out.println("----Sort by Diameter Descending");
        // call from object method printSortByDiameterDsc
        sortCoins.printSortByDiameterDsc(coins);
        System.out.println("-----------------------");

        }
    }

