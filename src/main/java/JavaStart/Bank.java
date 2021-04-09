package JavaStart;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "88030120153";


        BankAccount bankAccount = new BankAccount();
        bankAccount.owner = person;

        Credit credit = new Credit();
        credit.cashTaker = person;


    }
}
