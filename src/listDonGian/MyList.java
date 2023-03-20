package listDonGian;

import java.util.Arrays;

// tạo lớp MyList với các thuộc tính cơ bản
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    // tăng gấp đôi kích thước mảng của các phần tử
    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    // thêm 1 phần tử vào cuối danh sách
    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    // cài đặt phuowng thức get trả về phần tử vửa ở vị trí thứ i trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ",size: " + i);
        }
        return (E) element[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
