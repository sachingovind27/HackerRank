package Algorithms;

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

        int pos = bst.searchBST(0,input.length,input.length/2);
        System.out.println("position - " + pos);
    }
}