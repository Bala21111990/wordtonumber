import com.ntm.internal.word.ConvertNumberToWords;

public class NumbertoWord {


    public static void main(String[] args) {
        ConvertNumberToWords convertNumberToWords=new ConvertNumberToWords();
        System.out.println("00000 ="+convertNumberToWords.numberToWords(0));
        System.out.println("511 = "+convertNumberToWords.numberToWords(511));
        System.out.println("22222222211L ="+convertNumberToWords.numberToWords(22222222211L));
        System.out.println("Long.MAX_VALUE = "+convertNumberToWords.numberToWords(Long.MAX_VALUE));
        System.out.println("-511 ="+convertNumberToWords.numberToWords(-511));
        System.out.println("0= "+convertNumberToWords.numberToWords(0));
    }
}
