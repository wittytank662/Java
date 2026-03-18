public class Decryption {
 
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    public static String generateDecipherAlphabet(int shiftKey) {
        String decipherAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            int shiftedIndex = (i - shiftKey + 26) % 26;
            decipherAlphabet += ALPHABET.charAt(shiftedIndex);
        }
        System.out.println("Alphabet:          " + ALPHABET);
        System.out.println("Decipher Alphabet: " + decipherAlphabet);
        return decipherAlphabet;
    }
 
    public static String decrypt(String ciphertext, int shiftKey) {
        String decipherAlphabet = generateDecipherAlphabet(shiftKey);
        String result = "";
        ciphertext = ciphertext.toUpperCase();
 
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = ALPHABET.indexOf(c);
                result += decipherAlphabet.charAt(index);
            } else {
                result += c;
            }
        }
        return result;
    }
}