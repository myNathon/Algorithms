package com.none.tool;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * This class provides methods for printing strings and numbers to standard output.
 * Created by Nathon on 2017/8/16.
 */
public class StdOut {
    // output
    private static PrintWriter out;

    // initialization of static statement block
    static {
        // autoFlush: if true, the <tt>println</tt>, <tt>printf</tt>,
        //            or <tt>format</tt> methods will flush the output buffer
        out = new PrintWriter(new OutputStreamWriter(System.out), true);
    }

    // constructor is private
    private StdOut() {}

    /**
     * Closes the stream and releases any system resources associated
     * with it. Closing a previously closed stream has no effect.
     */
    public static void close() {
        out.close();
    }

    /**
     * Prints a boolean value to standard output.
     * @param x The <code>boolean</code> to be printed
     */
    public static void print(boolean x) {
        out.println(x);
    }

    /**
     * Prints a character to standard output.
     * @param x The <code>char</code> to be printed
     */
    public static void print(char x) {
        out.println(x);
    }

    /**
     * Prints an integer to standard output.
     * @param x The <code>int</code> to be printed
     */
    public static void print(int x) {
        out.println(x);
    }

    /**
     * Prints a long integer to standard output.
     * @param x The <code>long</code> to be printed
     */
    public static void print(long x) {
        out.println(x);
    }

    /**
     * Prints a floating-point number to standard output.
     * @param x The <code>float</code> to be printed
     */
    public static void print(float x) {
        out.println(x);
    }

    /**
     * Prints a double-precision floating-point number to standard output.
     * @param x The <code>double</code> to be printed
     */
    public static void print(double x) {
        out.println(x);
    }

    /**
     * Prints an array of characters to standard output.
     * @param x The array of chars to be printed
     */
    public static void print(char x[]) {
        out.println(x);
    }

    /**
     * Prints a string to standard output.
     * @param x The <code>String</code> to be printed
     */
    public static void print(String x) {
        out.println(x);
    }

    /**
     * Prints an object to standard output.
     * @param x The <code>Object</code> to be printed
     */
    public static void print(Object x) {
        out.println(x);
    }

    /**
     * Terminates the current line by writing the line separator string.
     */
    public static void println() {
        out.println();
    }

    /**
     * Prints a boolean value and then terminates the line.
     * @param x the <code>boolean</code> value to be printed
     */
    public static void println(boolean x) {
        out.println(x);
    }

    /**
     * Prints a character and then terminates the line.
     * @param x the <code>char</code> value to be printed
     */
    public static void println(char x) {
        out.println(x);
    }

    /**
     * Prints an integer and then terminates the line.
     * @param x the <code>int</code> value to be printed
     */
    public static void println(int x) {
        out.println(x);
    }

    /**
     * Prints a long integer and then terminates the line.
     * @param x the <code>long</code> value to be printed
     */
    public static void println(long x) {
        out.println(x);
    }

    /**
     * Prints a floating-point number and then terminates the line.
     * @param x the <code>float</code> value to be printed
     */
    public static void println(float x) {
        out.println(x);
    }

    /**
     * Prints a double-precision floating-point number and then terminates the line.
     * @param x the <code>double</code> value to be printed
     */
    public static void println(double x) {
        out.println(x);
    }

    /**
     * Prints an array of characters and then terminates the line.
     * @param x the array of <code>char</code> values to be printed
     */
    public static void println(char x[]) {
        out.println(x);
    }

    /**
     * Prints a String and then terminates the line.
     * @param x the <code>String</code> value to be printed
     */
    public static void println(String x) {
        out.println(x);
    }

    /**
     * Prints an Object and then terminates the line.
     * @param x The <code>Object</code> to be printed
     */
    public static void println(Object x) {
        out.println(x);
    }

    /**
     * A convenience method to write a formatted string to this writer using
     * the specified format string and arguments.  If automatic flushing is
     * enabled, calls to this method will flush the output buffer.
     *
     * @param format
     *        A format string.
     *
     * @param args
     *        Arguments referenced by the format specifiers in the format string.
     */
    public static void printf(String format, Object ... args) {
        out.printf(format, args);
        out.flush();
    }
}
