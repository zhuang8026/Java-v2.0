package imooc_class;

import java.util.ArrayList;
import java.util.List;

public class imooc_4_033 {
    public static void main(String[] args) {
        /*
         * ArrayList 是取代 array 的使用
         * */

        List<String> bookList = new ArrayList<String>(20); // 1. 生成 arrayList 2. <E> 約束 數據類型，稱為 "泛型", E只是一個型態參數（表示Element）
        bookList.add("TSM");
        bookList.add("OCGN");
        bookList.add("TSLA");
        bookList.add("BLINK");
        bookList.add("GPRO");
        bookList.add("SPWR");
        bookList.add(0, "SUNW");

        System.out.println("0-add:" + bookList);

        String bookName = bookList.get(2); // get 方法只需要傳入 索引
        System.out.println("1-get:" + bookName);

        int bookSize = bookList.size();
        System.out.println("2-size:" + bookSize);

        bookList.remove(3);
        System.out.println("3-remove:" + bookList);

        bookList.remove(bookList.size() - 1);
        System.out.println("4-remove:" + bookList);

        for (String book: bookList) { /* 遍歷bookList，將每次循環遍歷到book中 */
            System.out.println("《" + book  + "》");
        }
    }

}
