package Algorithms;

import java.util.*;

class binarySearch{

    //global input
    static int []input = new int[100];

    public static void main(){

       //Take input 
       Scanner sc = new Scanner(System.in); 
       
       try {
           
            String []inpStr = sc.nextLine().split(",");
            int i =0 ;

            for(String str : inpStr){
                input[i] = Integer.parseInt(str);
            }

       } catch (Exception e) {

            System.out.println(e.getMessage());
            e.printStackTrace();

       }finally{
            sc.close();
       }
      
       //call Search

      
    }
}