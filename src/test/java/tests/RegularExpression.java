package tests;

import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main (String args[]) {
		
		boolean matchingstatus = Pattern.matches("[0-9]am", "-9am"); //.--> letter/single char and * 
		
		if(matchingstatus) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
	}

}

// .*Vidhya.*", "My Name is Vidhya Shankar. ----> Matched
// .*Vidhya", "My Name is Vidhya Shankar.   -----> Not Matched
// "Vidhya", "My Name is Vidhya Shankar."    -----> Not Matched
// "java", "java"   ----> Matched
//"java", "Java"   ----> Not Matched
//"[Jj]ava", "Java" ----> Matched
//"[Jj]ava", "java" ----> Not Matched
//"[Jj]ava", "Python" ----> Not Matched
//"ye[sp]", "yes" ---->  Matched
//"ye[sp]", "yep" ---->  Matched
//"ye[sp]", "yet" ---->  Not Matched
//"[sfk]it", "sit" ---->  Matched
//"[sfk]it", "fit" ---->  Matched
//"[sfk]it", "kit" ---->  Matched
//"[sfk]it", "pit" ---->  Not Matched
//".ava", "java" ---->  Matched
//".ava", "Java" ---->  Matched
//".ava", "$ava" ---->  Matched
//".ava", "99ava" ---->  Not Matched
//".ava", "lava" ---->  Matched
//"[0-9]am", "3am" ---->  Matched
//"[0-9]am", "-9am" ---->  Not Matched
//"[0-9]am", "sam" ---->  Not Matched
//"[0-9]am", "$am" ---->  Not Matched
//"[a-z]et", "zet" ----> Matched
//"[a-z]et", "aet" ----> Matched
//"[a-z]et", "Aet" ----> Not Matched
//"[a-z]et", "9et" ----> Not Matched
//"[A-Z]et", "9et" ----> Not Matched
//"[A-Z]et", "Bet" ----> Matched
//"[A-Z]et", "aet" ----> Not Matched
//"[a-zA-Z0-9]et", Set --- Matched
//"[a-zA-Z0-9]et", 9et --- Matched
//"[a-zA-Z0-9]et", *et --- Not Matched
//"[^0-9]et, set ---- matched                ^ ---> stands for Not
//"[^0-9]et, $et ---- matched
//"[^0-9]et, Set ---- matched
//"[^0-9]et, 5et ---- Not matched
//"se[a-z]",ser ---- matched
//"se[a-z]",seT ---- Not matched
//"se[a-z]",se0 ---- Not matched
//s[^aeiou]t, set ---- Not matched
//s[^aeiou]t, sEt ----  matched
//s[^aeiou]t, sat ----  not matched
//\dam", "3am" ----  not matched                  \d --->  matches a digit and is equal to specifying [0-9]    Example: abc\defg ---> Accepts abc9efg and Rejects abcdefg
//if \d is not working we can use \\d

















