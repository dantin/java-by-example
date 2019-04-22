
public class Main {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("root", "root");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf aaa.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message:" + e.getMessage());
        }
    }
}
