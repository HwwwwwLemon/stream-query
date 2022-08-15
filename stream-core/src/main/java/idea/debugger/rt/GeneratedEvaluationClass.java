package idea.debugger.rt;

/**
 * GeneratedEvaluationClass
 * TODO fixing
 *
 * @author idea
 * @since 2022/8/15
 */
public class GeneratedEvaluationClass {


    private final Object instance;

    public GeneratedEvaluationClass(Object instance) {
        this.instance = instance;
    }

    public static int accessToFieldField1(Object object, Object value) {
        try {
            Class<?> klass = Class.forName("WithReflectionAccess");
            java.lang.reflect.Field member = null;
            int interfaceNumber = -1;
            Class<?>[] interfaces = null;
            while (member == null) {
                try {
                    member = klass.getDeclaredField("field");
                } catch (ReflectiveOperationException e) {
                    if (interfaceNumber == -1) {
                        interfaces = klass.getInterfaces();
                        interfaceNumber = 0;
                    }
                    if (interfaceNumber < interfaces.length) {
                        klass = interfaces[interfaceNumber];
                        interfaceNumber += 1;
                    } else {
                        klass = klass.getSuperclass();
                        if (klass == null) throw e;
                        interfaceNumber = -1;
                    }
                }
            }
            member.setAccessible(true);
            return (int) member.get(object);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public void invoke() {
        System.out.println(accessToFieldField1(instance, null));
    }

}
