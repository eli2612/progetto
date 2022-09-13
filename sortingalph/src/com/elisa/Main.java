package com.elisa;
import java.util.Scanner;

class Sorting {



            public static void main(String[] args)
            {
                Scanner scan=new Scanner(System.in);  //input da uno stream di caratteri
                int n;   //Dichiaro la grandezza dell'array

                n=scan.nextInt();    //inizializzo la grandezza dell'array

                String[] yourstring=new String[n];   //Dichiaro l'array

                Scanner scan1=new Scanner(System.in);
                for(int i=0; i<n ;i++)
                {
                    yourstring[i]=scan1.nextLine();
                }

                //logic for sorting
                for(int i = 0; i<n; i++)   //scorro l'array
                {
                    for (int j = i+1; j<n; j++)  //scorro tutti gli altri elementi dell'array
                    {
                        //comparazione
                        if(yourstring[i].compareTo(yourstring[j])>0)
                        {
                            //scambio degli elementi
                            String temp = yourstring[i];
                            yourstring[i] = yourstring[j];
                            yourstring[j] = temp;
                        }
                    }
                }
                //prints the sorted array in alphabetical order

            }
        }








