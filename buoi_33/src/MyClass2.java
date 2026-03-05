public class MyClass2 extends MyAbstractClass {

    private String otherValue2;

    public MyClass2(String value, String otherValue2) {
        super(value);
        this.otherValue2 = otherValue2;
    }

    public String getOtherValue() {
        return otherValue2;
    }

    public void setOtherValue2(String otherValue2) {
        this.otherValue2 = otherValue2;
    }

    @Override
    public void feature() {
        System.out.println("Good morning!");
    }
    
}
