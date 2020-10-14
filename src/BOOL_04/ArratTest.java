package BOOL_04;

public class ArratTest {
    public static void main(String[] args) {
        //初始数组
        int elements[] = {1, 2, 3, 4, 5, 6};
        //其他的语句
        //增大后的新数组
        int hold[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //把elements数组中的所有元素复制到hold数组中，下标从0开始
        System.arraycopy(elements, 0, hold, 0, elements.length);
    }
}
