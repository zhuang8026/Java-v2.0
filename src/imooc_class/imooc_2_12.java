package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_12 {
    // 内部类Inner，类 Inner1 在类 imooc_2_12 的内部
    public class Inner1 {
        // 内部类的方法
        public void show() {
            System.out.println("welcome to imooc!");
        }

    }

//    内部类Inner，类 Inner2 在类 imooc_2_12 的内部
//    public class Inner2 {
//        // 内部类的方法
//        public void show() {
//            System.out.println("welcome to imooc!");
//        }
//    }

    public static void main(String[] args) {

        // 如何使用 內部類 ？
        // 第一步: 创建 外 部类对象 imooc_2_12
        imooc_2_12 william = new imooc_2_12();

        // 第二步: 创建 内 部类对象 Inner1
        Inner1 i = william.new Inner1();

        // 第三步: 调用 内 部类对象的方法
        i.show();
    }
}
