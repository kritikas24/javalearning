public class DecimalToBinary {
    public static void main (String[] args) {
        int input = 13;
        DecimalToBinary conversion = new DecimalToBinary();
        long result = conversion.convertDecToBinary(input);
        System.out.print(result);
    }

    long convertDecToBinary(int input) {
        if (input == 0)
          return 0;

        return input%2 + 10 * convertDecToBinary(input/2);
    }
}
