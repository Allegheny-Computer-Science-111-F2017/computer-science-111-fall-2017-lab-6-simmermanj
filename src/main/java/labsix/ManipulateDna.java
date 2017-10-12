package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This class uses strings and scanners to read the input.
 * It will then output the complementary data (DNA).
 */

public class ManipulateDna {

  /**
   * Here I will manipulate DNA strings to produce a required output       * in the code.
   * I will do this either by reversing or excluding letters within 
   *  the string.
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Jaricka L. Simmerman " + new Date()); 
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("The DNA string: " + dna);
    
    // Step Two: Compute the complement of the DNA String
    String dnaComplement1 = dna.replace('a', 'T');
    String dnaComplement2 = dnaComplement1.replace('c', 'G');
    String dnaComplement3 = dnaComplement2.replace('t', 'A');
    String dnaComplement4 = dnaComplement3.replace('g', 'C');
    System.out.println("Complement of " + dna + " is " + dnaComplement4);
    dna = dna.toUpperCase();
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random r1 = new Random();
    String actg = "ACTG";
    char part1 = dna.charAt(r1.nextInt(4));
    int pos = r1.nextInt(dna.length());
    String part2 = dna.substring(0,pos);
    String part3 = dna.substring(pos);
    String ins = (part2 + part1 + part3);
    System.out.println("Inserting " + part1 + "at position " + pos + " gives " + ins);
    
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int pos2 = r1.nextInt(dna.length());
    String part4 = dna.substring(0,pos2);
    String part5 = dna.substring(pos2 + 1);
    System.out.println("Deleting from position " + pos2 + " gives " + part4 + part5);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int pos3 = r1.nextInt(dna.length());
    String part6 = dna.substring(0,pos3);
    String part7 = dna.substring(pos3 + 1);
    char part8 = dna.charAt(r1.nextInt(4));
    System.out.println("Changing position " + pos3 + " gives " + part6 + part8 + part7);

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for partcipating"); 
  }

}
