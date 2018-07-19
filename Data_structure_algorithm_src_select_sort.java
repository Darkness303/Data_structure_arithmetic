//选择排序 时间复杂度o（n**2）
public class select_sort {
    public void select(int []arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i-1]>arr[j]){
                    wrap(arr,i-1,j);
                }
            }
        }

    }
    public void wrap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String []args){
        int []arry={8,56,34,66,77,877,2,0,45,55,1};
        select_sort sel=new select_sort();
        sel.select(arry);
        //输入排序结果
        for (int i=0;i<arry.length;i++){
            String tail=i== arry.length-1?"":",";
            System.out.print(arry[i]+tail);
        }






    }
}
