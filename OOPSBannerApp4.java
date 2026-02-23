
public class OOPSBannerApp4 {
    public static void main(String[] args) {
        // Create a String array with all banner lines
        String[] lines = {
            String.join(" ", "***", " *** ", "*******", "*****"),
            String.join(" ", "** **", "** **", "**   **", "**  **"),
            String.join(" ", "** **", "** **", "**   **", "**  **"),
            String.join(" ", "** **", "** **", "*******", "***"),
            String.join(" ", "** **", "** **", "**", "**"),
            String.join(" ", "** **", "** **", "**", "**"),
            String.join(" ", " *** ", " *** ", "**", "*****")
        };

        // Print each line using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}