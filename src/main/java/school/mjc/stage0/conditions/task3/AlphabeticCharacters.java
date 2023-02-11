package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character=='A' || character=='o' ||character=='O' || character == 'i' || character=='I' || character=='e' ||character=='E' || character=='u' ||character=='U' ) {
            System.out.println("Vowel");
        } else if ((character>64 && character<91) || (character>96 && character<123)) {
            System.out.println("Consonant");
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
