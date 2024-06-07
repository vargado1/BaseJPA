package JPA;

import JPA.dao.DvoraniaDao;
import JPA.dao.HradAleboZamokDao;
import JPA.dao.MajordomDao;
import JPA.dao.RestauracnePraceDao;
import JPA.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ApplicationPU");
        EntityManager em = emf.createEntityManager();
        HradAleboZamokDao Hraddao = new HradAleboZamokDao();
        RestauracnePraceDao Pracedao = new RestauracnePraceDao();
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

//        // Vytvorenie nového hradu
//        try {
//            HradAleboZamok hrad = new HradAleboZamok();
//            hrad.setIdHrad(32011);
//            hrad.setNazov("Bratislavský hrad");
//            hrad.setHistorickePozadie("História bratislavského hradu...");
//            hrad.setJeHrad(true);
//            hrad.setRozloha(5000);
//            hrad.setVznik("9. storočie");
//            hrad.setStav("Zrekonštruovaný");
//
//            Hraddao.create(hrad);
//
//            System.out.println("bol pridaný nový hrad");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////
//        //TRANSAKCIA vytvorenie rekonštrukčnej práce výledkom čoho je nový stav hradu
//        try {
//            String menoHradu = "Karlštejn";
//            em = emf.createEntityManager();
//            em.getTransaction().begin();
//
//            // Vytvorenie nového záznamu o reštauračných prácach
//            RestauracnePrace restauracnePrace = new RestauracnePrace();
//            restauracnePrace.setIdPrace(12);
//            restauracnePrace.setCisloObjednavky(123456);
//            restauracnePrace.setDatumZaciatku(dateFormat.parse("2024-05-22"));
//            restauracnePrace.setDatumUkoncenia(dateFormat.parse("2024-05-23"));
//            restauracnePrace.setPopisPrace("Rekonstrukce interiéru a opravy strechy");
//            restauracnePrace.setHradZamok(menoHradu);
//
//            Pracedao.create(restauracnePrace);
//
//            // Aktualizácia stavu hradu alebo zámku
//            HradAleboZamok hradAleboZamok = Hraddao.findByName(menoHradu);
//            hradAleboZamok.setStav("vynikajúcí");
//
//            Hraddao.update(hradAleboZamok);
//
//            em.getTransaction().commit();
//            System.out.println("Transakcia bola úspešne vykonaná.");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
////
//        //Nájdenie všetkých rekonštrukčných prác
//        try {
//            List<RestauracnePrace> vsetkyPrace = Pracedao.findAll();
//            for (RestauracnePrace prace : vsetkyPrace) {
//                System.out.println("ID práce: " + prace.getIdPrace() +
//                        ", Číslo objednávky: " + prace.getCisloObjednavky() +
//                        ", Začiatok: " + dateFormat.format(prace.getDatumZaciatku()) +
//                        ", Ukončenie: " + dateFormat.format(prace.getDatumUkoncenia()) +
//                        ", Popis: " + prace.getPopisPrace() +
//                        ", Hrad/Zámok: " + prace.getHradZamok());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //Nájdenie rekonštrukčnej práce podľa dátumu
//        try {
//            Date datum = dateFormat.parse("2024-06-15");
//            List<RestauracnePrace> pracePodlaDatumu = Pracedao.findPraceByDatum(datum);
//            for (RestauracnePrace prace : pracePodlaDatumu) {
//                System.out.println("Rekonštrukcia nájdená podľa dátumu: ID práce: " + prace.getIdPrace() +
//                        ", Číslo objednávky: " + prace.getCisloObjednavky() +
//                        ", Začiatok: " + dateFormat.format(prace.getDatumZaciatku()) +
//                        ", Ukončenie: " + dateFormat.format(prace.getDatumUkoncenia()) +
//                        ", Popis: " + prace.getPopisPrace() +
//                        ", Hrad/Zámok: " + prace.getHradZamok());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Aktualizácia hradu alebo zámku
//        try {
//            HradAleboZamok hradAleboZamok = Hraddao.findByName("Karlštejn");
//            if (hradAleboZamok != null) {
//                hradAleboZamok.setStav("Obnovený");
//                Hraddao.update(hradAleboZamok);
//                System.out.println("Hrad bol úspešne aktualizovaný: " + hradAleboZamok.getNazov() + " Stav: " + hradAleboZamok.getStav());
//            } else {
//                System.out.println("Hrad s názvom Karlštejn nebol nájdený.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Použitie dotazu na nájdenie akcií pre konkrétny hrad
//        try {
//            int hradId = 32010; // ID hradu, ktorý chceš vyhľadať
//            List<AkcieNaHradeAleboZamku> akcie = Hraddao.findAkcieByHrad(hradId);
//            for (AkcieNaHradeAleboZamku akcia : akcie) {
//                System.out.println("ID akcie: " + akcia.getIdAkcia() +
//                        ", Názov akcie: " + akcia.getNazovAkcie() +
//                        ", Dátum: " + akcia.getDatumKonania());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
        try {
            Date specificDateOD = new Date(124, 4, 1);
            Date specificDateDO = new Date(124, 5, 1);
            Dvorania dvorana = new Dvorania();
            DvoraniaDao dvoraniaDao = new DvoraniaDao();
            dvorana.setIdDvorana(1);
            dvorana.setMeno("Meno");
            dvorana.setHradZamok("Bodiam");
            dvorana.setNadriadeny(1);

            dvoraniaDao.createDvorana(dvorana);

            Majordom majordom = new Majordom();
            majordom.setDvoraniaMeno("Meno");
            majordom.setDvoraniaHradZamok("Bodiam");
            majordom.setPriezvisko("Priezvisko");
            majordom.setTitul("Titul");
            majordom.setDobaSluzbyOd(specificDateOD);
            majordom.setDobaSluzbyDo(specificDateDO);


            MajordomDao majordomDao = new MajordomDao();
            majordomDao.create(majordom);
            majordomDao.close();

            System.out.println("Majordom bol úspešne vytvorený.");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            HradAleboZamok hrad = Hraddao.find(32011);
            Hraddao.delete(32011);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Uvoľnenie zdrojov
        Pracedao.close();
        Hraddao.close();
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

}
