package imooc_class;
// 創建  外部类
public class imooc_2_13 {
    //外部类的私有属性name
    static String name = "imooc";
    //外部类的成员属性
    int age = 20;


    // 創建 内部类
    public class Inner {
        private String name = "爱慕课";
        //内部类中的方法
        public void show() {
            System.out.println("外部类中的name：" + imooc_2_13.name);
            System.out.println("内部类中的name：" + name);
            System.out.println("外部类中的age：" + age);
        }
    }



    //测试如何使用 内部类
    public static void main(String[] args) {

        //第一：创建外部类的对象
        imooc_2_13 outDoor = new imooc_2_13 ();

        //第二：创建内部类的对象
        Inner inn = outDoor.new Inner();

        //第三：调用内部类对象的show方法
        inn.show(); // 使用內部類方法
        System.out.println("Inner name:" + inn.name); // 使用內部類的變數
    }
}
