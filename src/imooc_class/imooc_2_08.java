package imooc_class;


/* 1. 定義一個類 */
public class imooc_2_08 {
    private float screen;
    private float cpu;
    private float member;

    public float getScreen(){
        return screen;
    }

    public void setScreen( float newData){
        screen = newData;
    }

    public imooc_2_08() {
        System.out.println("demo_imooc_入門二 files -> 無-參數的構造方法執行了！");
    }

    public imooc_2_08( float a, float b, float c){
        screen = a;
        cpu= b;
        member= c;
        System.out.println("有-參數的構造方法執行了！");
    }

    /* 使用已經封裝好的對象 */
//    public static void main(String[] args) {
//        imooc_2_08 im = new imooc_2_08(1,2,3);
//        im.setScreen(1.1f);
//        System.out.println(im.getScreen());
//        System.out.println(im.cpu);
//    }
}
