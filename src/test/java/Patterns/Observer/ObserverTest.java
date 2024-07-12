package Patterns.Observer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author mateenkov
 */
@ExtendWith(ObserverExtension.class) /* Это и декоратор и слушатель одновременн.
 Декоратор потому что мы изменили внешне логику
 И слушатель потому что теперь мы используем логику перед и после теста , слушая его выполнение.
 Добавили логи кароче */
public class ObserverTest {

    @Test
    public void privetulki(){
        System.out.println("Провожу первый тест");
    }

}
