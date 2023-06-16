//16. Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY
//---------------------------------------------

public class EncryptWord {

    public static void main(String[] args) {

        String plaintext = "ROADTOSDET";
        int shift = 5;
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + ciphertext);
    }
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            // Shift the letter forward by the specified number of positions
            char shiftedChar = (char) (currentChar + shift);

            // Handle wrapping around the alphabet
            if (shiftedChar > 'Z') {
                shiftedChar = (char) (shiftedChar - 26);
            }

            ciphertext.append(shiftedChar);
        }

        return ciphertext.toString();
    }
}
