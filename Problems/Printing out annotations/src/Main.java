import java.lang.annotation.Annotation;

class AnnotationUtils {

    public static void printAnnotations(Class classObject) {
        Annotation[] annots = classObject.getDeclaredAnnotations();
        for (Annotation anno : annots) {
            System.out.println(anno.annotationType().getSimpleName());
        }
    }
}