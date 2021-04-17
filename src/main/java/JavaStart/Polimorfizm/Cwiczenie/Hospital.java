package JavaStart.Polimorfizm.Cwiczenie;

public class Hospital {
        Person person ;
        Hospital hospital;
        public  Person [] add(){
            Person [] people = new Person[6];

            people[0] = new Doctor("Seweryn", "Matyszczak", 7000 , 890);
            people[1] = new Nurse("Anna", "Klawertowicz", 3000 , 13);
            people[2] = new Nurse("Barbara", "Serwerczyk",3200, 6 );

            for (Person peoples: people){
                hospital.getInfo();
            }
            return people;
        }

        public  void getInfo(){
            System.out.println("Imię" + person.getFirstName() +  " Nazwisko " + person.getSureName() + " " + person.getPricePerson() + " "  );
        }
}
