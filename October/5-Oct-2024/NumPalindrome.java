/*
Write a Java program to check if a given number is a palindrome. A number is a palindrome if it remains the same when its digits are reversed.
*/

public class NumPalindrome
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);

        int n = num, r, digit=0;

        while(n!=0)
        {
            r = n%10;
            digit = digit * 10 + r;
            n=n/10;
        }
        if(digit == num)
        {
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\5-Oct-2024> java NumPalindrome 151
151 is Palindrome
*/

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\5-Oct-2024> java NumPalindrome 123
Not a Palindrome
*/