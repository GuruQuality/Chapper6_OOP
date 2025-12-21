package org.example.rules;

import org.example.rules.Rule;

public class BetweenRule implements Rule {//т.к. класс выполняет требование - implements Rule
//    то все объекты реализут метод boolean validate и будут проверяться на значения Boolean
    @Override
    public boolean validate(int grade) {
        if (grade >= 2 && grade <= 5) {
            return true;
        }
        return false;
    }
}
