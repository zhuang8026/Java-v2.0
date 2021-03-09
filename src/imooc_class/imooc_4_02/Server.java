package imooc_class.imooc_4_02;

public class Server {

    /**
     * 第一：
     * 如果想要 new 接口，必須先聲明 是什麼類型，
     * 因為 Sample01 繼承了interface，
     * 所以前面要聲明 接口 類別，後面才能return 接口的實現類
     **/
    public Interface contact(int num){
        if(num == 86) {
            return new Sample01(); // 第二：返回的是 interface 的實現類
            } else {
            return new Sample03(); // 第二：返回的是 interface 的實現類
        }
    }

    public static void main(String[] args) {
        // Sample01 s01 = new Sample01(); // 對象實例，並非類實現接口 (錯誤)

        Interface s01 = new Sample01(); // 接口 + 自定義名稱 = 實現類; 正確
        s01.voice();

        Interface s02 = new Sample02();
        s02.voice();

        Interface s03 = new Sample03();
        s03.voice();

        Server sv = new Server(); // 先實例化 外部類
        Interface s04 = sv.contact(86); // 第三：因為是返回 interface 的實現類，所以前面要聲明 Interface 類別
        s04.voice();
    }
}
