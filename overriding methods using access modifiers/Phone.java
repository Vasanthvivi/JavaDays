public abstract class Phone {
    private final String phoneName;
    private final String operatingSystem;
    private final String brandName;
    Phone(String _phoneName, String _operatingSystem, String _brandName){
        this.brandName = _brandName;
        this.operatingSystem = _operatingSystem;
        this.phoneName = _phoneName;
        System.out.println("built constructor of phone class initialized");
    }
    public abstract int computePrice();
    protected int getBasePrice(){
        return 1;
    }
    @Override
    public String toString(){
        return "Phone Name : "+this.phoneName+", Brand : "+this.brandName+", Operating System : "+this.operatingSystem;
    }
}
