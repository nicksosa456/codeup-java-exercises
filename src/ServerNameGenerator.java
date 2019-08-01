public class ServerNameGenerator {
    private static String[] adjectives = {"brave", "huge", "grumpy", "witty", "calm", "lazy", "shy", "talented", "clever", "dead"};
    private static String[] nouns = {"computer", "music", "food", "internet", "society", "energy", "student", "office", "unit", "lake"};

    public static int randomNum(String array[]) {
        return (int) Math.floor(Math.random()*array.length);
    }

    public static void main (String[] args) {
        int adjNum = randomNum(adjectives);
        int nounNum = randomNum(nouns);

        System.out.println("Here is a random server name: ");
        System.out.printf("%s-%s", adjectives[adjNum], nouns[nounNum]);
    }
}