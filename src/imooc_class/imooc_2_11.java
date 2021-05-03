package imooc_class;
/* 1. 定義一個類 */
public class imooc_2_11 {
    /* private 只能在當前此文件（imooc_2_11）使用 */
    /* private 可以使用在 變量 方法 都可以 */
    private float screen;
    private float cpu;
    private int memberV2; /* 練習 */

    /* 全世界都可以訪問使用 */
    public int cpu2;

    public void sendMessage() {
        System.out.println("sendMessage");
    }


    // start ---- 自動生成 Code / Generate..
    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }
    // end ---- 自動生成 Code / Generate..

    // 練習
    public int getMemberV2() {
        return memberV2;
    }
    public void setMemberV2(int memberV2) {
        this.memberV2 = memberV2;
    }

    public void imooc_2_11() {
        System.out.println("demo_imooc_入門二 files -> 無-參數的構造方法執行了！");
    }

    public void imooc_2_11(float a, float b, float c, Float d){
        screen = a;
        cpu = b;
        memberV2 = (int) c; // 基本型轉基本型
        memberV2 = d.intValue(); // 物件轉基本型
        System.out.println("有-參數的構造方法執行了！");

        /* 以下為練習，沒有任何作用 */
        imooc_2_11 im0211 = new imooc_2_11();
        im0211.setScreen(1);
        im0211.setCpu(2);
    }
}
