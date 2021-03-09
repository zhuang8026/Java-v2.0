package imooc_class.imooc_4_01;

/* 繼承 Sample01 */
/* 子 繼承 父 */
/* 子類 會繼承 父類的 default/protected/public 修飾的成員變量與方法 */
public class Sample02 extends Sample01 {
    public static void main(String[] args) {
        Sample02 s02 = new Sample02();
        s02.title = "旺嗝二號";
        s02.color = "灰色";
        s02.movie = "果敢不見了";
        s02.demo1();
//      s02.demo2(); // error demo2() is private
    }
}