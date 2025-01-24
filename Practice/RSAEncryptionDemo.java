package Practice;

import java.security.*;
import java.util.Base64;

public class RSAEncryptionDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("RSA");
        SecureRandom random=new SecureRandom();
        keyPairGenerator.initialize(2048,random);

        KeyPair pair=keyPairGenerator.generateKeyPair();
        PublicKey publicKey= pair.getPublic();
        String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());

        System.out.println("The public key is :"+ publicKeyString);

        PrivateKey privateKey= pair.getPrivate();
        String privateKeyString=Base64.getEncoder().encodeToString(privateKey.getEncoded());
        System.out.println("The private Key is :"+privateKeyString);
    }
}
