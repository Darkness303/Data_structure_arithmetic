//归并排序O(n*logn) 空间复杂度o(n)
public class merge_sort {
    //分离部分
    public void merge_split(int []arr,int left,int right){
        if(right-left>0){
            int middle=(right+left)/2;
            merge_split(arr,left,middle);
            merge_split(arr,middle+1,right);
            merge(arr,left,middle,right);
        }
   }
   //合成部分
   public void merge(int []arr,int a,int mid,int b){
            int help[]=new int[b-a+1];
            int p1=a;
            int p2=mid+1;
            int i=0;
            while(p1<=mid && p2<=b){
                help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
            }
            while(p1<=mid){

                help[i++]=arr[p1++];
            }
            while(p2<=b){

                help[i++]=arr[p2++];
            }
            for(int j=0;j<i;j++){
                arr[a+j]=help[j];
            }
   }
    public static void main(String []args){
        int arry[]= {8,56,34,66,77,877,2,0,45,55,1};
        merge_sort mer=new merge_sort();
        mer.merge_split(arry,0,arry.length-1);
        for(int i=0;i<arry.length;i++){
            String str=i==arry.length-1?"":",";
            System.out.print(arry[i]+str);
        }
    }

}
