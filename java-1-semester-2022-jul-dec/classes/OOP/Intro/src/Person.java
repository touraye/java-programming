public class Person {
    private String name;
    private int age;
    private String address;

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int _age){
        age = _age;
    }

    public int getAge(){
        return age;
    }

    public void setAddress(String _address){
        address = _address;
    }

    public String getAddress(){
        return address;
    }

    //custom method
    public void canTalk(){
        System.out.println("I can speak spanish!");
    }

    public boolean canWalk(boolean canYouWalk){
        if(canYouWalk){
            return true;
        }
        return false;
    }
}
