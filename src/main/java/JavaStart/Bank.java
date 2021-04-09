package JavaStart;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "88030120153";


        Adress adress = new Adress();
        adress.cityName = "Warszawa";
        adress.homeNumber = 1;
        adress.localNumber = 12;
        adress.postCode = "11-200";
        adress.street = "Wyszyńskiego";


        BankAccount bankAccount = new BankAccount();
        bankAccount.owner = person;

        Credit credit = new Credit();
        credit.cashTaker = person;

       person.corespondAdress = adress;
       person.staticAdress = adress;





    }
}
