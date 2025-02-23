package iphone;

public abstract class Iphone {
    private String brandName;
    private String brandYear;
    private String screenSize;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandYear() {
        return brandYear;
    }

    public void setBrandYear(String brandYear) {
        this.brandYear = brandYear;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    //call method
    public void call(){
        System.out.println("Iphone makes voice call");
    }

    //message method
    public void message(){
        System.out.println("Iphone can send text message");
    }

    //camera method
    public void camera(){
        System.out.println("Iphone have camera");
    }

    //google map method
    public void googleMap(){
        System.out.println("Iphone uses google map");
    }

    //Ipod method
    public void iPod(){
        System.out.println("Iphone have Ipod ");
    }

    //browser method
    public void browser(){
        System.out.println("Iphone uses only safari browser");
    }

    //email method
    public void email(){
        System.out.println("Iphone use HTML email");
    }

    //abstract method
    public abstract String batteryLife(int percentage);
}
