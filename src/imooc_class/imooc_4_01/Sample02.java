package imooc_class.imooc_4_01;

/* 繼承 Sample01 */
/* 子 繼承 父 */
/* 子類 會繼承 父類的 default/protected/public 修飾的成員變量與方法 */
public class Sample02 extends Sample01 {
    public void demo1(){
        System.out.println("我是子類方法");
<<<<<<< HEAD
        super.demo1();
=======
        super.demo1();  // super 是指父類別
                        // 這裏是 呼叫父類別的demo1方法
                        // 當 子父 方法一樣的時候，Sample02 不能直接使用 Sample01 的方法，必須用super
>>>>>>> 3835ed3 ([mbp16 push]extends and interface 複習)
    }

    public void demo01Father(){
        super.demo1();
    }

    public static void main(String[] args) {
        Sample02 s02 = new Sample02();
        s02.title = "旺嗝二號";
        s02.color = "灰色";
        s02.movie = "果敢不見了";
<<<<<<< HEAD
        s02.demo1();
=======
        s02.demo1(); // 子父 方法一樣，需這樣處理
>>>>>>> 3835ed3 ([mbp16 push]extends and interface 複習)
//        s02.demo01Father();
    }
}