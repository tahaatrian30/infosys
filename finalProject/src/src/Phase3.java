package src;

import java.util.ArrayList;
import java.util.List;

public class Phase3 {
    public static void main(String[] args) {

        Phase2.make();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        BankAccountFileReader bankAccountFileReader=new BankAccountFileReader();
        bankAccountFileReader.makeFile();

        PeopleFileReader peopleFileReader=new PeopleFileReader();
        List<String> smugglersID=peopleFileReader.FindSmuggler();

        System.out.println(smugglersID);

//        List<String> suspect= Phase2.getmaznoonin();
//        List<String> suspect_bank_account= new ArrayList<>();
//
//        for (int i = 0; i < suspect.size(); i++) {
//            suspect_bank_account.addAll(bankAccountFileReader.findBankAccounts(suspect.get(i)));
//        }
//        System.out.println(suspect_bank_account);
//
//        List<String> transaction_from_smuggler_to_suspects= new ArrayList<>();
//        TransactionFileReader transactionFileReader=new TransactionFileReader();
//        for (int i = 0; i < smugglersID.size() ; i++) {
//            for (int j = 0; j <suspect_bank_account.size(); j++) {
//                transaction_from_smuggler_to_suspects.addAll(transactionFileReader.findTransaction(smugglersID.get(i), suspect_bank_account.get(j)));
//            }
//        }
//
//        System.out.println(transaction_from_smuggler_to_suspects);
//
//        List<String> people_bank_account_with_smugglers_transactions=new ArrayList<>();
//        for (int i = 0; i < transaction_from_smuggler_to_suspects.size(); i++) {
//            people_bank_account_with_smugglers_transactions.addAll(bankAccountFileReader.findPeopleByBankAccount(transaction_from_smuggler_to_suspects.get(i)));
//        }
//        System.out.println(people_bank_account_with_smugglers_transactions);
    }
}
