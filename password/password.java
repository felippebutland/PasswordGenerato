import java.util.Random;

public class password
{
    public static void main(String[] args)
    {
        int length = 8; // pode ser aumentado ou diminuido
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Sua senha:");
        String charCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$&*()+-/*<>?";

        String passSymbols = charCaps + chars + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++)
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }
}