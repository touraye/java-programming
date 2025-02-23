package bookexercises.nested;

public class DrawStars {
    public static void main(String[] args) {
        System.out.println("We are drawing stars");
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
