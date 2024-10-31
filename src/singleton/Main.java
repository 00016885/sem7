package singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        if (manager == manager2){
            System.out.println("The same situation");
        }
    }
}