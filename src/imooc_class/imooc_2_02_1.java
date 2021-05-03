package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_02_1 {
    public static void main(String[] args) {
        /* 後端語言特性：在同一個資料夾不要import，可以直接引入 */
        imooc_2_02 phone = new imooc_2_02();

        /* float形變賦值時需要加 "f",否則默認 浮點數 是 double 型 */
        phone.screen = 5.0f;
        phone.cpu = 1.4f;
        phone.mem = 2.0f;

        /* 調用對象的方法 */
        phone.sendMessage();
    }
}
