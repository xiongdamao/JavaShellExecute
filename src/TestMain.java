import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {


        System.out.println("args = " + Arrays.deepToString(args));


        System.out.println("out:"+StringUtils.isBlank(null));
        System.err.println("err");
    }
}
