// Java code to count minimum deletions required
// so that there are no consecutive characters left
import java.util.*;

class GFG
{
static int countDeletions(String s)
{
	int ans = 0;
	char[] str = s.toCharArray();

	for (int i = 0; i < str.length - 1; i++)
		
		// If two consecutive characters are
		// the same, delete one of them.
		if (str[i] != str[i + 1])
			ans++;		
	
		return ans;
}

	// Driver code
	public static void main(String[] args)
	{
	String str = "BAAABAB";
	// Function call to print answer
	System.out.println(countDeletions(str));
	}
}
/* This code is contributed by Mr. Somesh Awasthi */
