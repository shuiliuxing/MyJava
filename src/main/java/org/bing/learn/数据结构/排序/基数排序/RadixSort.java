package org.bing.learn.数据结构.排序.基数排序;

public class RadixSort {
    public static void main(String[] args){
        int[] arr={80,14,8,96,92,73,41,67,33};
        sort(arr);      //非递归
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(int[] arr){
        int max=arr[0];
        int ge;   //指数
        //最大值
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //从个位开始，对数组进行排序(1)
        for(ge=1; max/ge>0; ge*=10)
        {
            int[] bucket=new int[10];       //分桶个数（0~9）
            //将数据出现的次数存储在bucket
            for(int value:arr){
                bucket[(value/ge)%10]++;    //保存余数相同的个数（取没一趟的取余后的位数，最后都是0~9的余数）
            }
            //更改bucket,完成后bucket[i]就是第i个桶的右边界
            for(int i=1;i<10;i++){
                bucket[i]+=bucket[i-1];
            }
            //将数据存储到临时数组tmp
            //利用循环把数据装入各个桶中，注意是从后往前装
            int[] tmp=new int[arr.length];
            //注意：从后往前遍历，能准确定位在哪个桶，最后在新数组哪个k位置
            for(int i=arr.length-1;i>=0;i--)
            {
                int k=bucket[(arr[i]/ge)%10]-1;     //取出一个，后对应桶元素个数-1
                tmp[k]=arr[i];
                System.out.println(((arr[i]/ge)%10)+"\t"+k+"\t"+tmp[k]);
                bucket[(arr[i]/ge)%10]--;   //相同余数-1
            }
            //将桶的数据取出，赋值给arr
            //System.arraycopy(tmp, 0, arr, 0, arr.length);
            for(int i=0;i<arr.length;i++){
                arr[i]=tmp[i];
            }
        }
    }
}
