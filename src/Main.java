import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("NewTex.txt"));
        String vowels = "а е ё и й о у ы э ю я";
        String consonant = "б в г д ж з к л м н п р с т ф х ц ч ш щ ъ ь";

        int countVowels = 0;

        int countConsonant = 0;

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            char[] chArray = line.toCharArray();


            for (int i = 0; i < chArray.length; i++) {
                if (vowels.contains(String.valueOf(chArray[i]))) {
                    bufferedWriter.write("a");
                    countVowels++;
                } else if (consonant.contains(String.valueOf(chArray[i]))) {
                    bufferedWriter.write("m");
                    countConsonant++;
                }
                bufferedWriter.write(chArray[i]);
            }
            System.out.println(countVowels + " " + countConsonant);

        }
        bufferedWriter.close();
        bufferedReader.close();
    }

}
