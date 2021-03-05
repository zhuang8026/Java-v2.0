package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_02 {
    /* 2. 屬性 */
    float screen;
    float cpu;
    float mem;

    int num; // 1-5

    /* 3. 方法 */
    void call(){
        int localnum = 999; // 局部變量 必須自己賦予初始值
        System.out.println("有打電話功能");
        System.out.println("num(成員變量):" + num);  // 1-5 成員變量
        System.out.println("localnum(局部變量):" + localnum);  // 1-5 局部變量
    };

    void sendMessage(){
        System.out.println("screen:" + screen);
        System.out.println("cpu:" + cpu);
        System.out.println("mem:" + mem);
        System.out.println("有發短息功能");
        // System.out.println("localnum(局部變量):" + localnum);  // 1-5 局部變量 這裏不能使用 localnum(局部變量)
    };
}
