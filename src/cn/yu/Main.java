package cn.yu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        {
            //graph a
            //initial
            {
                System.out.println("a)");
                Graph a = new Graph();
                a.weights = new HashMap<Graph.DuelKey, Double>();
                {
                    a.weights.put(new Graph.DuelKey("1", "2"), 0.2 - 0.901);
                    a.weights.put(new Graph.DuelKey("2", "5"), 0.7 - 0.378);
                    a.weights.put(new Graph.DuelKey("2", "7"), 0.6 - 0.994);
                    a.weights.put(new Graph.DuelKey("3", "4"), 0.9 - 0.842);
                    a.weights.put(new Graph.DuelKey("3", "14"), 0.4 - 0.776);
                    a.weights.put(new Graph.DuelKey("4", "11"), 0.6 - 0.541);
                    a.weights.put(new Graph.DuelKey("4", "14"), 0.1 - 0.381);
                    a.weights.put(new Graph.DuelKey("5", "3"), 0.4 - 0.311);
                    a.weights.put(new Graph.DuelKey("5", "4"), 0.5 - 0.697);
                    a.weights.put(new Graph.DuelKey("5", "10"), 0.4 - 0.484);
                    a.weights.put(new Graph.DuelKey("5", "11"), 0.8 - 0.764);
                    a.weights.put(new Graph.DuelKey("6", "5"), 0.4 - 0.985);
                    a.weights.put(new Graph.DuelKey("7", "6"), 0.3 - 0.918);
                    a.weights.put(new Graph.DuelKey("8", "6"), 0.8 - 0.975);
                    a.weights.put(new Graph.DuelKey("8", "7"), 0.7 - 0.717);
                    a.weights.put(new Graph.DuelKey("9", "8"), 0.2 - 0.431);
                    a.weights.put(new Graph.DuelKey("10", "6"), 0.5 - 0.567);
                    a.weights.put(new Graph.DuelKey("10", "11"), 0.3 - 0.937);
                    a.weights.put(new Graph.DuelKey("12", "9"), 0.7 - 0.215);
                    a.weights.put(new Graph.DuelKey("12", "10"), 0.3 - 0.137);
                    a.weights.put(new Graph.DuelKey("12", "13"), 0.8 - 0.955);
                    a.weights.put(new Graph.DuelKey("13", "10"), 0.3 - 0.631);
                    a.weights.put(new Graph.DuelKey("13", "11"), 0.4 - 0.706);
                    a.weights.put(new Graph.DuelKey("14", "1"), 0.3 - 0.622);
                    a.weights.put(new Graph.DuelKey("14", "15"), 0.5 - 0.485);
                    a.weights.put(new Graph.DuelKey("15", "11"), 0.3 - 0.389);

                }
                a.calculateNeighbour();
                a.infect(Arrays.asList("1", "5", "13"), true);
            }
            {
                System.out.println("b)");
                Graph a = new Graph();
                a.weights = new HashMap<Graph.DuelKey, Double>();
                {
                    a.weights.put(new Graph.DuelKey("1", "2"), 0.2 - 0.827);
                    a.weights.put(new Graph.DuelKey("1", "3"), 0.8 - 0.565);
                    a.weights.put(new Graph.DuelKey("2", "5"), 0.7 - 0.338);
                    a.weights.put(new Graph.DuelKey("2", "7"), 0.6 - 0.141);
                    a.weights.put(new Graph.DuelKey("3", "4"), 0.9 - 0.594);
                    a.weights.put(new Graph.DuelKey("3", "14"), 0.4 - 0.805);
                    a.weights.put(new Graph.DuelKey("4", "11"), 0.6 - 0.16);
                    a.weights.put(new Graph.DuelKey("4", "14"), 0.1 - 0.492);
                    a.weights.put(new Graph.DuelKey("5", "3"), 0.4 - 0.547);
                    a.weights.put(new Graph.DuelKey("5", "4"), 0.5 - 0.434);
                    a.weights.put(new Graph.DuelKey("5", "10"), 0.4 - 0.512);
                    a.weights.put(new Graph.DuelKey("5", "11"), 0.8 - 0.135);
                    a.weights.put(new Graph.DuelKey("6", "5"), 0.4 - 0.652);
                    a.weights.put(new Graph.DuelKey("7", "6"), 0.3 - 0.327);
                    a.weights.put(new Graph.DuelKey("8", "6"), 0.8 - 0.715);
                    a.weights.put(new Graph.DuelKey("8", "7"), 0.7 - 0.692);
                    a.weights.put(new Graph.DuelKey("9", "8"), 0.2 - 0.114);
                    a.weights.put(new Graph.DuelKey("10", "6"), 0.5 - 0.725);
                    a.weights.put(new Graph.DuelKey("10", "11"), 0.3 - 0.198);
                    a.weights.put(new Graph.DuelKey("12", "9"), 0.7 - 0.681);
                    a.weights.put(new Graph.DuelKey("12", "10"), 0.3 - 0.123);
                    a.weights.put(new Graph.DuelKey("12", "13"), 0.8 - 0.483);
                    a.weights.put(new Graph.DuelKey("13", "10"), 0.3 - 0.714);
                    a.weights.put(new Graph.DuelKey("13", "11"), 0.4 - 0.377);
                    a.weights.put(new Graph.DuelKey("14", "1"), 0.3 - 0.687);
                    a.weights.put(new Graph.DuelKey("14", "15"), 0.5 - 0.314);
                    a.weights.put(new Graph.DuelKey("15", "11"), 0.3 - 0.636);
                }
                a.calculateNeighbour();
                a.infect(Arrays.asList("4", "7", "15"), true);
            }
            {
                System.out.println("c)");
                Graph a = new Graph();
                a.weights = new HashMap<Graph.DuelKey, Double>();
                {
                    a.weights.put(new Graph.DuelKey("1", "2"), 0.2 - 0.115);
                    a.weights.put(new Graph.DuelKey("1", "3"), 0.8 - 0.871);
                    a.weights.put(new Graph.DuelKey("2", "5"), 0.7 - 0.888);
                    a.weights.put(new Graph.DuelKey("2", "7"), 0.6 - 0.797);
                    a.weights.put(new Graph.DuelKey("3", "4"), 0.9 - 0.732);
                    a.weights.put(new Graph.DuelKey("3", "14"), 0.4 - 0.123);
                    a.weights.put(new Graph.DuelKey("4", "11"), 0.6 - 0.622);
                    a.weights.put(new Graph.DuelKey("4", "14"), 0.1 - 0.578);
                    a.weights.put(new Graph.DuelKey("5", "3"), 0.4 - 0.408);
                    a.weights.put(new Graph.DuelKey("5", "4"), 0.5 - 0.664);
                    a.weights.put(new Graph.DuelKey("5", "10"), 0.4 - 0.652);
                    a.weights.put(new Graph.DuelKey("5", "11"), 0.8 - 0.124);
                    a.weights.put(new Graph.DuelKey("6", "5"), 0.4 - 0.248);
                    a.weights.put(new Graph.DuelKey("7", "6"), 0.3 - 0.968);
                    a.weights.put(new Graph.DuelKey("8", "6"), 0.8 - 0.568);
                    a.weights.put(new Graph.DuelKey("8", "7"), 0.7 - 0.884);
                    a.weights.put(new Graph.DuelKey("9", "8"), 0.2 - 0.788);
                    a.weights.put(new Graph.DuelKey("10", "6"), 0.5 - 0.443);
                    a.weights.put(new Graph.DuelKey("10", "11"), 0.3 - 0.766);
                    a.weights.put(new Graph.DuelKey("12", "9"), 0.7 - 0.973);
                    a.weights.put(new Graph.DuelKey("12", "10"), 0.3 - 0.897);
                    a.weights.put(new Graph.DuelKey("12", "13"), 0.8 - 0.985);
                    a.weights.put(new Graph.DuelKey("13", "10"), 0.3 - 0.526);
                    a.weights.put(new Graph.DuelKey("13", "11"), 0.4 - 0.765);
                    a.weights.put(new Graph.DuelKey("14", "1"), 0.3 - 0.369);
                    a.weights.put(new Graph.DuelKey("14", "15"), 0.5 - 0.143);
                    a.weights.put(new Graph.DuelKey("15", "11"), 0.3 - 0.624);
                }
                a.calculateNeighbour();
                a.infect(Arrays.asList("7", "8", "13"), true);
            }
            {
                System.out.println("d)");
                Graph a = new Graph();
                a.weights = new HashMap<Graph.DuelKey, Double>();
                {
                    a.weights.put(new Graph.DuelKey("1", "2"), 0.2 - 0.786);
                    a.weights.put(new Graph.DuelKey("1", "3"), 0.8 - 0.286);
                    a.weights.put(new Graph.DuelKey("2", "5"), 0.7 - 0.521);
                    a.weights.put(new Graph.DuelKey("2", "7"), 0.6 - 0.188);
                    a.weights.put(new Graph.DuelKey("3", "4"), 0.9 - 0.359);
                    a.weights.put(new Graph.DuelKey("3", "14"), 0.4 - 0.992);
                    a.weights.put(new Graph.DuelKey("4", "11"), 0.6 - 0.548);
                    a.weights.put(new Graph.DuelKey("4", "14"), 0.1 - 0.135);
                    a.weights.put(new Graph.DuelKey("5", "3"), 0.4 - 0.995);
                    a.weights.put(new Graph.DuelKey("5", "4"), 0.5 - 0.356);
                    a.weights.put(new Graph.DuelKey("5", "10"), 0.4 - 0.103);
                    a.weights.put(new Graph.DuelKey("5", "11"), 0.8 - 0.719);
                    a.weights.put(new Graph.DuelKey("6", "5"), 0.4 - 0.537);
                    a.weights.put(new Graph.DuelKey("7", "6"), 0.3 - 0.835);
                    a.weights.put(new Graph.DuelKey("8", "6"), 0.8 - 0.452);
                    a.weights.put(new Graph.DuelKey("8", "7"), 0.7 - 0.111);
                    a.weights.put(new Graph.DuelKey("9", "8"), 0.2 - 0.436);
                    a.weights.put(new Graph.DuelKey("10", "6"), 0.5 - 0.508);
                    a.weights.put(new Graph.DuelKey("10", "11"), 0.3 - 0.689);
                    a.weights.put(new Graph.DuelKey("12", "9"), 0.7 - 0.543);
                    a.weights.put(new Graph.DuelKey("12", "10"), 0.3 - 0.886);
                    a.weights.put(new Graph.DuelKey("12", "13"), 0.8 - 0.832);
                    a.weights.put(new Graph.DuelKey("13", "10"), 0.3 - 0.734);
                    a.weights.put(new Graph.DuelKey("13", "11"), 0.4 - 0.328);
                    a.weights.put(new Graph.DuelKey("14", "1"), 0.3 - 0.581);
                    a.weights.put(new Graph.DuelKey("14", "15"), 0.5 - 0.731);
                    a.weights.put(new Graph.DuelKey("15", "11"), 0.3 - 0.677);
                }
                a.calculateNeighbour();
                a.infect(Arrays.asList("2", "4", "14"), true);
            }
            System.out.println("finish");
        }
    }
}
