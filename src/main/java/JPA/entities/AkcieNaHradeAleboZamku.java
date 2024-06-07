package JPA.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@jakarta.persistence.Table(name = "akcie_na_hrade_alebo_zamku", schema = "public", catalog = "vargado1")
public class AkcieNaHradeAleboZamku {
    @Id
    @jakarta.persistence.Column(name = "id_akcia")
    private int idAkcia;

    public int getIdAkcia() {
        return idAkcia;
    }

    public void setIdAkcia(int idAkcia) {
        this.idAkcia = idAkcia;
    }

    @Basic
    @Column(name = "nazov_akcie")
    private String nazovAkcie;

    public String getNazovAkcie() {
        return nazovAkcie;
    }

    public void setNazovAkcie(String nazovAkcie) {
        this.nazovAkcie = nazovAkcie;
    }

    @Basic
    @Column(name = "datum_konania")
    private Date datumKonania;

    public Date getDatumKonania() {
        return datumKonania;
    }

    public void setDatumKonania(Date datumKonania) {
        this.datumKonania = datumKonania;
    }

    @Basic
    @Column(name = "popis_akcie")
    private String popisAkcie;

    public String getPopisAkcie() {
        return popisAkcie;
    }

    public void setPopisAkcie(String popisAkcie) {
        this.popisAkcie = popisAkcie;
    }

    @Basic
    @Column(name = "typ_akcie")
    private String typAkcie;

    public String getTypAkcie() {
        return typAkcie;
    }

    public void setTypAkcie(String typAkcie) {
        this.typAkcie = typAkcie;
    }

    @Basic
    @Column(name = "navstvenost")
    private short navstvenost;

    public short getNavstvenost() {
        return navstvenost;
    }

    public void setNavstvenost(short navstvenost) {
        this.navstvenost = navstvenost;
    }

    @ManyToMany(mappedBy = "akcie")
    private List<HradAleboZamok> hrady;

    public List<HradAleboZamok> getHrady() {
        return hrady;
    }

    public void setHrady(List<HradAleboZamok> hrady) {
        this.hrady = hrady;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AkcieNaHradeAleboZamku that = (AkcieNaHradeAleboZamku) o;

        if (idAkcia != that.idAkcia) return false;
        if (navstvenost != that.navstvenost) return false;
        if (nazovAkcie != null ? !nazovAkcie.equals(that.nazovAkcie) : that.nazovAkcie != null) return false;
        if (datumKonania != null ? !datumKonania.equals(that.datumKonania) : that.datumKonania != null) return false;
        if (popisAkcie != null ? !popisAkcie.equals(that.popisAkcie) : that.popisAkcie != null) return false;
        if (typAkcie != null ? !typAkcie.equals(that.typAkcie) : that.typAkcie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAkcia;
        result = 31 * result + (nazovAkcie != null ? nazovAkcie.hashCode() : 0);
        result = 31 * result + (datumKonania != null ? datumKonania.hashCode() : 0);
        result = 31 * result + (popisAkcie != null ? popisAkcie.hashCode() : 0);
        result = 31 * result + (typAkcie != null ? typAkcie.hashCode() : 0);
        result = 31 * result + (int) navstvenost;
        return result;
    }
}
