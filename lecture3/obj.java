package lecture3;

public class obj {
    public static void main(String[] args) {
        Object o = 1; GetType(o);  // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object obj_1, Object obj_2) {
        if (obj_1 instanceof Double && obj_2 instanceof Double) {
            return (Object)((Double) obj_1 + (Double) obj_2);
        } else if(obj_1 instanceof Integer && obj_2 instanceof Integer) {
            return (Object)((Integer) obj_1 + (Integer) obj_2);
        }else return 0;
    }
}
