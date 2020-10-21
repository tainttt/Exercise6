package exercies6;

import java.util.ArrayList;
import java.util.Scanner;



public class ReplaceRepetitive {
	static String t;
	static String [] t1;
	static String t2;
	static ArrayList<String> list = new ArrayList<>();
	
	public static void repeat() {

		for (int i = 0; i < t1.length; i++) {
			if (i < t1.length - 1 && t1[i].equals(t1[i + 1])) {
				t1[i] = " ";
				t1[i + 1] = "REPEAT";
				i++;
			}
			list.add(t1[i]);
		}
		for (int j = 0; j < list.size(); j++)
			System.out.print(list.get(j) + " ");
		System.out.println();
	}

	

	public static void Case1() {
		 t = "I want to to go to the the the zoo";
		 t1 = t.split("\\s+");
		 t2 = "";
		
		System.out.println("Case 1:Input:I want to to go to the the the zoo");
                System.out.println("Expect output:");
                repeat();
		System.out.println("Real output: I want REPEAT go to REPEAT zoo ");
		list.removeAll(list);
		System.out.println("\n");
	}
	public static void Case2() {
		 t = "I want to to see one piece";
		 t1 = t.split("\\s+");
		 t2 = "";
		System.out.println("Case 2:Input:I want to to see one piece");	
                System.out.println("Expect output:");
		repeat();
		System.out.println("Real output: I want REPEAT see one piece");
		list.removeAll(list);
		System.out.println("\n");
	}
	
	public static void Case3() {
		 t = "You should check out out the one piece anime";
		 t1 = t.split("\\s+");
		 t2 = "";
		System.out.println("Case 3:Input: You should check out out the one piece anime");
                System.out.println("Expect output:");
		repeat();
		System.out.println("Real output: You should check REPEAT the one piece anime ");
		list.removeAll(list);
		System.out.println("\n");
	}
	
	public static void Case4() {
		 t = "the film gave me goosebumps as as one piece";
		 t1 = t.split("\\s+");
		 t2 = "";
		System.out.println("Case 4:Input: the film gave me goosebumps as as one piece");
                System.out.println("Expect output:");
		repeat();
		System.out.println("Real output: the film gave me goosebumps REPEAT one piece");
		list.removeAll(list);
		System.out.println("\n");
	}
	
	public static void Case5() {
		 t = "I am am watching a a 200 million year old classmate movie";
		 t1 = t.split("\\s+");
		 t2 = "";
		System.out.println("Case 5:Input: I am am watching a a 200 million year old classmate movie");
                System.out.println("Expect output:");
		repeat();
		System.out.println("Real output:I REPEAT watching REPEAT 200 million year old classmate movie");
		list.removeAll(list);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Case1();
		Case2();
		Case3();
		Case4();
		Case5();
	
	}
}
