package imooc_class;

import imooc_class.imooc_4_02.Interface;
import imooc_class.imooc_4_02.Server;

/**
 * 假設 imooc_04_02 是外部廠商的系統，
 * 我們要接他們的功能
 * 對接入口是 Server.java
 * */
public class imooc_4_02s {
    public static void main(String[] args) {
        Server sv01 = new Server(); // 實例化
        Interface outSideDemo = sv01.contact(87); // 調用 實例化類的 接口 方法
        outSideDemo.voice(); // outSideDemo 已經是 contact 所return回來的 interface 的實現類，所以就可以直接使用interface 的方法
    }

}
