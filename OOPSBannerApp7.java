public class OOPSBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Static Method to Create and initializes CharacterPatternMap array for predefined characters
     * Populates pattern maps for letters 'O', 'P', 'S' and space character.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[]{
            "****** ",
            "** **",
            "** **",
            "****** ",
            "** ",
            "** ",
            "** ",
            "** "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[]{
            " ***** ",
            "** ",
            "** ",
            " *** ",
            "   *** ",
            "     **",
            "     **",
            "***** "
        });

        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "    ",
            "    ",
            "    ",
            "    ",
            "    ",
            "    ",
            "    ",
            "    "
        });

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     * Searches through the character pattern maps to find a matching character.
     * If the character is not found, recursively returns the pattern for space character.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // If not found, default to space (preventing infinite recursion by checking ch isn't already ' ')
        return (ch == ' ') ? new String[]{"", "", "", "", "", "", "", ""} : getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns.
     * Renders the entire message horizontally by combining individual character patterns line by line.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 8; // Based on the 8-line patterns defined above
        
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Adding spacing between characters
            }
            System.out.println(line.toString());
        }
    }

    /**
     * Main method - Entry point for the banner display application.
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}