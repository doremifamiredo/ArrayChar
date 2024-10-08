public class Main {
    public static void main(String[] args) {
        ArrayChar arrayChar = new ArrayChar();
        arrayChar.putString("First");
        arrayChar.putString("Second");
        arrayChar.undo();
        arrayChar.putString(" ");
        arrayChar.putString("Second");
        System.out.println(arrayChar.getValue());
    }
}
