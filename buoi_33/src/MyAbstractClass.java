public abstract class MyAbstractClass {

    private String value;

    public MyAbstractClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract void feature();
    
}
