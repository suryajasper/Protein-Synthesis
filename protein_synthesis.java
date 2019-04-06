/**
 * This program generates a line of proteins based on a line of coded amino acids
 * @author suryajasper2004
 */
import java.util.Scanner;
public class protein_synthesis 
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		String regex = " ";
		System.out.println("Would you like to (1) get the code for amino acids or (2) translate DNA into RNA? Enter 1 or 2.");
		int choice = in.nextInt(); in.nextLine();
		if (choice == 1) {
			boolean start = true;
			System.out.println("Enter the code for the line of amino acids. ");
			String [] proteins = in.nextLine().toLowerCase().split(regex);
			while (!proteins[0].equals("q")) {
				for (String s: proteins) {
					char [] p = {s.charAt(0), s.charAt(1), s.charAt(2)};
					if (p[0] == 'g') {
						if (p[1] == 'g')
							System.out.print("Glycine - ");
						else if (p[1] == 'a') {
							if (p[2] == 'a' || p[2] == 'g')
								System.out.print("Glutamic acid - ");
							else if (p[2] == 'u' || p[2] == 'c')
								System.out.print("Aspartic acid - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'c')
							System.out.print("Alanine - ");
						else if (p[1] == 'u')
							System.out.print("Valine - ");
						else
							System.out.println("Invalid");
					} else if (p[0] == 'a') {
						if (p[1] == 'g') {
							if (p[2] == 'g' || p[2] == 'a')
								System.out.print("Arginine - ");
							else if (p[2] == 'c' || p[2] == 'u')
								System.out.print("Serine - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'a') {
							if (p[2] == 'g' || p[2] == 'a')
								System.out.print("Lysine - ");
							else if (p[2] == 'c' || p[2] == 'u')
								System.out.print("Asparagine - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'c')
							System.out.print("Threonine - ");
						else if (p[1] == 'u') {
							if (p[2] == 'g') {
								if (start == true) {
									System.out.print("Start - ");
									start = false;
								} else
									System.out.print("Methionine - ");
							}
							else if (p[2] == 'c' || p[2] == 'u' || p[2] == 'a')
								System.out.print("Isoleucine - ");
							else
								System.out.println("Invalid");
						} else
							System.out.println("Invalid");
					} else if (p[0] == 'c') {
						if (p[1] == 'g')
							System.out.print("Arginine - ");
						else if (p[1] == 'a') {
							if (p[2] == 'g' || p[2] == 'a')
								System.out.print("Glutamine - ");
							else if (p[2] == 'c' || p[2] == 'u')
								System.out.print("Histidine - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'c')
							System.out.print("Proline - ");
						else if (p[1] == 'u')
							System.out.print("Leucine - ");
						else
							System.out.println("Invalid");
					} else if (p[0] == 'u') {
						if (p[1] == 'u') {
							if (p[2] == 'u' || p[2] == 'c')
								System.out.print("Phenyl-alanine - ");
							else if (p[2] == 'a' || p[2] == 'g')
								System.out.print("Leucine - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'c')
							System.out.print("Serine - ");
						else if (p[1] == 'a') {
							if (p[2] == 'u' || p[2] == 'c')
								System.out.print("Tyrosine - ");
							else if (p[2] == 'a' || p[2] == 'g')
								System.out.print("Stop - ");
							else
								System.out.println("Invalid");
						} else if (p[1] == 'g') {
							if (p[2] == 'u' || p[2] == 'c')
								System.out.print("Cysteine - ");
							else if (p[2] == 'a')
								System.out.print("Stop - ");
							else if (p[2] == 'g')
								System.out.print("Tryptophan - ");
							else
								System.out.println("Invalid");
						}
					}
				}
				System.out.println("");
				System.out.println("Enter the code for the next line of amino acids. (press q to quit.) ");
				proteins = in.nextLine().toLowerCase().split(regex);
			}
		} else if (choice == 2) {
			System.out.println("Please enter a string of DNA triplets.");
			String [] rawdna = in.nextLine().split(regex);
			for (int i = 0; i < rawdna.length; i++) {
				for (int j = 0; j < 3; j++) {
					char dna = rawdna[i].charAt(j);
					if (dna == 'a') System.out.print("u");
					else if (dna == 'a') System.out.print("u");
					else if (dna == 'c') System.out.print("g");
					else if (dna == 'g') System.out.print("c");
					else if (dna == 'u') System.out.print("a");
					else if (dna == 't') System.out.print("a");
				} System.out.print(" ");
			} System.out.println("");
		}
	}
}