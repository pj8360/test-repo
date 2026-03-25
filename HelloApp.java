/**
 * HelloApp – UC4 – A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * @author Developer Name
 * @version 4.0
 * @since UC1
 */
public class HelloApp {

    public static void main(String[] args) {
        String names;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            names = nameBuilder.toString();
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}