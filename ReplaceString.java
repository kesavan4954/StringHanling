package stringHandling;

public class ReplaceString {

	// Main driver method
    public static void main(String args[])
    {
 
        // Declaring and initialising custom input string
        String Str = new String("Welcome to my world");
 
        // Using replace to replace characters
        System.out.print("After replacing all o with k : ");
        System.out.println(Str.replace('o', 'T'));
 
        // Using replace to replace characters
        System.out.print("After replacing all e with D : ");
        System.out.println(Str.replace('e', 'D'));
    }


	}


