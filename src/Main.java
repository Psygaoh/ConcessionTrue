public class Main {

// celui ci marche bien, on n'y touche plus;

    public static void main(String[]args) {
// create utilisateur

        User user1 = new User("Hachi", "Hunter","Dwayne","Homme", 25, 3156789);
// create vendeur
        Seller seller1 = new Seller("Johnson","Callaway","Mark","Homme", 46);

// create catalogue produit
        Assurance[] arrayAssurance = new Assurance[5] ;

        // create Produit
        Assurance toutRisque = new Assurance("Assurance Tout Risque", "Couvre tout les cas possibles", 27);
        arrayAssurance[0] = toutRisque;

        seller1.addVehicule("F1", "ça roule sur la terre", 50000, "Ferrari", 1, "voiture");
        seller1.addVehicule("CALIDUS 914", "ça vole dans les airs", 60000, " AUTOGYRO",  6, "avion");
        seller1.addVehicule("Fiesta","la nouvelle ford",6990,"Ford",4,"voiture");
        seller1.addVehicule("Stormseeker","STORM INCOMING",3333333,"METAL",4,"voiture");
        seller1.addAssurance("Crash","tu te mange un arbre? t'es couvert", 15);
        seller1.addAssurance("Vol","t'es pas un oiseau, et on te chourre ta caisse", 20);
        seller1.addAssurance("Décès","t'es mort? alors pour ta famille prend ça", 40);

        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");

      user1.parcourirCatalogVehicule(seller1);

       user1.parcourirCatalogue(seller1);
        user1.parcourirCatalogue(seller1);
       user1.parcourirCatalogue(seller1);


        //  System.out.println("___________________________________________");
      //  seller1.editFacture(toutRisque,seller1,user1);
        System.out.println("___________________________________________");

    //    user1.acheter(vehicule1,seller1);

    }




}