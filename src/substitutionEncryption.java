import java.util.Scanner;

/**
 * @author Yong Cao
 * @version 0.2
 * Created by ycao on 11/11/2015.
 */
public class substitutionEncryption {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Substitution Encryption/Decription");
        System.out.println("V0.2 11/11/2015");
        System.out.println("Please enter a word or sentence to encrypt/decrypt:");
        String str = scanner.nextLine();
        System.out.println("Please select from following options:");
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        int selection = 0;
        selection = scanner.nextInt();


        //algorithm
        String plainText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
        String cipherText = "XYZABCDEFGHIJKLMNOPQRSTUVWxyzabcedefhijklmnopqrstuvw8901234567 ";

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

    public static String encrypt(String strOriginal, String plainText, String cipherText){
        StringBuilder output = new StringBuilder();
        char[] letters = strOriginal.toCharArray();
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < plainText.length(); j++){
                if (letters[i] == plainText.charAt(j)){
                    output.append(cipherText.charAt(j));
                }
            }
        }
        return output.toString();
    }

    public static String decrypt(String strCipher, String cipherText, String plainText){
        StringBuilder output = new StringBuilder();
        char[] letters = strCipher.toCharArray();
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < cipherText.length(); j++){
                if (letters[i] == cipherText.charAt(j)){
                    output.append(plainText.charAt(j));
                }
            }
        }
        return output.toString();
    }
}
