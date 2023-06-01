package utils;


import entities.Guide;
import entities.Role;
import entities.Trip;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SetupTestUsers {

  public static void main(String[] args) {

    EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
    EntityManager em = emf.createEntityManager();

//    // IMPORTAAAAAAAAAANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    // This breaks one of the MOST fundamental security rules in that it ships with default users and passwords
//    // CHANGE the three passwords below, before you uncomment and execute the code below
//    // Also, either delete this file, when users are created or rename and add to .gitignore
//    // Whatever you do DO NOT COMMIT and PUSH with the real passwords

//        STEP 1: CREATES USERS *REMEMBER DROP & CREATE IF YOU'VE MADE CHANGES TO THE USER CLASS IN ENTITIES*
//    User user = new User("user", "test123");
//    User admin = new User("admin", "test123");
//    User both = new User("user_admin", "test123");
//
//    if(admin.getUserPass().equals("test")||user.getUserPass().equals("test")||both.getUserPass().equals("test"))
//      throw new UnsupportedOperationException("You have not changed the passwords");
//

    Trip t1 = new Trip("Mordor", "20/04", "12:00", "Shire", "1 year", "lembas bread, Chicken, Precious");
    Trip t2 = new Trip("Macragge", "17/07", "12:00", "Terra", "10.000 years", "Chainsword, Ausspex , No Fear");
    Guide g1 = new Guide("Gandalf", "Male", 1000, "arrives precisely when he means to", "https://www.cnet.com/a/img/resize/0165e20206047e2ebe322821b4fea5fdff7f3061/hub/2014/12/01/89601d70-ca65-4dc7-adfe-f6dbd46d05ba/hobbit-lotr-5-armies-gandalf-hat.jpg?auto=webp&fit=crop&height=675&width=1200");
    em.getTransaction().begin();
//    Role userRole = new Role("user");
//    Role adminRole = new Role("admin");
//    user.addRole(userRole);
//    admin.addRole(adminRole);
//    both.addRole(userRole);
//    both.addRole(adminRole);
//    em.persist(userRole);
//    em.persist(adminRole);
//    em.persist(user);
//    em.persist(admin);
//    em.persist(both);

    t1.addGuide(g1);
    t2.addGuide(g1);
    em.persist(g1);
    em.persist(t1);
    em.persist(t2);
    em.getTransaction().commit();
//    System.out.println("PW: " + user.getUserPass());
//    System.out.println("Testing user with OK password: " + user.verifyPassword("test"));
//    System.out.println("Testing user with wrong password: " + user.verifyPassword("test1"));
//    System.out.println("Created TEST Users");
//    System.out.println("Testing user with OK password: " + user.verifyPassword("test123"));

  }
}
