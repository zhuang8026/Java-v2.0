package imooc_class.imooc_3_04;

public class Sample02 {
    public static void main(String[] args) {
        Sample01 s01 = new Sample01();
        s01.owner = "william"; // public

        /* 如何設置和取得其他 類 的 private ？ */
        // s01.areaCode = "99"; // private 不能直接使用
        s01.setAreaCode("999");  // 寫
        String areaCode = s01.getAreaCode(); // 讀
        System.out.println(areaCode);

        s01.getName(); // 讀
    }
}