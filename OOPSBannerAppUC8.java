import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // -------------------------------
    // Utility Method 1:
    // Build and return character pattern map
    // -------------------------------
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        });

        return patternMap;
    }

    // -------------------------------
    // Utility Method 2:
    // Render banner message
    // -------------------------------
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7; 

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {

        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();

        String message = "OOPS";

        renderBanner(message, characterPatternMap);
    }
}