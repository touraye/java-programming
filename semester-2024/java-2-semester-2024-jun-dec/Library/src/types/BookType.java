package types;

public enum BookType {
    /*
    The possible book types for our library
     */
    FICTION,
    NON_FICTION,
    MYSTERY,
    BIOGRAPHY,
    SCIENCE_FICTION,
    ROMANCE,
    THRILLER,
    HORROR,
    HISTORY,
    POETRY;


    @Override
    public String toString(){
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", "");
    }
}
