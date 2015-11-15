import java.util.Scanner;

/**
 * This example explains when key = 3, Caesar substitution encryption
 * @author Yong Cao
 * @version 0.2.1
 * Created by ycao on 11/11/2015.
 */
public class caesarCipher {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is an example of Caesar cipher when key = 3");
        System.out.println("V0.2.1 16/11/2015");
        System.out.println("Please enter a word or sentence to encrypt/decrypt:");
        String str = scanner.nextLine();
        System.out.println("Please select from following options:");
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        int selection = scanner.nextInt();

        //algorithm
        String plainText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
        String cipherText = "xyzabcedefhijklmnopqrstuvwXYZABCDEFGHIJKLMNOPQRSTUVW8901234567 ";

        if (selection == 1){
            System.out.println(encrypt(str, plainText, cipherText));
        }
        else if (selection == 2){
            System.out.println(decrypt(str, cipherText, plainText));
        }
        else{
            System.out.println("Unknown selection");
        }
    }

    /**
     * Encrypt text by passing the plain text
     * @param strOriginal
     * @param plainText
     * @param cipherText
     * @return encrypted text
     */
    public static String encrypt(String strOriginal, String plainText, String cipherText){
        StringBuilder output = new StringBuilder();
        char[] letters = strOriginal.toCharArray();
        for (char letter : letters) {
            for (int j = 0; j < plainText.length(); j++) {
                if (letter == plainText.charAt(j)) {
                    output.append(cipherText.charAt(j));
                }
            }
        }
        return output.toString();
    }

    /**
     * Decrypt text by passing the cipher text
     * @param strCipher
     * @param cipherText
     * @param plainText
     * @return decrypted text
     */
    public static String decrypt(String strCipher, String cipherText, String plainText){
        StringBuilder output = new StringBuilder();
        char[] letters = strCipher.toCharArray();
        for (char letter : letters) {
            for (int j = 0; j < cipherText.length(); j++) {
                if (letter == cipherText.charAt(j)) {
                    output.append(plainText.charAt(j));
                }
            }
        }
        return output.toString();
    }
}
