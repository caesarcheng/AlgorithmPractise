package cn.edu.zju.Algorithm.shortestLength;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Dijkstra {
	
	/*static	int[][] arcs = new int[][] { { 0, 10, 0, 0, 5 }, { 0, 0, 1, 0, 2 }, { 0, 0, 0, 4, 0 }, { 7, 0, 6, 0, 0 },{ 0, 3, 9, 2, 0 } };
	static	int dist[];
	static	Set<Integer> V = new HashSet<>();
	static	List<Integer> S = new ArrayList<>();
	*/
	
	public static void Dijkstra(int [][] arcs) {
		findMinLength(arcs );
	}

	public static void findMinLength(int [][] arcs) {
		  int[] dist =new int[arcs.length];
		  Set<Integer> V = new HashSet<>();
		  List<Integer> S = new ArrayList<>();
	
		// orginal is the orginal node signal, and index is shortest distance at current visitation.
		int orginal = 0, index = 0;
		S.add(orginal);
		int minEdge = Integer.MAX_VALUE;
		for (int i = 0; i < arcs.length; i++) {
			V.add(i);
			if(0==arcs[orginal][i]) {
				dist[i]=Integer.MAX_VALUE;
			}else{
				dist[i] = arcs[orginal][i];
			}
			if (arcs[orginal][i] != 0 && arcs[orginal][i] < minEdge) {
				minEdge = arcs[orginal][i];
				index = i;
			}
		}
		S.add(index);
		V.remove(index);
		V.remove(orginal);
		while (!V.isEmpty()) {
			/*
			 * visit all the node in Vertex , caculate the shortest distance.
			 */
			Iterator<Integer> iterator = V.iterator();
			while (iterator.hasNext()) {
				int vertex = iterator.next();
					if (0!=arcs[index][vertex]&&minEdge + arcs[index][vertex] < dist[vertex]) {
						dist[vertex] = minEdge + arcs[index][vertex];
					}
			}
			minEdge = Integer.MAX_VALUE;
			/**
			 * get the shortest distance at current visitation.
			 */
			Iterator<Integer> iterator2 = V.iterator();
			while (iterator2.hasNext()) {
				int vertex = iterator2.next();
				if(dist[vertex]<minEdge){
					minEdge=dist[vertex];
					index=vertex;
				}
			}
			S.add(index);
			V.remove(index);
		}
		//output the path and minimum distance from orginal node .
		for(int i=1;i<S.size();i++){
			System.out.print("from original node "+(S.get(0)+1)+" to node "+(S.get(i)+1)+", the distance is "+ dist[S.get(i)]+". the path is ");
			for(int j=0 ; j<i;j++){
				System.out.print(S.get(j)+1);
				System.out.print("->");
			}
			System.out.println(S.get(i)+1);
		}
	}
}
