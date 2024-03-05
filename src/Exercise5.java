public class Exercise5 {

    public static void main(String[] args) {

        String word = "Teste de frase para reverter";

        char[] wordArray = word.toCharArray();
        char[] newWord = new char[word.length()];

        int j = 0;
        for(int i = wordArray.length - 1; i >= 0; i--, j++){
            newWord[j] = wordArray[i];

        }
        String str = new String(newWord);

        System.out.println(str);

    }

}
