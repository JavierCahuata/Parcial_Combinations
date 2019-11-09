package com.cahuata.ads.parcial;

public class CombinationsLineal {
	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		int n = 8;	//7
		int level = 0;
		System.out.println("# Ladder's steps: " + n);
		long resultado=0;
		
		for (int i = 2; i <= n; i++) {
			long ultimo = combinations.countCombinations(n-1, level);
			long penultimo = combinations.countCombinations(n-2, level);
			long traspenultimo = combinations.countCombinations(n-3, level);			
			resultado = ultimo+penultimo+traspenultimo; 		
		}
		System.out.println("# Step combinations: " + resultado);
	}

	
	
	public long countCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		return 0;
		/*return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);*/
	}
}