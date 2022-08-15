public class GenerationExecuter {
    public static void main(String[] args) {
        PasswordGeneration myPass = new PasswordGeneration(20);
        myPass.generate();
        System.out.println(myPass.getPassword());
    }
}