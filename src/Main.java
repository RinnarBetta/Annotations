import java.lang.annotation.*;
import java.lang.reflect.*;

class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Finds the maximum value in an array.")
    @Author(firstName = "John", lastName = "Doe")
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Finds the minimum value in an array.")
    @Author(firstName = "Jane", lastName = "Smith")
    public int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


