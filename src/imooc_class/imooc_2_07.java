package imooc_class;


/* 1. 定義一個類 */
public class imooc_2_07 {
    String name;    // 声明变量name
    String sex;     // 声明变量sex
    static int age; // 声明静态变量age

    // 构造方法
    public imooc_2_07() {
        System.out.println("通过构造方法初始化name");
        name = "tom";
    }

    // 初始化块
    {
        System.out.println("通过初始化块初始化sex-1");
        sex = "男";
    }

    // 初始化块
    {
        System.out.println("通过初始化块初始化sex-2");
    }

    // 静态初始化块
    static {
        System.out.println("通过静态初始化块初始化age-1");
        age = 20;
    }

    // 静态初始化块
    static {
        System.out.println("通过静态初始化块初始化age-2");
    }

    // 有 void 說明沒有回傳值
    public void show() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
    }

    public static void main(String[] args) {
        // 创建对象
        imooc_2_07 William = new imooc_2_07();

        // 调用对象的show方法
        William.show();
    }
}
