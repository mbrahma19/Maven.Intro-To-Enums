package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    private String fieldToEvaluate;

    public AliceBobEvaluator(String input) {
        fieldToEvaluate = input.toUpperCase();
    }

    public boolean isAlice() {
        return fieldToEvaluate.equals(AliceBobEnum.ALICE.toString());
    }


    public boolean isBob() {
        return fieldToEvaluate.equals(AliceBobEnum.BOB.toString());
    }
}
