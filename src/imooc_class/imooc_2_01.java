package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_01 {
    /* 2. 屬性 */
    float screen;
    float cpu;
    float mem;

    /* 3. 方法 */
    void call(){
        System.out.println("有打電話功能");
    };

    void sendMessage(){
        System.out.println("有發短息功能");
    };

    /* 引用類 */
    public static void main(String[] args) {
        imooc_2_01 im = new imooc_2_01();
        im.call();
        im.sendMessage();

    }
}
