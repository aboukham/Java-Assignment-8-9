import java.util.Scanner;


public class CountVowels {
	private int[]		countVowels;
	public final String VOWELS = "aeiou";
	
	public int[] getCountVowels(){
		return this.countVowels;
	}
	
	public void setCountVowels(int [] arr){
		this.countVowels = arr;
	}
	
	public void countVowels(String sentence){
		int		index;
		int[]	arr;

		arr = new int[]{0, 0, 0, 0, 0};
		for (int i = 0; i < sentence.length(); i++){
			index = this.VOWELS.indexOf(sentence.charAt(i));
			if (index != -1)
				arr[index]++;
		}
		this.countVowels = arr;
	}
	
	public static void main(String[] args) {
		CountVowels cv;
		Scanner		s;
		String		input;

		cv = new CountVowels();
		s = new Scanner(System.in);
		while (true)
		{
			System.out.println("enter a sentence:");
			input = s.nextLine();
			if (input.isEmpty())
				break ;
			cv .countVowels(input);
			for (int i = 0; i < 5; i++){
				System.out.println("The number of " + cv.VOWELS.charAt(i) + " : " + cv.getCountVowels()[i]);
			}
		}
	}

}
