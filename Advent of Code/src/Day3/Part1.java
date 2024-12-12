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
		ArrayList<String> list2 = new ArrayList<String>();
		int index=0;
		int index2 = 2;
		int index3 = 1;
		while(scan.hasNext()) {
			list.add(scan.next());
			System.out.println(list);
			
		}
		
		for(int i = 0;i<list.size();i++) {
			String obj = list.get(i);
			ArrayList<String> obj2 = new ArrayList<String>();
			for(int j = 0;j<obj.length();j++) {
				obj2.add(obj.substring(j,j+1));
			}
			System.out.println(obj2);
			for(int k = 0;k<obj2.size();k++) {
				String str = obj2.get(k);
				if(!(str.equals("m")||str.equals("u")||str.equals("l")||str.equals("(")||str.equals(",")||str.equals(")")||str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")||str.equals("0"))) {
					obj2.remove(k);
				}
			}
			System.out.println(obj2);
//			if(obj.contains("mul(") && obj.contains(")") && obj.contains(",")) {
//				index = obj.indexOf("mul(");
//				index2 = obj.indexOf(")");
//				index3 = obj.indexOf(",");
//				if(index<index2 && index<index3 && index2>index3) {
//					System.out.println(obj.substring(index,index2+1));
//					System.out.println(obj.length());
//					list2.add(obj.substring(index,index2+1));
//				}
//			}
//			if(obj2.contains("m") && obj2.contains(")") && obj2.contains("u") && obj.contains(",")) {
//				index = obj2.lastIndexOf(")");
//				index3 = obj.lastIndexOf(",");
//				index4
//				index2 = obj2.lastIndexOf("m");
//				if(index-index2<=11 && index-index2>=7) {
//					for(int g = index2;g<index+1;g++) {
//						System.out.print(obj2.get(g));
//						list2.add(obj2.get(g));
//					}
//					System.out.println("");
//			//System.out.println(list2);
//				}
//			}
			
			
		}
	}
}
