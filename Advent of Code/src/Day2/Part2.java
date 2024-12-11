package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("Advent of Code Day 2 input");
		Scanner scan = new Scanner(file);
		int safeLines = 0;
		while(scan.hasNextLine()) {
			
			boolean safe = true;
			boolean increasing = true;
			String str = scan.nextLine();
			String[] line = str.split(" ");
			System.out.println(str);
			ArrayList<Integer> lineInt = new ArrayList<Integer>();
			boolean[] bads = new boolean[line.length];
			for(int i =0;i<line.length;i++) {
				lineInt.add(Integer.parseInt(line[i]));
			}
			
			int bad = 0;
			for(int i =lineInt.size()-1;i>0;i--) {
				if(lineInt.get(1)<lineInt.get(0)) {
					if(lineInt.get(i-1)-lineInt.get(i)>3 || lineInt.get(i)>=lineInt.get(i-1)) {
						bad++;
						if(bad == 1) {
							lineInt.remove(i-1);
							i--;
						}
					}
				}else if (lineInt.get(1)>lineInt.get(0)){
					if(lineInt.get(i)-lineInt.get(i-1)>3 || lineInt.get(i)<=lineInt.get(i-1)) {
						bad++;
						if(bad == 1) {
							lineInt.remove(i-1);
							i--;
						}
					}
				}
				
			}
			
			System.out.println(bad);
			if(bad>1) {
				safe = false;
			}
			if(safe) {
				safeLines++;
			}
			System.out.println(safeLines);
		}
		System.out.println(safeLines);
	}
}
