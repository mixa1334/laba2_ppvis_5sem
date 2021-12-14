package model.income;

import java.math.BigDecimal;
import java.util.Date;

public class IncomeDetails {
    private Date dateOfAdding;
    private BigDecimal amountOfIncome;
    private String incomeType;

    public IncomeDetails() {
    }

    public Date getDateOfAdding() {
        return dateOfAdding;
    }

    public void setDateOfAdding(Date dateOfAdding) {
        this.dateOfAdding = dateOfAdding;
    }

    public BigDecimal getAmountOfIncome() {
        return amountOfIncome;
    }

    public void setAmountOfIncome(BigDecimal amountOfIncome) {
        this.amountOfIncome = amountOfIncome;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }
}
