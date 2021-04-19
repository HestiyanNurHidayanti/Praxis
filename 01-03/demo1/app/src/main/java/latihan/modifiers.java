package latihan;

public class modifiers {
        int x = 10;
        double PI = 3.14;

        public static void main(String[] args) {
            modifiers myObj = new modifiers();
            myObj.x = 50; // will generate an error: cannot assign a value to a final variable
            myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
            System.out.println(myObj.x);
        }
    }
