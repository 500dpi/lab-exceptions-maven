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
 * @author Your Name Here
 * @author Your Name Here
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

    Quadratic quad;
    int a, b, c;
    
    a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term): ");
    b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term): ");
    c = IOUtils.readInt(pen, eyes, "Please enter c (the constant): ");

    quad = new Quadratic((double) a, (double) b, (double) c);

    pen.println("The smaller root of " + quad.toString() + " is " + quad.smallerRoot());

    // eyes.close();
    // pen.close();
  } // main(String[])

} // QR
