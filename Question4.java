import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner	s;
		String	input;
		int		j;
		int		p = 1;

		s = new Scanner(System.in);
		while (true)
		{
			System.out.println("enter a word:");	
			input = s.nextLine();
			if (input.isEmpty())
				break ;
			j = input.length() - 1;
			for (int i = 0; i < j; i++){
				if (input.toLowerCase().charAt(i) != input.toLowerCase().charAt(j)){
					System.out.println("the input is not a palindrome word");
					p = 0;
					break;
				}
				j--;
			}
			if (p == 1)
				System.out.println("the input is a palindrome word");
		}
	}
}
