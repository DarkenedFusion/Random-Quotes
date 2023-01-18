import java.util.*;

class Main {
  public static void main(String args[]) {

    generateQuote(10);

  }

  public static String generateQuote(int quoteNum) {

    String randomQuote = "";

    // Quotes from
    // https://uk.indeed.com/career-advice/career-development/quotes-by-famous-authors

    String[] quotes = { "To live is the rarest thing in the world. Most people exist, that is all.",
        "That it will never come again is what makes life so sweet.",
        "It is never too late to be what you might have been.",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.",
        "Pain is inevitable. Suffering is optional.",
        "All the worlds a stage, and all the men and women merely players.",
        "Be kind, for everyone you meet is fighting a hard battle.",
        "Unable are the loved to die for love is immortality.",
        "Let me live, love, and say it well in good sentences.",
        "Dont let your happiness depend on something you may lose.",
        "We are all broken, thats how the light gets in.",
        "Appreciation is a wonderful thing. It makes what is excellent in others belong to us as well.",
        "Life is tough my darling, but so are you.",
        "Self-awareness and self-love matter. Who we are is how we lead.",
        "Amateurs sit and wait for inspiration, the rest of us just get up and go to work." };

    for (int i = 0; i < quoteNum; i++) {
      Random random = new Random();
      int rnum = random.nextInt(quotes.length);
      randomQuote = quotes[rnum];
      System.out.println(randomQuote);
      System.out.println("");
    }

    return randomQuote;
  }
}
