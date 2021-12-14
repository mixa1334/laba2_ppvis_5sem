package model.income;

public class Income {
    private long incomeId;
    private long familyId;
    private long memberId;
    private IncomeDetails incomeDetails;

    public Income() {
    }

    public void placeIncome() {

    }

    public long getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(long incomeId) {
        this.incomeId = incomeId;
    }

    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public IncomeDetails getIncomeDetails() {
        return incomeDetails;
    }

    public void setIncomeDetails(IncomeDetails incomeDetails) {
        this.incomeDetails = incomeDetails;
    }
}
