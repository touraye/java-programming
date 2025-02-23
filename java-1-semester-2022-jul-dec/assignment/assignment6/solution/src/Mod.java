import java.util.ArrayList;

public class Mod {
    private String name;
    private int age;
    String gc;
    protected boolean hasPass;
    private ArrayList<String> list = new ArrayList<>();


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Has Pass: " +hasPass);
    }

    public void getGc(){
        System.out.println(gc);
    }

    //setter for list
    public void setList(String item1, String item2){
        this.list.add(item1);
        this.list.add(item2);
        this.list.add("cake");
    }

    //getter for list

    public ArrayList<String> getList() {
        return list;
    }
}
