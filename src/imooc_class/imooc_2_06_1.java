package imooc_class;


/* 1. 定義一個類 */
public class imooc_2_06_1 {

    static final double PI = 3.141596;

    static double toRadians(double angdeg) { // 角度轉徑度
        return angdeg * (imooc_2_06_1.PI / 180);
    }

    public static void main(String[] args) {
        imooc_2_06_1 im = new imooc_2_06_1();
        /* static 方法不建議在 new */
        System.out.println(im.PI);
        System.out.println(im.toRadians(100));

        /* static 方法,可直接使用class.method() or variable */
        double num = imooc_2_06_1.toRadians(100); // 可直接使用，不需要在new
        System.out.println(num);

    }
}
