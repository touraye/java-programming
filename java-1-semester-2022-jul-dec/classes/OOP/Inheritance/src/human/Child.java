package human;

public class Child extends Human{
    public void canPlay(){
        System.out.println("human.Child always play!");
    }

    public boolean playsFootball(boolean kicksTheBall){
        if (kicksTheBall){
            return true;
        }
        return false;
    }

    public boolean rollTennis(boolean rollTheTennis){
        if (rollTheTennis){
            return true;
        }
        return false;
    }
}
