package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_04 {
    /* 2. 屬性 */
    private float aa; // private 是私有的
    private float bb;
    private float cc;
    /* 3. 方法 */

    /* 4. 構造方法 */
    public imooc_2_04() { /* 構造名 必須和 類名 一樣 */
        System.out.println("無參數的構造方法執行了！");
    }

    /* 4. 構造方法 */
    public imooc_2_04(float a, float b, float c) { /* 構造名 必須和 類名 一樣 */
        System.out.println("----- Demo3_1 -----");
        System.out.println("----- 帶參數的構造方法 -----");
        if(a > 2.5f){
            System.out.println("您輸入的參數不能大於 2.5, 自動賦值2.5");
            aa = 2.5f;
        } else{
            aa = a;
        }

//        aa = a;
        bb = b;
        cc = c;
        System.out.println("imooc_2_04:" + aa);
        System.out.println("imooc_2_04:" + bb);
        System.out.println("imooc_2_04:" + cc);
    }
}
