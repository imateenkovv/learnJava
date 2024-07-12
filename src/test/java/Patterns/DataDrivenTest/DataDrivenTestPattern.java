package Patterns.DataDrivenTest;

import Patterns.Observer.ObserverExtension;
import Patterns.builder.BuilderPatternModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author mateenkov
 */
@ExtendWith(ObserverExtension.class)
public class DataDrivenTestPattern {

    /*  выполняется тест , на основе заданных параметров
     *
     * При помощи библиотеки junit-jupiter-params
     *
     * Другими словами , мы можем запускать один и тот же тест с разными параметрами
     *
     * */

    // Тест выполниться столько раз, сколько пар параметров задано
    @ParameterizedTest // Говорим что этот тест параметризированный
    @CsvSource({"admin,password1", "admin345,password123", "user4,password5"}) // Задаем пары параметров для входа
    public void paramTest(String login, String password) {
        System.out.println(login);
        System.out.println(password);
        Assertions.assertTrue(password.startsWith("pass"));
    }

    // Тут мы можем работать так с объектами а не только с конкретными тестовыми данными
    @ParameterizedTest
    @MethodSource(value = "testUsers") // Это статичный (внизу) метод который билдит нам юзеров
    public void objectParamTest(BuilderPatternModel builderPatternModel) {
        System.out.println(builderPatternModel);
        Assertions.assertTrue(builderPatternModel.getPassword().startsWith("pass"));
    }

    // Статичный метод который возвращает сбилженые обекты BuilderPatternModel
    private static Stream<BuilderPatternModel> testUsers() {
        BuilderPatternModel admin = BuilderPatternModel.builder().user("admin").password("password123").build();
        BuilderPatternModel user = BuilderPatternModel.builder().user("user").password("password13").build();
        BuilderPatternModel demo = BuilderPatternModel.builder().user("demo").password("password3").build();
        return Stream.of(admin, user, demo);
    }

}
