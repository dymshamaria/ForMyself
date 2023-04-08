public class MyFirstClass {

    public int number = 1;
    char letter = 'a';
    boolean condition = true;
    String string = "Hello world";

    public MyFirstClass(){

    }


    public MyFirstClass(char Letter){
        this.letter = letter;
    }

    public MyFirstClass(int newNumber, char newLetter){
        this(newLetter);
        number = newNumber;
    }

    private void printInConsole() {
        System.out.println(number);
        System.out.println(letter);
        System.out.println(condition);
        System.out.println(string);
    }

    public MyFirstClass(int number, char letter, boolean condition, String string){
        this(number, letter);
        this.condition = condition;
        this.string = string;
    }

    void incrementFieldNumber(int anotherNumber) {
        printInConsole();
        number = number + anotherNumber;
    }

    void singleMethod() {
        int a = 1;
        for (int i = 0; i < 3; i++) {
            int innerValue = 3;
            a++;
            number++;
        }
    }

    double numberValue() {
        return number;
    }
}
