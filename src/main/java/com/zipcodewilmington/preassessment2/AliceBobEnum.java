package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    BOB,
    ALICE;

    public String getCatchPhrase(){
        return String.format("Hey, my name is %s!",name());
    }

    public boolean isAlice() {
        return this.equals(ALICE);
    }

    public boolean isBob() {
        return this.equals(BOB);
    }
}
