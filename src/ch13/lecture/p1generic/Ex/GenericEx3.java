package ch13.lecture.p1generic.Ex;

import com.sun.jdi.Value;

public class GenericEx3 {
    public static <T> Box3<T>boxing(T t) {
        Box3<T> box = new Box3<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box3<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
