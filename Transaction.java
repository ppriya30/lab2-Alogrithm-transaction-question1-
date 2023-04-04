package com.lab2.algo.question1;

import java.util.Scanner;

public class Transaction {

        static int sum;

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number of transactions ");
            int size =sc.nextInt();
            int[] tran_arr= new int[size];
            System.out.println("Enter the values of each transaction");
            for (int i=0; i<size;i++){

                System.out.print(i+1 +". ");
                tran_arr[i]= sc.nextInt();
            }
            System.out.println("Enter the Number of targets");
            int targets=sc.nextInt();
            int flag;
            for (int i=1;i<=targets;i++){
                sum=0;
                flag=0;
                System.out.println("Enter the traget amount "+i);
                int amount=sc.nextInt();
                for (int j=0;j<tran_arr.length;j++){
                    sum+=tran_arr[j];

                    if (sum>=amount){
                        flag=1;// target met
                        System.out.println("Target achived on transaction number "+ (j+1));
                        break;
                    }

                }
                if(flag==0)
                    System.out.println("Sorry, this Target not achived");
            }
        }
    }


