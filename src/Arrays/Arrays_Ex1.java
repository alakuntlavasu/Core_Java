package Arrays;

public class Arrays_Ex1 {
    public static void main(String[] args) {
        // 1 Array declaration
        int[]ids;

        // 2 Array creation
        ids=new int[4];

       // System.out.println(ids);// integer Adders

        //3 Array initialization
        System.out.println(ids[0]);//
        System.out.println(ids[1]);
        System.out.println(ids[2]);
        System.out.println(ids[3]);

        ids[0]=100;
        ids[1]=101;
        ids[2]=102;
        ids[3]=103;
        System.out.println(ids[0]);
        System.out.println(ids[1]);
        System.out.println(ids[2]);

    }
}
// 1 what is Array in java?

// * Arrays as group of Homogenous element as one entity
// *Arrays are duplicate element allowed
// * Arrays values stored in indexing concept only
// * insertion order is preserved
// * Arrays length property is applicable
// ** arrays are fixed in nature once declare Array we can't increase and decrease