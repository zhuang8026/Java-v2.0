package imooc_class.imooc_3_02;

import imooc_class.imooc_3_testFiles.Test001;

public class Sample02 {
    public static void main(String[] args) {
        /* 引入本包，可直接使用 */
        Sample01 s01 = new Sample01();
        s01.name = "william";   // public
        s01.sayBye();           // default 默認修飾符，只有在 imooc_3_02 中的files才可以使用，請查看 imooc_3_testFiles
        // s01.sayHello();      // 會提示：sayHello is private

        /* 引入其他包，會自動import */
        Test001 t01 = new Test001();
        t01.callBack01();
    }

}
