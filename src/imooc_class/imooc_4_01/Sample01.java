package imooc_class.imooc_4_01;

/* 訪問修飾符 + 類 + 類名 */
public class Sample01 {
    /* 只有在繼承的子類能訪問 */
    protected String title;
    protected String color;
    protected String movie;

    public void demo1(){
        System.out.println("型號:" + title );
        System.out.println("顏色:" + color);
        System.out.println("出現電影:" + movie);
    }

    private void demo2(){
        System.out.println("這是 demo2");
    }

    /* 測試 */
//    public static void main(String[] args) {
//        Sample01 s01 = new Sample01();
//        s01.title = "旺嗝1號";
//        s01.color = "土黃色";
//        s01.movie = "那一年，我吃過的果敢";
//        s01.demo1();
//        s01.demo2();
//    }
}
