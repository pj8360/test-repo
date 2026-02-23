/**
 * UC7 – Store Character Pattern in a Class
 * 
 * This version encapsulates each character and its banner pattern
 * using a static inner class for better modularity and scalability.
 */
public class UC7 {

    /**
     * Static Inner Class to encapsulate character and its pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         * 
         * @param character The character to store
         * @param pattern   The 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern.
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern.
     */
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  ", "*****", "  "),
            String.join("", " ", "**", "   ", "**", " "),
            String.join("", "**", "     ", "**"),
            String.join("", "**", "     ", "**"),
            String.join("", "**", "     ", "**"),
            String.join("", " ", "**", "   ", "**", " "),
            String.join("", "  ", "*****", "  ")
        };
    }

    /**
     * Utility method to create P pattern.
     */
    public static String[] getPPattern() {
        return new String[] {
            String.join("", "*******", "  "),
            String.join("", "**", "    ", "**", " "),
            String.join("", "**", "    ", "**", " "),
            String.join("", "*******", "  "),
            String.join("", "**", "       "),
            String.join("", "**", "       "),
            String.join("", "**", "       ")
        };
    }

    /**
     * Utility method to create S pattern.
     */
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  ", "*****", "  "),
            String.join("", " ", "**", "   ", "**", " "),
            String.join("", "**", "       "),
            String.join("", "  ", "*****", "  "),
            String.join("", "       ", "**"),
            String.join("", " ", "**", "   ", "**", " "),
            String.join("", "  ", "*****", "  ")
        };
    }

    /**
     * Main method to build and render OOPS banner.
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap objects
        CharacterPatternMap o = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap p = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap s = new CharacterPatternMap('S', getSPattern());

        // Array of objects (O, O, P, S)
        CharacterPatternMap[] characters = { o, o, p, s };

        // Banner lines
        String[] banner = new String[7];

        // Build each line using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap cp : characters) {
                lineBuilder.append(cp.getPattern()[i]).append("   ");
            }
            banner[i] = lineBuilder.toString();
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}