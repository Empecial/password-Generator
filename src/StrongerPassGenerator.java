public class StrongerPassGenerator extends PasswordGeneration{
    
    public StrongerPassGenerator(int _strongPasswordLength)
    {
        //How do you call the constructor of the parent class (PasswordGeneration) that this class inherits from?
        //What does super mean when inherting from another class?
        super(_strongPasswordLength);

        //What should happen if password is lower than 8 or higher than 20 chars?
        if(_strongPasswordLength < 8 || _strongPasswordLength > 20)
        {
            throw new IllegalArgumentException("Password length must be between 8 and 20 chars");
        }
    }

    @Override
    public void generate() {
    String possibleChars = ("abcdefghijklmnopqrstuvwxyz0123456789!+-/\\%&()=?$@§");
        int randomBound = possibleChars.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < super.GetPasswordLength();i++)
        {
            //How do you generate upper and lowercase letters randomly?
            int randNumber = GetRng().nextInt(2);
            char pickedChar = possibleChars.charAt(super.GetRng().nextInt(randomBound));
            String appendedString = "" + pickedChar;
            appendedString = randNumber == 0 ? appendedString.toUpperCase() : appendedString;

            sb.append(appendedString);
        }

        //How do you get the final password saved?
        SetPassWord(sb.toString());
    }
}