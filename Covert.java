/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minchange;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Covert {

  
    public static void main(String[] args)throws Exception {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        String s=br.readLine();
        int n=Integer.parseInt(s);//int ar[]=new int[n];
       /*  String ks=br.readLine();
        int k=Integer.parseInt(ks);
        if(n<=0)
            System.out.println("String is null");
       else if(k==0)
            System.out.println(n);
       else if(k>=s.length())
           System.out.println(0);
       else 
           System.out.println(Integer.parseInt(findcost(s, k)));*/
        if(n<=0)
            System.out.println("Unsupported element");
        else{
            System.out.println(convert(n));
        }
       /*  String s1=br.readLine();
           String sr[]=new String[n];
        for(int i=0;i<n;i++){
          
         ar[i]=Integer.parseInt(sr[i]);
        }
        System.out.print(largest(ar));
       ArrayList<Integer> al=new ArrayList();
         al.addAll(repeat(ar));
        for (Iterator<Integer> it = al.iterator(); it.hasNext();) {
            System.out.print(it.next()+" ");
        }*/
        
        
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
     public static ArrayList<Integer> repeat(int ar[]){
		ArrayList<Integer> al=new ArrayList();
		HashSet<Integer> hs=new HashSet();
		for(int i=0;i<ar.length;i++){
			if(!hs.contains(ar[i]))
				hs.add(ar[i]);
			else
				al.add(ar[i]);
		}
		return al;
	}
    
    public static int largest(int ar[]){
        Arrays.sort(ar);
        String s="";int i=ar.length-1;
        while(i>=0){
            s+=ar[i];
            i--;
        }
        return Integer.parseInt(s);
    }
    public static String convert(int a){
        HashMap<Integer,Character> hm=new HashMap();char ab='a';
        for(int i=1;i<=26;i++){
            hm.put(1,ab);
            ab++;
        }
        int n=a;String s="";
        while(n!=0){
            int r=n%10;
            if(r==0)
            {
                System.out.print("unsupported element");
                break;
            }
            else{
            s+=hm.get(r);
            }
            n=n/10;
        }
        return s;
    }
}
