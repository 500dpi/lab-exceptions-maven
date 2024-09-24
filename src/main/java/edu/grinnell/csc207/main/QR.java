package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Sara Jaljaa
 * @author Mitch Paiva
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    int a, b, c;
    Quadratic quad;
    
    pen.println("Hi! I'm here to help you understand quadratic functions." + '\n');
    a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term): ");
    b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term) : ");
    c = IOUtils.readInt(pen, eyes, "Please enter c (the constant)                       : ");

    if (c == Integer.MIN_VALUE) {
      c = 0;
    } 
    if (b == Integer.MIN_VALUE) {
      b = 0;
    } 
    if (a == Integer.MIN_VALUE) {
      a = 0;
    }
    
    quad = new Quadratic(a, b, c);

    if (a == 0) {
      System.err.println('\n' + "> Error: cannot calculate root.");;
    } else {
      pen.println('\n' + "The smaller root of " + quad.toString() + " is " + (int) quad.smallerRoot() + '\n');
      pen.println("Experimentally, " + quad.toString() + " = " + (int) quad.evaluate(quad.smallerRoot()) + "." + '\n');
    }
    
    eyes.close();
    pen.close();
  } // main(String[])
} // QR
