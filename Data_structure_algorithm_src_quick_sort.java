public class quick_sort {
    public void quick(int []arr,int left,int right){
//        int random=(int)Math.random()*(right-left+1);
        int L=left;
        int R=right;
        if(L<R){
            for(int p=L+1;p<=R;){//注意这个等号

                if(arr[L]<arr[p]) {
                    wrap(arr, p, R);
                    R=R-1;
                }else if(arr[L]==arr[p])
                    p=p+1;
                if(arr[L]>arr[p]){
                    wrap(arr,L,p);
                    L=L+1;
                    p=p+1;
                }
            }
            quick(arr,left,L-1);
            quick(arr,R+1,right);
        }
    }
    public void wrap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String []args){
        int arry[]={8,56,34,66,77,877,2,0,45,55,1};
        quick_sort qu=new quick_sort();
        qu.quick(arry,0,arry.length-1);
        for(int i=0;i<arry.length;i++){
            String str=i==arry.length-1?"":",";
            System.out.print(arry[i]+str);
        }

    }
}
