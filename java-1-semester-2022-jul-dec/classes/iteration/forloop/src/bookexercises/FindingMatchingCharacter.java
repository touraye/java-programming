package bookexercises;

public class FindingMatchingCharacter {
    public static void main(String[] args) {
        String str = "MANY";
        boolean found = false;
        char ch = '?';
        int position = 0;
        while (!found && position < str.length())
        {
            ch = str.charAt(position);
            if (Character.isLowerCase(ch)) { found = true; }
            else { position++; }
        }
        System.out.println(found ? "The first found matched character lowercase in " +str+ " is " +ch : "There is no lowercase character in " +str);
    }
}
