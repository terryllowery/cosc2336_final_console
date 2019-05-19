package net.lowerytech.console;

/**
 * <code>Console</code> class is a helper to print the header before
 * each artist/album
 */
public class Console {

    /**
     * Print header
     * @param prompt the prompt
     */
    public static void printHeader(String prompt) {
        System.out.println(prompt);
        System.out.println("--------------------");
    }
}
