package human;

public class Human {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //walking behaviour
    public boolean canWalk(boolean walking){
        if(walking){
            return true;
        }
        return false;
    }

    public void headsUp(){
        System.out.println("Humans can think!");
    }
}
