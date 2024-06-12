package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Gmp {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer>englishMarks = new ArrayList<>();
		File f1 = new File("marks.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine()) {
			String line = sc1.nextLine();
			String[] li1 = new String[9];
			li1 = line.split(",");
			int engMark = Integer.parseInt(li1[3].split(":")[1]);
			englishMarks.add(engMark);
			int mathMark = Integer.parseInt(li1[4].split(":")[1]);
			mathsMarks.add(mathMark);
			int phyMark = Integer.parseInt(li1[5].split(":")[1]);
			physicsMarks.add(phyMark);
			int chemMark = Integer.parseInt(li1[6].split(":")[1]);
			chemistryMarks.add(chemMark);
			int bioMark = Integer.parseInt(li1[7].split(":")[1]);
			biologyMarks.add(bioMark);
		}
		System.out.println(englishMarks);
		System.out.println(mathsMarks);
		System.out.println(physicsMarks);
		System.out.println(chemistryMarks);
		System.out.println(biologyMarks);
	}
}
