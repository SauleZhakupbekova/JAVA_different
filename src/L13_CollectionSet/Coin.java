package L13_CollectionSet;

import java.util.Objects;

//for TreeSet we need Interface Comparable with methode CompareTo because TreeSet supposes comparing parameters to
// each other for placing them in special cell in Array
public class Coin implements Comparable<Coin>{
    private int year;
    private int nominal;
    private double diameter;
    private String metal;

    public Coin() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diameter=" + diameter +
                ", metal='" + metal + '\'' +
                '}';
    }

    public Coin(int year, int nominal, double diameter, String metal) {
        this.year = year;
        this.nominal = nominal;
        this.diameter = diameter;
        this.metal = metal;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year && nominal == coin.nominal && Double.compare(coin.diameter, diameter) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, nominal, diameter, metal);
    }

    @Override
    public int compareTo(Coin o) {
        // this - first coin
        // o - second coin
        //task - to return left or right cell for placing coin or null

        if(this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }

        if(this.getNominal() != o.getNominal()) {
            return this.getYear() - o.getYear();
        }

        if(this.getDiameter() != o.getDiameter()) {
            return Double.compare(this.getDiameter(), o.getDiameter()); //for type Double we have method "Compare" from Util module
        }
        //Metal is String so we cannot use operator "!+" as it is only for primitive types.
        // For String we should use "equals" operator
        if(this.getMetal().equals(o.getMetal())) {
            return this.getMetal().compareTo(o.getMetal()); // for Type String we don't have method "CompareTo" but for object "this.getMetal" we have it.
        }
        return 0;
    }
}
