package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

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
			int[] lineInt = new int[line.length];
			for(int i =0;i<line.length;i++) {
				lineInt[i] = Integer.parseInt(line[i]);
			}
			if(lineInt[0]>lineInt[1]) {
				increasing = false;
			}else if (lineInt[0]<lineInt[1]){
				increasing = true;
			}
			for(int i = 0;i<lineInt.length-1;i++) {
				if(increasing) {
					if(!(lineInt[i+1]-lineInt[i]<=3 && lineInt[i+1]-lineInt[i]>=0) || lineInt[i]==lineInt[i+1]) {
						safe = false;
					}
				}else {
					if(!(lineInt[i]-lineInt[i+1]<=3 && lineInt[i]-lineInt[i+1]>=0) || lineInt[i]==lineInt[i+1]) {
						safe = false;
					}
				}
				System.out.println(safe);
			}
			
			if(safe) {
				safeLines++;
			}
			System.out.println(safeLines);
		}
		System.out.println(safeLines);
	}
}
