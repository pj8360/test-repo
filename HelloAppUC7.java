/**
 * HelloApp – UC7 – Greets multiple users using String.join()
 * to concatenate names with a delimiter.
 *
 * @author Developer Name
 * @version 7.0
 * @since UC1
 */
public class HelloAppUC7 {

    public static void main(String[] args) {
        String names;

        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}