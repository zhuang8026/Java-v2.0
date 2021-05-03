package imooc_class.imooc_3_03;

import imooc_class.imooc_3_testFiles.Test001;

public class Sample02 {
    /**
     * 傳入五個數字
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * */

    /* 第一種寫法 */
    public void sort(int a, int b,int c,int d,int e) {
        int num = a + b + c + d + e;
        System.out.println("大神模組回傳參數：" + num);

        // 冒泡比大小排序算法
        int[] arr = {a,b,c,d,e};
        for( int i = 0; i< arr.length; i++ ) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* 第二種寫法 int... */
    public void sort(String str,  int... nums) {
        // 冒泡比大小排序算法
        for( int i = 0; i< nums.length; i++ ) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < nums.length; i ++) {
            System.out.print(nums[i] + " ");
        }
    }

    /* 下面為自己測試sort,並非外部傳入的類 */
//    public static void main(String[] args) {
//        Sample02 S02 = new Sample02();
//        S02.sort(3,2,7,5,8);
//    }

}
