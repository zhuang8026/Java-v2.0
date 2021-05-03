package imooc_class.imooc_4_03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample01 {
    public static void main(String[] args) {
        /* List 是接口 */
        /* ArrayList 是實現類，他實現了List接口 */
        /* new ArrayList<"必須是物件：String Integer Boolen..."> */
        /* <String> ===> 數據類型為 字串 */
        /* <Interager> (泛型)  ===> 數據類型為 數字 */
        List<String> bookList = new ArrayList<String>(10);
        bookList.add("TSM");
        bookList.add("ETH");
        bookList.add("AAL");
        bookList.add("APPL");
        bookList.add("TSLA");

        /* 在最前面添加數組內容 === js 的 unshift() */
        bookList.add(0, "William");

        System.out.println(bookList);

        /* ------------- 取得特定位置數組資料 ------------- */
        String num = bookList.get(1);
        System.out.println(num);

        /* ------------- 取得數組的數量 ------------- */
        int numSize = bookList.size();
        System.out.println(numSize);

        /* ------------- 刪除特定數組 ------------- */
        String numRemove1 = bookList.remove(1); // 刪除指定
        String numRemove2 = bookList.remove(bookList.size() - 1 ); // 刪除最後
        System.out.println(numRemove1);
        System.out.println(numRemove2);

        /* ------------- LIst 迴圈 ------------- */
        for( String list : bookList ){
            System.out.println("《" + list + "》");
        }


    }
}
