package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlLinks {
	public static void main(String[] args) {
		
		String pattern = "<a href=\"([^\"]+)\"[^>]*>(<.*?>)*(.*?)(?=</)";
		
		Pattern regex = Pattern.compile(pattern);

		Scanner input = new Scanner(System.in);
		
		int lineNum = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < lineNum ; i++) {
			Matcher matcher = regex.matcher(input.nextLine());
			
			while (matcher.find()) {
				
				System.out.println(matcher.group(1) + "," + matcher.group(3));
			}
		
			
		}
		
		
		
	
	}
}
