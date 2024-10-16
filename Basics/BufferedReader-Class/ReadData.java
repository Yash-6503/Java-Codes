/*
Program to read data from the console using BufferedReader class
*/

package com.classes;

import java.io.*;

public class ReadData
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name: ");
        String name = br.readLine();
        System.out.println("Your Name is : "+name);
    }
}

/*
Enter your Name: 
John Smith
Your Name is : John Smith
*/