package imooc_class;
// 創建  外部类
public class imooc_2_14 {
    // 外部类中的静态变量score
    private static int score = 84;
    //外部类的私有属性name
    private String name = "string 84";


    // 创建 静态 内部类
    public static class SInner {
        // 内部类中的变量score
        int score = 91;

        public void show() {
            imooc_2_14 newScore = new imooc_2_14();

            System.out.println("访问外部类中的score-1：" + newScore.score);     // 外部 score
            System.out.println("访问外部类中的score-2：" + imooc_2_14.score);   // 外部 score
            System.out.println("访问外部类中的score-3：" + newScore.name);      // 外部 name 静态屬性中沒有 "this"
            System.out.println("访问内部类中的score：" + score);
        }
    }


    // 取得 靜態 內部類
    // 直接创建内部类的对象
    // 重點：static 靜態屬性 可以直接使用內部的方法和變數，不需要在另外 "NEW.外部類();" (實例化)
    public static void main(String[] args) {
        // 1. 內部類 實例化
        SInner si = new SInner();

        // 2. 调用show方法
        si.show();

    }
}
