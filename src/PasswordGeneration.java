import java.util.Random;

public class PasswordGeneration {
    private String password;
    private int passwordLength; //How long will password be?
    private Random rng; 

    public PasswordGeneration(int _passwordLength)
    {
        //What should happen if password is lower than 8 or higher than 20 chars?
        if(_passwordLength < 8 || _passwordLength > 20)
        {
            throw new IllegalArgumentException("Password length must be between 8 and 20 chars");
        }
        this.passwordLength = _passwordLength;
        this.rng = new Random();
    }

    public void generate()
    {
        String possibleChars = ("abcdefghijklmnopqrstuvwxyz");
        int randomBound = possibleChars.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.passwordLength;i++)
        {
            sb.append(possibleChars.charAt(this.rng.nextInt(randomBound)));
        }

        //How do you get the final password saved?
        this.password = sb.toString();
    }

    public String getPassword()
    {
        return this.password;
    }
 }
