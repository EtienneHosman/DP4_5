import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "OVCHIPKAART")
public class OVChipkaart {
    @Id
    @Column(name = "KAARTNUMMER")
    private int kaartnummer;

    @Column(name = "GELDIGTOT")
    private Date geldigTot;

    @Column(name = "KLASSE")
    private int klasse;

    @Column(name = "SALDO")
    private double saldo;

    @ManyToOne(targetEntity = Reiziger.class)
    @JoinColumn(name = "REIZIGERID")
    private Reiziger reiziger;

    public OVChipkaart(){}

    public OVChipkaart(int kaartnummer, Date geldigTot, int klasse, double saldo, Reiziger reiziger){
        this.kaartnummer = kaartnummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
    }

    public int getKaartnummer() {
        return kaartnummer;
    }

    public void setKaartnummer(int kaartnummer) {
        this.kaartnummer = kaartnummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }
}
