package model.expense;

public class Expense {
    private long expenseId;
    private long familyId;
    private long userId;
    private ExpenseDetails expenseDetails;

    public Expense() {
    }

    public void placeExpense() {
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public ExpenseDetails getExpenseDetails() {
        return expenseDetails;
    }

    public void setExpenseDetails(ExpenseDetails expenseDetails) {
        this.expenseDetails = expenseDetails;
    }
}
