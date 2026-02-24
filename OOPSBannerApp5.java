/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define String Array using String.join()
        String[] lines = {
            String.join(" ", " *** ", "****", "****", " ****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "****", "****", " *** "),
            String.join(" ", "*   *", "*    ", "*", "    *"),
            String.join(" ", " *** ", "*    ", "*", "**** ")
        };

        // Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}