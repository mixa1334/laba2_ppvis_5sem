package model.expense;

import java.math.BigDecimal;
import java.util.Date;

public class ExpenseDetails {
    private Date dateOfAdding;
    private BigDecimal amountOfExpense;
    private String expenseType;

    public ExpenseDetails() {
    }

    public Date getDateOfAdding() {
        return dateOfAdding;
    }

    public void setDateOfAdding(Date dateOfAdding) {
        this.dateOfAdding = dateOfAdding;
    }

    public BigDecimal getAmountOfExpense() {
        return amountOfExpense;
    }

    public void setAmountOfExpense(BigDecimal amountOfExpense) {
        this.amountOfExpense = amountOfExpense;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }
}
