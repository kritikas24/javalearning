class GreatestDivisor {
    public static void main(String[] args) {
        GreatestDivisor divisor = new GreatestDivisor();
        int result = divisor.commonDivisor(48, 18);
        System.out.print(result);
    }

    public int commonDivisor(int a, int b) {

        if (b != 0 && a>b) {
            return commonDivisor(b, a%b);
        }
        return a;
    }
}