public class GenerationExecuter {
    public static void main(String[] args) {
        PasswordGeneration myPass = new PasswordGeneration(8);
        myPass.generate();
        System.out.println(myPass.getPassword());

        //How do you do Strong password generation?
        PasswordGeneration myStrongPass = new StrongerPassGenerator(10);
        myStrongPass.generate();
        System.out.println(myStrongPass.getPassword());

    }
}