/**
 * HelloApp – UC6 – Greets multiple users using enhanced for loop
 * and substring() to remove the trailing delimiter.
 *
 * @author Developer Name
 * @version 6.0
 * @since UC1
 */
public class HelloAppUC6 {

    public static void main(String[] args) {
        String names;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name);
                nameBuilder.append(", ");
            }
            // Remove the trailing ", " using substring
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}