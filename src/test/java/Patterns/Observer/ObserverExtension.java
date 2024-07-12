package Patterns.Observer;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @author mateenkov
 */

public class ObserverExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void beforeTestExecution(ExtensionContext context){
        System.out.println("Запустился тест: " + context.getDisplayName());
    }

    @Override
    public void afterTestExecution(ExtensionContext context){
        System.out.println("Завершился тест: " + context.getDisplayName());
    }

}
