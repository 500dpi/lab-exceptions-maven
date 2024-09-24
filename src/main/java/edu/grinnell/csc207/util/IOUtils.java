package edu.grinnell.csc207.util;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.lang.Double;

/**
 * A simple set of utilities for dealing with input and output.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class IOUtils {
  /**
   * Prompt for and read an integer.
   *
   * @param pw
   *   The PrintWriter used for printing prompts.
   * @param br
   *   The BufferedReader used for reading responses.
   * @param prompt
   *   The prompt to print. Set to null if you want no prompt printed.
   *
   * @return
   *   The integer read.
   */
  public static int readInt(PrintWriter pw, BufferedReader br, String prompt)
    {
    if (prompt != null) {
      pw.print(prompt);
      pw.flush();
    } // if there is a prompt
    try {
    String response = br.readLine();
    return Integer.parseInt(response);
  } catch (Exception e) { 
    return Integer.MIN_VALUE; // readInt
  } 
  }

  public static double readDbl(PrintWriter pw, BufferedReader br, String prompt)
  {
  if (prompt != null) {
    pw.print(prompt);
    pw.flush();
  } // if there is a prompt
  try {
  String response = br.readLine();
  return Double.parseDouble(response);
} catch (Exception e) { 
  return Double.MIN_VALUE; // readInt
} 
}
}// class IOUtils
