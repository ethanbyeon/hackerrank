package java;

import java.util.*;

public class compareTriplets {
    
    public static void main(String[] args) { }

    static List<Integer> compareTrips(List<Integer> a, List<Integer> b) {
        List<Integer> total = new ArrayList<Integer>();

        int aPoints = ((a.get(0) > b.get(0)) ? 1:0) + ((a.get(1) > b.get(1)) ? 1:0) + ((a.get(2) > b.get(2)) ? 1:0);
        int bPoints = ((a.get(0) < b.get(0)) ? 1:0) + ((a.get(1) < b.get(1)) ? 1:0) + ((a.get(2) < b.get(2)) ? 1:0);

        total.add(aPoints);
        total.add(bPoints);

        return total;
    }
}