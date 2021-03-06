package imooc_class;


/* 1. 定義一個類 */
public class imooc_2_08s {

    /* 使用已經封裝好的對象 */
    public static void main(String[] args) {
        imooc_2_08 im = new imooc_2_08(1,2,3);
        im.setScreen(1.1f);
        System.out.println(im.getScreen());
//        System.out.println(im.cpu); // cpu 私有属性
//        System.out.println(im.screen); // screen 私有属性

    }
}
