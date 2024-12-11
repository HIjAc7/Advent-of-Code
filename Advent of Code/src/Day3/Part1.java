package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("Advent of Code Day 3 input");
		Scanner scan = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		while(scan.hasNext()) {
			list.add(scan.next());
			System.out.println(list);
			String[] list2 = (String[]) list.toArray();
			System.out.println(list2);
		}
		
		
	}
}
