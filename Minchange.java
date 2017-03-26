/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Minchange {

  
    public static void main(String[] args)throws Exception {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        String s=br.readLine();
        int n=Integer.parseInt(s);
         String ks=br.readLine();
        int k=Integer.parseInt(ks);
        if(n<=0)
            System.out.println("String is null");
       else if(k==0)
            System.out.println(n);
       else if(k>=s.length())
           System.out.println(0);
       else 
           System.out.println(Integer.parseInt(findcost(s, k)));
        
    }
    public static String findcost(String n,int k){
        char ar[]=n.toCharArray();
        Arrays.sort(ar);
        int f=n.length()-k-1;
        
        String fs="";int i=0;
        while(i<=f){
            fs+=ar[i];
            i++;
        }
        return fs;
    }
    
    
}
