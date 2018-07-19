//堆排序o(n*logn)
public class heap_sort {
    public void heap(int []arr,int length){
            if(length>1){
                for(int i=length-1;i>=0;i--){
                    adjust_heap(arr,i);
                }
                wrap(arr,0,length-1);
                heap(arr,length-1);
            }
    }
    public void adjust_heap(int []arr,int i){
        if((int)Math.floor((i-1)/2)>=0 && arr[i]>arr[(int)Math.floor((i-1)/2)]){
            wrap(arr,i,(int)Math.floor((i-1)/2));
        }
    }
    public void wrap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String []args){
        int arry[]={8,56,34,66,77,877,2,0,45,55,1};
        heap_sort he=new heap_sort();
        he.heap(arry,arry.length);
        for(int i=0;i<arry.length;i++){
            String str=i==arry.length-1?"":",";
            System.out.print(arry[i]+str);
        }
    }
}
