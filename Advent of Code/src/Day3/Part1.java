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
			String s = "";
			ArrayList<String> l = new ArrayList<String>();
			String obj = list.get(i);
			ArrayList<String> obj2 = new ArrayList<String>();
			for(int j = 0;j<obj.length();j++) {
				obj2.add(obj.substring(j,j+1));
			}
			for(int k = 0;k<obj2.size();k++) {
				String str = obj2.get(k);
				if(!(str.equals("m")||str.equals("u")||str.equals("l")||str.equals("(")||str.equals(",")||str.equals(")")||str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")||str.equals("0"))) {
					obj2.remove(k);
				}
			}
			
		
			while(obj2.contains("m") && obj2.contains(")")) {
				s = "";
				for(int j = 0;j<obj2.size();j++) {
					s += obj2.get(j);
				}
				
				index = s.indexOf("mul(");
				index2 = s.indexOf(")");
				if(index<index2 && index>=0 && index2>0) {
					l.add(s.substring(s.indexOf("mul(",s.indexOf(")")+1)));
					for(int g = obj2.indexOf("m");g<obj2.indexOf(")");g++) {
						obj2.remove(g);
					}
				}else {
					obj2.remove(obj2.indexOf(")"));
				}
			}
			System.out.println(l);
		}
	}
}
