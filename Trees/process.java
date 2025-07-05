import java.io.IOException;

public class process{
    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        Process process;
        if(os.contains("win")){
            process = Runtime.getRuntime().exec(new String[] {"open","-a","textedit"});
        }
        if(os.contains("mac")){
            process = Runtime.getRuntime().exec(new String[] {"open","-a","textedit"});
        }
    }
}