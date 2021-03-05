package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_06 {
    // 定义静态变量score1
    static int score1 = 86;

    // 定义静态变量score2
    static int score2 = 92;

    // 定义静态方法sum，计算成绩总分，并返回总分
    public static int sum() {
        return score1 + score2;
    };

    public static void main(String[] args) {
        imooc_2_06 allScore1 = new imooc_2_06();
        int allScore2 = allScore1.sum();

        System.out.println("总分：" + allScore2);
    }
}
