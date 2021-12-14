package model.member;

import model.family.ChangeableFamily;

public class FamilyHead extends FamilyMember {
    private ChangeableFamily familyChangeable;

    public FamilyHead() {
    }

    public void addMemberToFamily() {

    }

    public void deleteMemberFromFamily() {

    }

    public void addExpense() {

    }

    public void addIncome() {

    }

    public void updateExpense() {

    }

    public void updateIncome() {

    }

    public ChangeableFamily getFamilyChangeable() {
        return familyChangeable;
    }

    public void setFamilyChangeable(ChangeableFamily familyChangeable) {
        this.familyChangeable = familyChangeable;
    }
}
