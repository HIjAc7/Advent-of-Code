package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args){
		File file = new File("Advent of Code  Day 1 input");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int distance = 0;
		try {
			Scanner scan = new Scanner(file);
			int id = 0;
			while(scan.hasNext()) {
				if(id%2==0) {
					list1.add(scan.nextInt());
				}else {
					list2.add(scan.nextInt());
				}
				id++;
			}
			System.out.println(list1);
			System.out.println(list2);
			scan.close();
			while(list1.size()>0)	{
				int min1 = list1.get(0);
				int index1 = 0;
				int min2 = list2.get(0);
				int index2 = 0;
				for(int i =0;i<list1.size();i++) {
					if(list1.get(i) < min1) {
						min1 = list1.get(i);
						index1 = i;
					}
					if(list2.get(i) < min2) {
						min2 = list2.get(i);
						index2 = i;
					}
				}
				
				list1.remove(index1);
				list2.remove(index2);
				System.out.println(min1 + ":" + min2);
				distance += Math.abs(min2-min1);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(distance);
		
	}
}