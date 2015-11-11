import java.util.Scanner;

/**
 * Created by ycao on 11/11/2015.
 */
public class substitutionEncryption {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word/sentence to encrypt/decrypt:");
        String str = scanner.nextLine();
        System.out.println("Select 1. to Encrypt, select 2 to Decrypt:");
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

    public static String encrypt(String strOriginal, String from, String to){
        StringBuilder output = new StringBuilder();
        char[] letters = strOriginal.toCharArray();
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < from.length(); j++){
                if (letters[i] == from.charAt(j)){
                    output.append(to.charAt(j));
                }
            }
        }
        return output.toString();
    }

    public static String decrypt(String strCipher, String from, String to){
        StringBuilder output = new StringBuilder();
        char[] letters = strCipher.toCharArray();
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < from.length(); j++){
                if (letters[i] == from.charAt(j)){
                    output.append(to.charAt(j));
                }
            }
        }
        return output.toString();
    }
}
