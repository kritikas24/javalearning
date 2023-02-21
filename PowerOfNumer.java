public class PowerOfNumer {
    public static void main (String[] args) {
        PowerOfNumer pow = new PowerOfNumer();
        int response = pow.power(2, -1);
        System.out.print(response);

    }

    public int power(int base, int exponential) {
        if (exponential < 0)
            return -1;

        if (exponential == 0)
            return 1;

            return base * power(base, --exponential);
        

    }
}
