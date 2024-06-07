package JPA.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "restauracne_prace", schema = "public", catalog = "vargado1")
public class RestauracnePrace {
    @Id
    @Column(name = "id_prace")
    private int idPrace;

    @Column(name = "cislo_objednavky", unique = true)
    private int cisloObjednavky;

    @Column(name = "datum_zaciatku", unique = true)
    private Date datumZaciatku;

    @Column(name = "datum_ukoncenia", unique = true)
    private Date datumUkoncenia;

    @Column(name = "popis_prace")
    private String popisPrace;

    @Column(name = "hrad_zamok")
    private String hradZamok;

    public int getIdPrace() {
        return idPrace;
    }

    public void setIdPrace(int idPrace) {
        this.idPrace = idPrace;
    }

    public int getCisloObjednavky() {
        return cisloObjednavky;
    }

    public void setCisloObjednavky(int cisloObjednavky) {
        this.cisloObjednavky = cisloObjednavky;
    }

    public Date getDatumZaciatku() {
        return datumZaciatku;
    }

    public void setDatumZaciatku(Date datumZaciatku) {
        this.datumZaciatku = datumZaciatku;
    }

    public Date getDatumUkoncenia() {
        return datumUkoncenia;
    }

    public void setDatumUkoncenia(Date datumUkoncenia) {
        this.datumUkoncenia = datumUkoncenia;
    }

    public String getPopisPrace() {
        return popisPrace;
    }

    public void setPopisPrace(String popisPrace) {
        this.popisPrace = popisPrace;
    }

    public String getHradZamok() {
        return hradZamok;
    }

    public void setHradZamok(String hradZamok) {
        this.hradZamok = hradZamok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestauracnePrace that = (RestauracnePrace) o;

        if (idPrace != that.idPrace) return false;
        if (cisloObjednavky != that.cisloObjednavky) return false;
        if (!datumZaciatku.equals(that.datumZaciatku)) return false;
        if (!datumUkoncenia.equals(that.datumUkoncenia)) return false;
        if (!popisPrace.equals(that.popisPrace)) return false;
        return hradZamok.equals(that.hradZamok);
    }

    @Override
    public int hashCode() {
        int result = idPrace;
        result = 31 * result + cisloObjednavky;
        result = 31 * result + datumZaciatku.hashCode();
        result = 31 * result + datumUkoncenia.hashCode();
        result = 31 * result + popisPrace.hashCode();
        result = 31 * result + hradZamok.hashCode();
        return result;
    }
}
