// Write a java program to print all pure prime numbers between the 10 to 100.

import java.util.Scanner;

public class PurePrime
{
    public static boolean isPrime(int num){
        int count=0;
        if(num==1){
            return false;
        }
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }

    public static void rangePrime(int n1, int n2){
        int count=0;
        System.out.println("Pure prime numbers between "+n1+" and "+n2+" is: ");
        for(int i=n1; i<=n2; i++){
        
            if(isPrime(i) && isPrime(reverse(i))){
                int temp = i;
                int n=i;
                boolean flag = true;
                while(temp!=0){
                    if(isPrime(temp%10)==false){
                        flag = false;
                        break;
                    }else{
                        flag = true;
                    }
                    temp/=10;
                }

                if(flag == true){
                    System.out.println(n);
                }
                
            }       
        }
    }

    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter ending number: ");
        int n2 = sc.nextInt();
        
        rangePrime(n1,n2);

        
    }
}

/*
Enter starting number: 
10
Enter ending number: 
100
Pure prime numbers between 10 and 100 is:
37
73
*/