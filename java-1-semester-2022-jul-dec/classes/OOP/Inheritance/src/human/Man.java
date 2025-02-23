package human;

public class Man extends Human{
    public boolean canMarriageMoreThanOneWife(int howManyWives){
        if(howManyWives <= 1){
            return false;
        }
        return true;
    }

    @Override
    public void headsUp(){
        System.out.println("human.Man can think!");
    }
}
