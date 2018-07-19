//冒泡排序 时间复杂度o(n**2)
public class bubble_sort {

    public void bubble(int []arr){
        //int max=arr[0];
        for(int i=arr.length;i>1;i--) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1])
                    wrap(arr,j);
            }
        }
    }
    public void wrap(int []arr,int j){
        int tmp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=tmp;
    }
    public static void main(String []args){
        int arry[]={8,56,34,66,77,877,2,0,45,55,1};
        bubble_sort bub=new bubble_sort();
        bub.bubble(arry);
        //输入排序结果
        for (int i=0;i<arry.length;i++){
            String tail=i== arry.length-1?"":",";
            System.out.print(arry[i]+tail);
        }



    }
}
