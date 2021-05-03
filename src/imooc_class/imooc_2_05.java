package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_05 {
    // 定义静态变量，保存班级名称
    String className = "JAVA开发一班";

    public static void main(String[] args) {

        // 访问静态变量，输出班级名称
        imooc_2_05 demo = new imooc_2_05();
        System.out.println(demo.className);
    }
}
