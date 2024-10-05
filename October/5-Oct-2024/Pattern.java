/*
Write a program in Java to display the following pattern on the screen using loop.
@@@@@@@@
@      @
@      @
@      @
@      @
@      @
@@@@@@@@
*/

public class Pattern
{
    public static void main(String args[])
    {
        String str = args[0];
        char s = str.charAt(0);
        int nr = Integer.parseInt(args[1]);
        int nc = Integer.parseInt(args[2]);

        int i, j;
        for(i=1; i<=nr; i++)
        {
            for(j=1; j<=nc; j++)
            {
                if(i==1)
                {
                    System.out.print(s);
                }
                else if(j==1 || j==nr)
                {
                    System.out.print(s);
                }
                else if(!(j==1 || j==nr))
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if(i==nr-1)
            {
                for(i=0; i<=nr-1; i++)
                {
                    System.out.print(s);
                }
            }
        }
        
    }
}

/*
@@@@@@@@@
@       @
@       @
@       @
@       @
@       @
@       @
@       @
@@@@@@@@@
*/

/*

PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\5-Oct-2024> java Pattern.java '@' 10 10
@@@@@@@@@@
@        @
@        @
@        @
@        @
@        @
@        @
@        @
@        @
@@@@@@@@@@
*/