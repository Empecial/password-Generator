import java.util.Random;

public class PasswordGeneration {
    private String password;
    private int passwordLength; //How long will password be?
    private Random rng; 

    public PasswordGeneration(int _passwordLength)
    {
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

    //How do you make a getter method for the generated password length?
    public int GetPasswordLength()
    {
        return this.passwordLength;
    }

    //How do you make a getter method for the generated Random rng?
    public Random GetRng()
    {
        return this.rng;
    }

    //How do you set the password value through method?
    public void SetPassWord(String __password)
    {
        this.password = __password;
    }
 }