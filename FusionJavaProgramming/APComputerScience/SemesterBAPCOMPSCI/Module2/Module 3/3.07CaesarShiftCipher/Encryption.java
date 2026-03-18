public class Encryption {
 
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    public static String generateCipherAlphabet(int shiftKey) {
        String cipherAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            int shiftedIndex = (i + shiftKey) % 26;
            cipherAlphabet += ALPHABET.charAt(shiftedIndex);
        }
        System.out.println("Alphabet:        " + ALPHABET);
        System.out.println("Cipher Alphabet: " + cipherAlphabet);
        return cipherAlphabet;
    }
 
    public static String encrypt(String plaintext, int shiftKey) {
        String cipherAlphabet = generateCipherAlphabet(shiftKey);
        String result = "";
        plaintext = plaintext.toUpperCase();
 
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = ALPHABET.indexOf(c);
                result += cipherAlphabet.charAt(index);
            } else {
                result += c;
            }
        }
        return result;
    }
}