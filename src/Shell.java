import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {
    public static void main(String[] args) {

        Process process = null;
        try {
            process = Runtime.getRuntime().exec("/Users/kexiong/Tmp/Test/JavaShellExecute/processExcel.sh 1 2 3 4 5");
            process.waitFor();

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            String line = null;
            while((line = in.readLine())!=null){
                System.out.println(line);
            }
              in = new BufferedReader(new InputStreamReader(
                    process.getErrorStream()));
            while((line = in.readLine())!=null){
                System.out.println(line);
            }
           // process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (process != null) {
                process.destroy();
            }
        }

    }
}
