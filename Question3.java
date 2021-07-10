import java.util.Scanner;



public class Main {

	public StringBuffer dnaComplement(String dna){
		StringBuffer	comp;
		String			str;
		int				index;

		str = "ATCG";
		comp = new StringBuffer(dna);
		
		for (int i = 0; i < comp.length(); i++){
			index = str.indexOf(dna.charAt(i));
			if ( index == -1){
				comp = new StringBuffer("invalid input, please try again");
				break;
			}else{
				if (index % 2 == 0)
					comp.setCharAt(i, str.charAt(index + 1));
				else
					comp.setCharAt(i, str.charAt(index - 1));
			}
			
		}
		return comp;
	}
	
	public static void main(String[] args) {
		Main	m;
		Scanner s;
		String	input;
		
		m = new Main();
		s = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter a DNA strand:" );
			input = s.nextLine();
			if(input.isEmpty())
				break ;
			System.out.println(m.dnaComplement(input));
		}
	}

}
