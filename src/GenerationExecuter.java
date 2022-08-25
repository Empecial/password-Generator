public class GenerationExecuter {
    public static void main(String[] args) {
        PasswordGeneration myPass = new PasswordGeneration(8);
        myPass.generate();
        System.out.println(myPass.getPassword());

        //How do you do Strong password generation?
        StrongerPassGenerator myStrongPass = new StrongerPassGenerator(20);
        myStrongPass.generate();
        System.out.println(myStrongPass.getPassword());

        WeakPassGenerator myWeakPass = new WeakPassGenerator(3);
        myWeakPass.generate();
        System.out.println(myWeakPass.getPassword());
    }
}