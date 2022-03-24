package L12_LibMaven_Collections;

import java.util.*;

public class CollectionUtil implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(a);
        merge.addAll(b);
        return merge;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();

        for(Integer i:a){
            if(b.contains(i)){
                intersection.add(i);
            }

        }
        for(Integer i:b){
            if(a.contains(i)){
                intersection.add(i);
            }

        }
        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //we use TreeSet Collection because this type of collection like HashSet exclude all duplicates automatically
        TreeSet<Integer> unionWithoutDuplicate = new TreeSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);

        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();

        for(Integer i:a){
            if(b.contains(i)){
                intersectionWithoutDuplicate.add(i);
            }

        }
        for(Integer i:b){
            if(a.contains(i)){
                intersectionWithoutDuplicate.add(i);
            }

        }
        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> difference = new ArrayList<>();

        for(Integer i:a){
            if(!b.contains(i)){
                difference.add(i);
            }

        }
        for(Integer i:b){
            if(!a.contains(i)){
                difference.add(i);
            }

        }
        return difference;
    }
}
