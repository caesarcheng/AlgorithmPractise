package cn.edu.zju.Algorithm.shortestLength;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Floyd_Warshall {

	static int[][] arcs = new int[][] { { 0, 6, 13 }, { 10, 0, 4 }, { 5, Integer.MAX_VALUE, 0 } };
	static int dist[];
	static Set<Integer> V = new HashSet<>();
	static List<Integer> S = new ArrayList<>();

	public static void Floyd_Warshall() {

	}

}
