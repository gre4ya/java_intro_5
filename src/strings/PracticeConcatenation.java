package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {

        String worldPart1 = "le";
        String worldPart2 = "ar";
        String worldPart3 = "ning";
        String world = worldPart1 + worldPart2 + worldPart3;

        System.out.println(world);

        System.out.println(worldPart1 + worldPart2 + worldPart3);

        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        String fullSentence = sentencePart1.concat(" ").concat(sentencePart2);
        System.out.println(fullSentence);

    }
}
