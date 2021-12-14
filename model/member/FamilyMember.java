package model.member;

import model.expense.Expense;
import model.family.Family;
import model.income.Income;

public class FamilyMember {
    protected long memberId;
    protected String password;
    protected String phoneNumber;
    protected String name;
    private Family family;
    private Income income;
    private Expense expense;

    public FamilyMember() {
    }

    public boolean confirmAuthorization() {
        return true;
    }

    public void offerToAddExpense() {

    }

    public void offerToAddIncome() {

    }

    public void changeName() {

    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
