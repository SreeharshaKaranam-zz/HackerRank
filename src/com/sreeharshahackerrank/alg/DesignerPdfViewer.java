package com.sreeharshahackerrank.alg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesignerPdfViewer {

	static int designerPdfViewer(int[] h, String word) {

		char[] alphabets = word.toCharArray();
		char[] alphaassign = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int count = 0;
		int temp = 0;
		Map<Character, Integer> alphaVal = new HashMap<Character, Integer>();

		for (int i = 0; i < h.length; i++) {

			alphaVal.put(alphaassign[i], h[i]);

		}

		for (int j = 0; j < alphabets.length; j++) {
			temp = alphaVal.get(word.charAt(j));

			if (temp > count) {
				count = temp;
			}
		}

		return (count * word.length());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int result = designerPdfViewer(h, word);
		System.out.println(result);
		in.close();
	}
}
