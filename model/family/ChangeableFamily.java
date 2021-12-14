package model.family;

import model.expense.Expense;
import model.income.Income;
import model.member.FamilyMember;
import model.wallet.Wallet;

import java.util.List;

public interface ChangeableFamily extends Family{
    Wallet receiveWallet();
    List<FamilyMember> receiveFamilyMembers();
    Expense receiveProposedExpense();
    Income receiveProposedIncome();
    boolean changeFamilySurname();
}
