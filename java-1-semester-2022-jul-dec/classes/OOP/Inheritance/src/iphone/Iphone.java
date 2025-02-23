package iphone;

public class Iphone {
    private String brandName;
    private String touchScreen;
    private String brandYear;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getBrandYear() {
        return brandYear;
    }

    public void setBrandYear(String brandYear) {
        this.brandYear = brandYear;
    }

    public void email(){
        System.out.println("iPhone have HTML email feature!");
    }

    public void browser(){
        System.out.println("iPhone support Safari web browser only!");
    }

    public void messaging(){
        System.out.println("iPhone have text messaging app");
    }

    public void music(){
        System.out.println("iPhone have text iPod app");
    }

    public void video(){
        System.out.println("iPhone have a video playing app");
    }

    public void youTube(){
        System.out.println("iPhone have YouTube app");
    }

    public void mapApp(){
        System.out.println("iPhone have google map app");
    }
}
