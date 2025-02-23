package human;

public class Female extends Human{

    //female can give birth
    public boolean canGiveBirth(boolean canProduce){
        if(canProduce){
            return true;
        }
        return false;
    }
}
