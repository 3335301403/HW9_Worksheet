package cn.yu;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Graph {
    public Map<String, List<String>> neighbours = new HashMap<String, List<String>>();
    public Map<DuelKey, Double> weights;

    public static class DuelKey {
        private String begin;
        private String end;

        public DuelKey(String begin, String end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DuelKey duelKey = (DuelKey) o;
            return begin.equals(duelKey.begin) &&
                    end.equals(duelKey.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(begin, end);
        }
    }

    public void calculateNeighbour() {
        Set<Map.Entry<DuelKey, Double>> entrySet = weights.entrySet();
        for (Map.Entry<DuelKey, Double> e : entrySet) {
            DuelKey key = e.getKey();
            String begin = key.begin;
            String end = key.end;
            Double value = e.getValue();
            if (value >= 0) {
                if (!neighbours.containsKey(begin)) {
                    neighbours.put(begin, new ArrayList<String>());
                }
                neighbours.get(begin).add(end);
            }
        }
    }

    public long infect(List<String> init, boolean logFlag) {
        List<String> threshold = new ArrayList<String>();
        threshold.addAll(init);
        if (logFlag) System.out.println("t1:" + threshold.stream().sorted().collect(Collectors.joining(" ,")));
        int timeflag = 2;
        List<String> temp = new ArrayList<String>();
        temp.add("-1");
        while (temp.size() > 0) {
            temp.clear();
            Set<Map.Entry<String, List<String>>> entrySet = neighbours.entrySet();
            for (Map.Entry<String, List<String>> e : entrySet) {
                String key = e.getKey();
                List<String> value = e.getValue();
                if (!threshold.contains(key)) {
                    temp.add(key);
                }
            }
            if (logFlag)
                System.out.println("t" + timeflag + ":" + temp.stream().map(n -> Integer.parseInt(n)).sorted().map(n -> n + "").collect(Collectors.joining(" ,")));
            threshold.addAll(temp);
            timeflag++;
        }

        long left = neighbours.keySet().stream().filter(n -> !threshold.contains(n)).count();
        return left;
    }
}
