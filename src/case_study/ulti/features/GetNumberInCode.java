package case_study.ulti.features;

import case_study.ulti.read_write.ReadFile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class GetNumberInCode {
    public static int getNumberInCode(String src) {
        List<String> strings = new ArrayList<>(ReadFile.readFile(src));
        String line = strings.get(strings.size() - 1);
        String[] properties;
        properties = line.split(",");
        String code = properties[0];
        String[] number = code.split("-");
        return Integer.parseInt(number[1]);
    }
}
