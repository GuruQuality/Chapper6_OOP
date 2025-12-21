package org.example;

public class PartyCheckRule implements Rule {

    @Override
    public boolean validate(int grade) {
        if (grade % 2 == 0) {
            return true;
        }
        return false;
    }
}
