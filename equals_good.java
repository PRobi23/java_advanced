public class HelloWorld{

     public static void main(String []args){
        BaseClass baseClass = new BaseClass();
        SubClass subClass = new SubClass();

        System.out.println(baseClass.equals(subClass));
        System.out.println(subClass.equals(baseClass));
     }
}


class BaseClass {
    private int field1 = 0;

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == BaseClass.class){
            return field1 == ((BaseClass) obj).field1;
        }
        return false;
    }
    
    protected boolean equalBaseFields(BaseClass other) {
        return field1 == other.field1;
    }
}

class SubClass extends BaseClass {
    private int field2 = 0;

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj.getClass() == SubClass.class){
            return super.equalBaseFields((BaseClass) obj);
        }
        return false;
    }
}