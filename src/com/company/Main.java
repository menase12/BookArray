package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard =new Scanner(System.in);
        int size=10000;
        int counter=0;
        String quit="";
        String title[] = new String[size];
        String author[] = new String[size];
        String comment[] = new String[size];

        while(!quit.equalsIgnoreCase("q") )
        {

            System.out.print("Enter your books: ");
            title[counter] = keyboard.nextLine();
            quit = title[counter];
            if(quit.equalsIgnoreCase("q"))
                break;
            System.out.print("Enter the author of the book: ");
            author[counter] = keyboard.nextLine();
            System.out.print("Please put your description about the book: ");
            comment[counter] = keyboard.nextLine();
            counter++;
        }



            for(int i=0; i<counter; i++)
            {
                System.out.println("Your book title is: "+ title[i] +" ,and the author of the book is: "+ author[i] +", and your description is: " +comment[i]);

            }
        }
    }

