public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        String response = reverse.reverse("java");
        System.out.println(response);
    }

    public String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
