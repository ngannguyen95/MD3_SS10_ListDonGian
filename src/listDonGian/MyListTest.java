package listDonGian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger=new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(4);
        listInterger.add(-1);

        System.out.println("element 0:"+listInterger.get(0));
        System.out.println("element 1:"+listInterger.get(1));
        System.out.println("element 2:"+listInterger.get(2));
        System.out.println("element -1:"+listInterger.get(-1));
    }
}
