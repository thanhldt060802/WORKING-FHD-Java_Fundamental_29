public class MyClass1 extends MyAbstractClass {

    private String otherValue1;

    public MyClass1(String value, String otherValue1) {
        super(value);
        this.otherValue1 = otherValue1;
    }

    public String getOtherValue1() {
        return otherValue1;
    }

    public void setOtherValue1(String otherValue1) {
        this.otherValue1 = otherValue1;
    }

    @Override
    public void feature() {
        System.out.println("Good night!");
    }
    
}
