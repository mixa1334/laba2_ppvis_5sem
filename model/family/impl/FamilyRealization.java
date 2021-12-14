package model.family.impl;

import model.expense.Expense;
import model.family.ChangeableFamily;
import model.income.Income;
import model.member.FamilyMember;
import model.wallet.Wallet;

import java.util.List;

public class FamilyRealization implements ChangeableFamily {
    private long familyId;
    private List<FamilyMember> members;
    private String familySurname;
    private Wallet wallet;
    private Income income;
    private Expense expense;

    public FamilyRealization() {
    }

    @Override
    public Wallet receiveWallet() {
        return null;
    }

    @Override
    public List<FamilyMember> receiveFamilyMembers() {
        return null;
    }

    @Override
    public Expense receiveProposedExpense() {
        return null;
    }

    @Override
    public Income receiveProposedIncome() {
        return null;
    }

    @Override
    public boolean changeFamilySurname() {
        return false;
    }

    @Override
    public long receiveFamilyId() {
        return 0;
    }

    @Override
    public String receiveFamilySurname() {
        return null;
    }

    @Override
    public List<Expense> receiveParticipantExpense() {
        return null;
    }

    @Override
    public List<Income> receiveParticipantIncome() {
        return null;
    }

    @Override
    public List<Expense> receiveFamilyExpense() {
        return null;
    }

    @Override
    public List<Income> receiveFamilyIncome() {
        return null;
    }

    @Override
    public void offerToAddIncome() {

    }

    @Override
    public void offerToAddExpense() {

    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
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

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public List<FamilyMember> getMembers() {
        return members;
    }

    public void setMembers(List<FamilyMember> members) {
        this.members = members;
    }

    public String getFamilySurname() {
        return familySurname;
    }

    public void setFamilySurname(String familySurname) {
        this.familySurname = familySurname;
    }
}
