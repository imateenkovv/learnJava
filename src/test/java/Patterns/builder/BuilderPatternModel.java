package Patterns.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author mateenkov
 */
@Data
@Builder
public class BuilderPatternModel {

    private String user;
    private String password;
    private Integer age;
    private Boolean isMarried;
    private Double salary;

    /* Сторитель - позволяет создать модель класса и не указывать какие то нужные поля
     *  Чтобы не создавать несколько экземпляров класса , чтобы не писать через сететры
     *
     * Построение большого объекта где необязательно использовать все поля
     *  */


}

