package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
            A.add(new ArrayList<Integer>());

        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            for(int j=0;j<d;j++){
                int crt=sc.nextInt();
                A.get(i).add(j,crt);
            }
        }

        int q=sc.nextInt();
        int r=1;
        while(r<=q){
            int x=sc.nextInt()-1,y=sc.nextInt()-1;
            if(x>=A.size()||y>=A.get(x).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(A.get(x).get(y));
            }
            r++;
    }
}}
