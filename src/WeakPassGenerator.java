public class WeakPassGenerator extends PasswordGeneration {
    public WeakPassGenerator(int passwordLength)
    {
        super(passwordLength);
    }

    @Override
    public void generate() {
        String[] possiblePasswords = new String[]{"password","123","pass","123456","qwerty","kebab","perik","wasd","access","code","boom","java","wow","DontReadThisMrHacker"};

        //How do you get a random word from possiblePasswords?
        int randomIndex = super.GetRng().nextInt(possiblePasswords.length);
        super.SetPassWord(possiblePasswords[randomIndex]);

    }
}