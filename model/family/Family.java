package model.family;

import model.expense.Expense;
import model.income.Income;

import java.util.List;

public interface Family {
    long receiveFamilyId();
    String receiveFamilySurname();
    List<Expense> receiveParticipantExpense();
    List<Income> receiveParticipantIncome();
    List<Expense> receiveFamilyExpense();
    List<Income> receiveFamilyIncome();
    void offerToAddIncome();
    void offerToAddExpense();
}