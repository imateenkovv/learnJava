package Patterns.Decorator;

import Patterns.Observer.ObserverExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author mateenkov
 */
@ExtendWith(ObserverExtension.class)
public class Decorator {

    /* Декоратор изменяет логику любого метода , когда метод не знает об этой логике
    * Внутреннее изменение невозможно , но внешнее изменение логики есть
    * Изменение внешней логики метода
    *  */

    @Test
    void test(){

    }

    void test1(){

    }

    @BeforeEach
    void test2(){

    }

}
