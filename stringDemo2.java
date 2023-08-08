public class stringDemo2 {

    public static void main(String[] args) {
        //using string literals

        String str = "Boss";
        String str1 = "Prasiddhi";

        //using new operator
        String str2 = new String("Prasi");

        //length() Calculates length of the string
        System.out.println(str.length());
        System.out.println(str1.length());

        System.out.println(str + " Anjali");
        System.out.println(2+3 +str2);

        System.out.println(2+3+8 +str2 + 5);
        System.out.println(2+3 +str2 + 5 + 8);
        System.out.println(str);

        //find a character at a particular index using charAt() method.
        System.out.println(str2.charAt(2));
        System.out.println(str1.charAt(5));

        //Calculating the substring
        System.out.println(str1.substring(5));

        //Comparing strings with equals method
        System.out.println(str1.equals(str2));

        //Compareto - negative, positive, zero
        System.out.println(str1.compareTo(str2)); //positive
        System.out.println(str.compareTo(str2)); //negative
        System.out.println(str1.compareTo(str1)); //zero

        System.out.println(str1.equalsIgnoreCase(str1)); //True

    }
}
