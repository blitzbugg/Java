public class SortStrings {
    public static void main(String[] args) {
        for (int i = 0; i < args.length -1 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j].compareTo(args[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = args[i];
            args[i] = args[minIndex];
            args[minIndex] = temp;
        }

        System.out.println("Strngs in alphabeticcal order:");
        for (int k = 0; k < args.length; k++) {
            System.out.println(args[k]);
        }
    }
}
