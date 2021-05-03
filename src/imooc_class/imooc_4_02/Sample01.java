package imooc_class.imooc_4_02;

import java.util.List;

/* 訪問修飾符 + 類 + 類名 */
public class Sample01 implements Interface{

    @Override
    public void voice(){
        System.out.println("Sample01 voice method");
    }

//    接口可以有自己的方法嗎？
//    public void click(){
//        System.out.println("Sample01 click method");
//    }
}
