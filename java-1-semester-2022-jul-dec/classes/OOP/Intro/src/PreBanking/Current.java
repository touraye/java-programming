package PreBanking;

public class Current extends Bank{
    private String accType;
    public Current(String _accName, String _accNumber, double _currentBalance, String _accType) {
        super(_accName, _accNumber, _currentBalance);
        this.accType = _accType;
    }

    public String getAccType(){
        return this.accType;
    }
}
