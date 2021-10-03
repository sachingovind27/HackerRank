package Algorithms;

import java.util.*;

class binarySearch{

    //global input
    static int []input = new int[100];
    static binarySearch bst = new binarySearch();
    int searchNum;

    int searchBST( int begin,int end,int index){
       
        if(searchNum==input[index]){
            return index;
        }

        if(searchNum<input[index]){
            index = searchBST(begin,index-1,index/2);
        }else{
            index = searchBST(index+1,end,index/2);
        }

        return index;
    } 

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
       bst.searchBST(0,input.length,input.length/2);
    }  

   
}