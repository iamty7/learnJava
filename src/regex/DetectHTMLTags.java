package regex;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int lineNum = input.nextInt();		
		input.nextLine();
		
		TreeSet<String> tagSet = new TreeSet<>();
		
		Pattern regex = Pattern.compile("<(\\s*?)(\\w+)(\\s*)([^>]*)>");
		
		for (int i = 0; i < lineNum; i++) {
			Matcher matcher = regex.matcher(input.nextLine());
			while (matcher.find()) {
				tagSet.add(matcher.group(2));
			}
			
		}
		
		if(!tagSet.isEmpty()){
			System.out.print(tagSet.first());
			tagSet.remove(tagSet.first());
		}
		else {
			return;
		}
		Iterator<String> iterator = tagSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(";"+iterator.next());
			
		}
		
		
	}
}
