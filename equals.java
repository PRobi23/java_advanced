class BaseClass {
    private int field1 = 0;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseClass) {
            return field1 == ((BaseClass) obj).field1;
        }
        return false;
    }
}

class SubClass extends BaseClass {
    private int field2 = 0;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SubClass) {
            return super.equals(obj) 
                    && field2 == ((SubClass) obj).field2;
        }
        return false;
    }
}

public class HelloWorld{

     public static void main(String []args){
        BaseClass baseClass = new BaseClass();
        SubClass subClass = new SubClass();

        System.out.println(baseClass.equals(subClass));
        System.out.println(subClass.equals(baseClass));
     }
}