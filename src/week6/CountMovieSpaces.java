package week6;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String favouriteQuote = "PUT THE COOKIE DOWN!";
        int countSpaces = 0;
        for (int i=0; i<favouriteQuote.length(); ++i){
            if (favouriteQuote.charAt(i) == ' '){
                ++countSpaces;
            }
        }
        System.out.println("This quote has " + countSpaces + " spaces in it");
    }

}
