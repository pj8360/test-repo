public class HelloAppUC5 {

    public static void main(String[] args) {
        String names;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
            }
            names = nameBuilder.toString();
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}