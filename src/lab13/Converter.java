package lab13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter<T> {

    public static <T> ArrayList<T> convert(T[] array) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(Arrays.asList(array));
        return result;
    }


}
