import java.nio.charset.StandardCharsets;
import java.util.Base64;

class EncodeDecodeBase64 
{
    public static void main(String [] args) 
    {
        new EncodeDecodeBase64().test();
    }

    public Boolean test()
    {
        String toTest = "aa";
        if (encode(toTest).length() > toTest.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private byte[] decode(String encoded) 
    {
        byte [] decBArray = Base64.getDecoder().decode(encoded);
        System.out.println("Decoded: " + new String(decBArray));
        return decBArray;
    }

    private String encode(String encodedStr)
    {
        String encoded = Base64.getEncoder().encodeToString(encodedStr.getBytes(StandardCharsets.UTF_8));
        System.out.println("Decoded value is " + new String(encoded));
        return encoded;
    }
}