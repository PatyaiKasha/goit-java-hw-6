class NameParser {
    public String parse(String[] names) {
        StringBuilder sb = new StringBuilder();
        int namesLength = names.length;

        for (int i = 0; i < namesLength; i++) {
            String name = names[ i ];

            if ( i != namesLength - 1) {
                sb.append(name.split(" ")[0]).append(", ");
            }
            else {
                sb.append(name.split(" ")[0]);
            }
        }

        return sb.toString().trim();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}