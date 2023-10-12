package com.orialz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	Soultion soultion;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int round = Integer.parseInt(br.readLine());
		for(int r = 0; r <round; r++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			switch (command){
				case 100:
					break;
				case 200:
					break;
				case 300:
					break;
				case 400:
					break;
			}
		}
	}
}