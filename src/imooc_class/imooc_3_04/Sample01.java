package imooc_class.imooc_3_04;

/* 訪問修飾符 + 類 + 類名 */
public class Sample01 {
    public String owner; // 所有者
    public long mobileNumber; // 手機號

    private String name = "william";
    private String areaCode = "86"; // 國家區號
    /* private 如果想要被其他類，進行取得 和 修改 */
    /* 必須設置getter and setter */
    /* 這就是 變量 的讀寫封裝 */
    public String getAreaCode() {
        return this.areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /* 這就是 變量 的只讀封裝 */
    public String getName() {
        return this.name;
    }
}
