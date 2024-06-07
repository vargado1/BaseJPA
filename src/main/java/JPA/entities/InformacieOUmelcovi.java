package JPA.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@jakarta.persistence.Table(name = "informacie_o_umelcovi", schema = "public", catalog = "vargado1")
public class InformacieOUmelcovi {
    @Basic
    @jakarta.persistence.Column(name = "meno")
    private String meno;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    @Basic
    @jakarta.persistence.Column(name = "priezvisko")
    private String priezvisko;

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    @Basic
    @jakarta.persistence.Column(name = "zaciatok_posobenia")
    private Date zaciatokPosobenia;

    public Date getZaciatokPosobenia() {
        return zaciatokPosobenia;
    }

    public void setZaciatokPosobenia(Date zaciatokPosobenia) {
        this.zaciatokPosobenia = zaciatokPosobenia;
    }

    @Basic
    @jakarta.persistence.Column(name = "koniec_posobenia")
    private Date koniecPosobenia;

    public Date getKoniecPosobenia() {
        return koniecPosobenia;
    }

    public void setKoniecPosobenia(Date koniecPosobenia) {
        this.koniecPosobenia = koniecPosobenia;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nazov_diela")
    private String nazovDiela;

    public String getNazovDiela() {
        return nazovDiela;
    }

    public void setNazovDiela(String nazovDiela) {
        this.nazovDiela = nazovDiela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InformacieOUmelcovi that = (InformacieOUmelcovi) o;

        if (meno != null ? !meno.equals(that.meno) : that.meno != null) return false;
        if (priezvisko != null ? !priezvisko.equals(that.priezvisko) : that.priezvisko != null) return false;
        if (zaciatokPosobenia != null ? !zaciatokPosobenia.equals(that.zaciatokPosobenia) : that.zaciatokPosobenia != null)
            return false;
        if (koniecPosobenia != null ? !koniecPosobenia.equals(that.koniecPosobenia) : that.koniecPosobenia != null)
            return false;
        if (nazovDiela != null ? !nazovDiela.equals(that.nazovDiela) : that.nazovDiela != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = meno != null ? meno.hashCode() : 0;
        result = 31 * result + (priezvisko != null ? priezvisko.hashCode() : 0);
        result = 31 * result + (zaciatokPosobenia != null ? zaciatokPosobenia.hashCode() : 0);
        result = 31 * result + (koniecPosobenia != null ? koniecPosobenia.hashCode() : 0);
        result = 31 * result + (nazovDiela != null ? nazovDiela.hashCode() : 0);
        return result;
    }
}
