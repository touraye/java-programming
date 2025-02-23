package human;

public class Tester {
    public static void main(String[] args) {
        Man man = new Man();
        man.canWalk(true);
        man.setName("Lamin");
        man.setAge(30);
        man.setGender('m');

        //female
        Female female = new Female();
        female.setName("Fatou");
        female.setAge(20);
        female.setGender('f');

        //child
        Child child = new Child();
        child.setName("Amienata");
        child.setAge(1);
        child.setGender('f');

        //human.Boy
        Boy boy = new Boy();
        boy.setName("Alieu");
        boy.setAge(9);
        boy.setGender('m');
        boy.canPlay();
        boy.playsFootball(true);
        boy.rollTennis(false);


        System.out.println("********* Male info *********");
        System.out.println("Name: " +man.getName());
        System.out.println("Age: " +man.getAge());
        System.out.println("Gender: " +man.getGender());
        System.out.println("Can Walk: " +(man.canWalk(true) ? "Yes" : "No"));
        System.out.println("How Many Wives: " +(man.canMarriageMoreThanOneWife(2) ? "Yes" : "No"));
        man.headsUp();

        System.out.println("-------------------------------------------");

        System.out.println("********* human.Female info *********");
        System.out.println("Name: " +female.getName());
        System.out.println("Age: " +female.getAge());
        System.out.println("Gender: " +female.getGender());
        System.out.println("Can Walk: " +(female.canWalk(true) ? "Yes" : "No"));
        System.out.println("Can Produces: " +(female.canGiveBirth(false) ? "Yes" : "No"));
        female.headsUp();

        System.out.println("-------------------------------------------");

        System.out.println("********* human.Child info *********");
        System.out.println("Name: " +child.getName());
        System.out.println("Age: " +child.getAge());
        System.out.println("Gender: " +child.getGender());
        System.out.println("Can Walk: " +(child.canWalk(true) ? "Yes" : "No"));
        child.canPlay();
        child.headsUp();

    }
}
