package imooc_class.imooc_3_03;

/* 訪問修飾符 + 類 + 類名 */
public class Sample01 {
    public static void main(String[] args) {
        Sample02 S02 = new Sample02();
        S02.sort(6,2,3,4,5); // method 1 使用類(Sample02)封裝的方法
        S02.sort("6",2,3,4);     // method 2 使用類(Sample02)封裝的方法

    }
}
