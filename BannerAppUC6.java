public class BannerAppUC6 {

    // Helper Method for Letter O
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

    // Helper Method for Letter P
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

    // Helper Method for Letter S
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

    public static void main(String[] args) {

        // Array Initialization via Methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Build final banner lines
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i];
        }

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}