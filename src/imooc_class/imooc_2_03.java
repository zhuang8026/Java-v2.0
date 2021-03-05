package imooc_class;
/* 1. 定義一個類 */
public class imooc_3_01 {
    /* 2. 屬性 */
    float aa; // 全域變數
    float bb;
    float cc;
    /* 3. 方法 */

    /* 4. 構造方法 */
    public imooc_3_01(float a, float b, float c) { /* 構造名 必須和 類名 一樣 */
        int num = 1; // 局部變數
        System.out.println("----- imooc_3_01 -----");
        System.out.println("帶參數的構造方法執行了！");
        aa = a;
        bb = b;
        cc = c;
        System.out.println("Demo3_1_1" + aa);
        System.out.println("Demo3_1_1" + bb);
        System.out.println("Demo3_1_1" + cc);
    }
}
