package utg.student;

public class Student {
        String name;
        int year;
        String matNumber;
        String address;

        public Student(String _name, int _year, String _matNumber, String _address){
            this.name = _name;
            this.year = _year;
            this.matNumber = _matNumber;
            this.address = _address;
        }

        //display
    public void display(){
        System.out.println(this.name+ "             " +this.year+ "             " +this.matNumber+ "             " +this.address);
    }
}
