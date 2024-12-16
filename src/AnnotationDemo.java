import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] sampleArray = {5, 2, 9, 1, 7};
        System.out.println("Maximum value: " + arrayUtils.findMax(sampleArray));
        System.out.println("Minimum value: " + arrayUtils.findMin(sampleArray));

        // 3. Демонстрація роботи анотацій за допомогою рефлексії
        System.out.println("\n=== Method Annotations ===");
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Name: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
            }

            System.out.println("------------------------");
        }
    }
}
