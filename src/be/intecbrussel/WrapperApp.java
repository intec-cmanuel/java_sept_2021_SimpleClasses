package be.intecbrussel;

public class WrapperApp {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(45, 88));

        int a = 4;
        int b = 8;
        int c = 3;
        int d = 9;

        System.out.println(Integer.max(Integer.max(a, b), Integer.max(c, d)));

        Integer myInt = 45;
        Double mydouble = 45.33;
        long myLong = a;
        Long veryLong = myLong;
        Long mLong = 34L;

        int smallInt = 10;
        Integer objectInt = 10;
        incrementInteger(smallInt);
        incrementInteger(objectInt);
        System.out.println(smallInt);
        System.out.println(objectInt);


        String s = new String("hello");
        String s2 = new String("hello");
        System.out.println(s.equals(s2));

        Integer i1 = -129;
        Integer i2 = -129;
        int i3 = 4;
        int i4 = 4;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3 == i4);

        System.out.printf("My age is %d", 24);
    }

    private static void incrementInt(int number) {
        number++;
    }

    private static void incrementInteger(Integer number) {
        number++;
    }
}
