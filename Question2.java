import java.util.Scanner;


public class CountUpperCaseChar {

	private int		count;
	
	public CountUpperCaseChar(){
		this.count = 0;
	}
		
	public int getCount(){
		return this.count;
	}
	
	public void setCount(int c){
		this.count = c;
	}
	
	public void countUpperCase(String s){
		this.count = 0;
		for (int i = 0; i < s.length(); i++){
			if (Character.isUpperCase(s.charAt(i)))
				this.count++;
		}	
	}
	
	public static void main(String[] args) {
		Scanner				s;
		CountUpperCaseChar	ct;
		String					input;

		ct = new CountUpperCaseChar();
		
		s = new Scanner(System.in);
		while (true){
			System.out.println("enter a string");
			input = s.nextLine();
			if (input.isEmpty())
				break;
			ct.countUpperCase(input);
			System.out.println("the number of uppercase characters is:" + ct.getCount());
		}
	}

}
