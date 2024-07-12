package Patterns.Decorator;

import Patterns.builder.BuilderPatternModel;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Parameter;
import java.util.Random;

/**
 * @author mateenkov
 */
@Retention(RetentionPolicy.RUNTIME) // Аннотации читаются в режиме настоящего времени
@Target(ElementType.PARAMETER) // На что навешивается аннотация (можно на МЕТОД , на ПАРАМЕТР, на ПОЛЕ )
public @interface RandomUser {

//    @Override
//    public boolean supportParameter(ParameterContext parameterContext, ExtensionContext extensionContext){
//        return parameterContext.isAnnotated(RandomUser.class);
//    }
//
//    @Override
//    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext){
//        return generateUser(parameterContext.getParameter())
//    }
//
//
//    private  Object generateUser(Parameter parameter) {
//        Class<?> type = parameter.getType();
//        Random random = new Random();
//        if (BuilderPatternModel.class.equals(type)) {
//            return BuilderPatternModel.builder()
//                    .user("Default User")
//                    .age(random.nextInt(60))
//                    .salary(random.nextDouble(300.000))
//                    .isMarried(random.nextBoolean())
//                    .password(String.valueOf(random.nextInt(1000)))
//                    .build();
//        }
//        throw new ParameterResolutionException("No random user is generate");
//    }

    /* Тут мы создаем аннотацию , то есть создаем декоратор  */
}
