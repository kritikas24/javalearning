class Sum {

	public static void main(String[] args) {
		Sum sum = new Sum();
		int response = 0;

		//response = sum.sum(4, response);
		response = sum.sum(143);

		System.out.print(response);
	}

	/*public int sum(int num, int response) {
		if(num > 0) {
			response = response + num%10;
			num=num/10;
			response = sum(num, response);
		}
		return response;
	}
*/

	public int sum(int num) {
		if(num <= 0) {
			return 0;
		}
		return num%10 + sum(num/10);
	}
}