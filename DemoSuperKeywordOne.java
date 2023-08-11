package SuperKeyword;

import SuperKeyword.DemoSuperKeyword;

public class DemoSuperKeywordOne extends DemoSuperKeyword {

    public void eat() {

        System.out.println("I have eaten "); //Overriding eat method
    }

    public void display(){
        eat();
        this.eat(); //printing current class reference. This keyword is to differentiate
        //between instance and local variable.
        super.eat(); //call the method directly from the parent class

    }

    public static void main (String[] args) {
        DemoSuperKeywordOne dd = new DemoSuperKeywordOne();
        dd.display();
    }

}
