public class conditionals {
    public String conditions() {
        String nameOfAuthor = "Harry Potter";
        int ageOfAuthor = 25;

        if(nameOfAuthor == "Harry Potter") {
            return "My name is Harry!";
        } else if (ageOfAuthor > 28) {
            return "I am not an author!";
        }
        
        return nameOfAuthor;

    }
}
