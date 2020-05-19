
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "reiziger")
public class Reiziger {
    @Id
    @Column(name = "reiziger")
    private int reizigerNummer;

    @Column(name = "voorletters")
    private String voorletters;

    @Column(name = "tussenvoegsel")
    private String tussenvoegsel;

    @Column(name = "achternaam")
    private String achternaam;

    @Column(name = "gebortedatum")
    private Date gbdatum;

    //public List<OVChipkaart> getKaarten()

    public Reiziger(){

    }

    public Reiziger(int reizigerNummer, String voorletters, String tussenvoegsel, String achternaam, Date gbdatum){
        this.reizigerNummer = reizigerNummer;
        this.voorletters = voorletters;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.gbdatum = gbdatum;
    }

    public int getReizigerNummer() {
        return reizigerNummer;
    }

    public void setReizigerNummer(int reizigerNummer) {
        this.reizigerNummer = reizigerNummer;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGbdatum() {
        return gbdatum;
    }

    public void setGbdatum(Date gbdatum) {
        this.gbdatum = gbdatum;
    }
}
