package bookexercises.dataAnalizer;

public class DataSet {
    private double sum;
    private double maximum;
    private double count;

    public DataSet(){
        sum = 0;
        maximum = 0;
        count = 0;
    }

    public void add(double x){
        sum = sum + x;//setting sum to the value of x
        if(count == 0 || maximum < x) maximum = x;
        count++;
    }

    public double getAverage(){
        if(count == 0) return 0;
        else return  sum / count;
    }

    public double getMaximum(){
        return maximum;
    }
}
