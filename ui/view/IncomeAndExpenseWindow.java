package ui.view;

import model.expense.Expense;
import model.income.Income;

public class IncomeAndExpenseWindow {
    private Income income;
    private Expense expense;

    public IncomeAndExpenseWindow() {
    }

    public void show() {

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
}
