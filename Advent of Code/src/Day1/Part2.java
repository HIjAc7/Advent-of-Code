package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {

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
			
			for(int i =0;i<list1.size();i++) {
				int instances = 0;
				int num = list1.get(i);
				System.out.println(num);
				for(int j = 0;j<list2.size();j++) {
					if(num==list2.get(j)) {
						instances++;
					}
				}
				System.out.println(instances);
				distance += list1.get(i)*instances;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(distance);
		
	}
}