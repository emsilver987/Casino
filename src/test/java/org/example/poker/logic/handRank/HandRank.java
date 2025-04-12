//package org.example.poker.logic.handRank;
//
//import java.util.List;
//
//public class HandRank implements Comparable<HandRank> {
//    private HandRankType type;
//    private List<Integer> tiebreakers;
//
//    public HandRank(HandRankType type, List<Integer> tiebreakers) {
//        this.type = type;
//        this.tiebreakers = tiebreakers;
//    }
//
//    public HandRankType getType() { return type; }
//
//    public List<Integer> getTiebreakers() { return tiebreakers; }
//
//    @Override
//    public int compareTo(HandRank other) {
//        int typeComparison = this.type.getStrength() - other.type.getStrength();
//        if (typeComparison != 0) return typeComparison;
//
//        // Compare tiebreakers
//        for (int i = 0; i < Math.min(this.tiebreakers.size(), other.tiebreakers.size()); i++) {
//            int cmp = this.tiebreakers.get(i) - other.tiebreakers.get(i);
//            if (cmp != 0) return cmp;
//        }
//        return 0;
//    }
//}
