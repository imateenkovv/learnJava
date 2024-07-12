package Patterns.builder;

import org.junit.jupiter.api.Test;


/**
 * @author mateenkov
 */

public class BuilderPatternsTest {

    @Test
    public void builderTest() {
        BuilderPatternModel user1 = BuilderPatternModel.builder()
                .age(23)
                .salary(30.000)
                .isMarried(false)
                .password("passWord")
                .user("Anton")
                .build();

        BuilderPatternModel user2 = BuilderPatternModel.builder()
                .password("Pass")
                .user("Sanya")
                .build();

        System.out.println(user2);
        System.out.println(user1);
    }

}
