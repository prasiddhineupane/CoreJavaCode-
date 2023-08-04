
public class thisKeywordDemo {

    //instance variable
    int x = 12;

    void show() {
        int x = 45; //local variable
        System.out.println(this);
        System.out.println("x = "+x); //search locally first
        System.out.println(this.x); //directly print instance variable value
    }

    public static void main(String[] args) {
        thisKeywordDemo dd = new thisKeywordDemo();
        dd.show();
        System.out.println(dd);


        }
    }

