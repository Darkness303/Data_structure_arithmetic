//插入排序 O(n**2)
public class Insert_sort {
    public void Insert(int[]arr){
        int lin=0;
        for(int i=1;i<arr.length;i++) {
            for (int j = lin; j>=0; j--) {
                if(arr[j+1]<arr[j]){
                    wrap(arr,j+1,j);
                }else{
                    break;
                }

            }
            lin=lin+1;
        }
    }
    public void wrap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String []args){
        int arry[]={8,56,34,66,77,877,2,0,45,55,1};
        Insert_sort Ins=new Insert_sort();
        Ins.Insert(arry);
        for(int i=0;i<arry.length;i++){
            String str=i==arry.length-1?"":",";
            System.out.print(arry[i]+str);

        }

    }


}
