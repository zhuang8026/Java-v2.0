package imooc_class.imooc_3_02;

/* 訪問修飾符 + 類 + 類名 */
public class Sample01 {
    //  public 定義成員變量(公共)
    public String name;

    // private 只能在當前 類(Sample01) 中使用
    private void sayHello() {
        System.out.println("sayHello");
    }

    // default 默認修飾符，只能被包（imooc_3_02）中其他類訪問
    // 其他類 => Sample01 && Sample02
    // imooc_3_02 包之外的java files，無法訪問到
    void sayBye() {
        System.out.println("sayBye");
    }

    public static void main(String[] args) {
        Sample01 s01 = new Sample01();
        s01.sayHello(); // 本包，可自己使用 private 方法
    }
}
