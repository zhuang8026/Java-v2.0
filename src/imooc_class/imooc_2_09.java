package imooc_class;


/* 1. 定義一個類 */
public class imooc_2_09 {
    /* private 只能在當前此文件（Demo6_2_3）使用 */
    /* private 可以使用在 變量 方法 都可以 */
    private float screen;   /* <---------- */
    private float cpu;      /* <---------- */
    private float member;   /* <---------- */

    /* 全世界都可以訪問使用 <---------- */
    public int cpu2;

    public float getScreen(){
        return screen;
    }

    public void setScreen( float newData){
        screen = newData;
    }

    public imooc_2_09() {
        System.out.println("demo_imooc_入門二 files -> 無-參數的構造方法執行了！");
    }

    public imooc_2_09(float a, float b, float c){
        screen = a;
        cpu= b;
        member= c;
        System.out.println("有-參數的構造方法執行了！");
    }
}
