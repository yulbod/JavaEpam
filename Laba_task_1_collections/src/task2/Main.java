package task2;

public class Main {
    public static void main(String[] args) {

        Translator translator = new Translator();
        translator.addWord("shit", "шит");
        translator.addWord("this", "это");
        System.out.println(translator.translate("this shit"));

    }
}
