// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         binaryConverter(5);
         binaryConverter(27);
         binaryConverter(10);
    }
    public static void binaryConverter(int data) {
        Stack stack = new Stack();
        int temp = data;
        while (temp >=1) {
            int remainder = temp % 2;
            stack.puch(remainder);
            temp = temp / 2;
        }
        stack.display();
    }
}