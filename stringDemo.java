//String is nothing but group or array of characters. It is a pre building class in java.
//Data Structure is a method which allows to retrieve data easily, and efficiently.
// String are immutable in nature. Once created can't change it.
//Two ways to create string. 1. using the new operator     2. using string literal
public class stringDemo {
    public static void main(String[] args) {
        String str = "Prasi";
        //can append string
        str = str.concat(" Anjali");
        System.out.println(str);
        char [] c = {'P', 'r','a','s','i'};
        System.out.println(c);
        }
    }
