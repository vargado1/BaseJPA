package JPA.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@jakarta.persistence.Table(name = "hrad_alebo_zamok", schema = "public", catalog = "vargado1")
public class HradAleboZamok {

    @Id
    @jakarta.persistence.Column(name = "id_hrad")
    private int idHrad;

    public int getIdHrad() {
        return idHrad;
    }

    public void setIdHrad(int idHrad) {
        this.idHrad = idHrad;
    }

    @Basic
    @Column(name = "nazov")
    private String nazov;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    @Basic
    @Column(name = "historicke_pozadie")
    private String historickePozadie;

    public String getHistorickePozadie() {
        return historickePozadie;
    }

    public void setHistorickePozadie(String historickePozadie) {
        this.historickePozadie = historickePozadie;
    }

    @Basic
    @Column(name = "je_hrad")
    private boolean jeHrad;

    public boolean isJeHrad() {
        return jeHrad;
    }

    public void setJeHrad(boolean jeHrad) {
        this.jeHrad = jeHrad;
    }

    @Basic
    @Column(name = "rozloha")
    private int rozloha;

    public int getRozloha() {
        return rozloha;
    }

    public void setRozloha(int rozloha) {
        this.rozloha = rozloha;
    }

    @Basic
    @Column(name = "vznik")
    private String vznik;

    public String getVznik() {
        return vznik;
    }

    public void setVznik(String vznik) {
        this.vznik = vznik;
    }

    @Basic
    @Column(name = "stav")
    private String stav;

    public String getStav() {
        return stav;
    }

    public void setStav(String stav) {
        this.stav = stav;
    }

    @ManyToMany
    @JoinTable(
            name = "medzitabulka_hrad_akcia",
            joinColumns = @JoinColumn(name = "id_hrad_mez"),
            inverseJoinColumns = @JoinColumn(name = "id_akcia_mez")
    )
    private List<AkcieNaHradeAleboZamku> akcie;

    public List<AkcieNaHradeAleboZamku> getAkcie() {
        return akcie;
    }

    public void setAkcie(List<AkcieNaHradeAleboZamku> akcie) {
        this.akcie = akcie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HradAleboZamok that = (HradAleboZamok) o;

        if (idHrad != that.idHrad) return false;
        if (jeHrad != that.jeHrad) return false;
        if (rozloha != that.rozloha) return false;
        if (nazov != null ? !nazov.equals(that.nazov) : that.nazov != null) return false;
        if (historickePozadie != null ? !historickePozadie.equals(that.historickePozadie) : that.historickePozadie != null)
            return false;
        if (vznik != null ? !vznik.equals(that.vznik) : that.vznik != null) return false;
        if (stav != null ? !stav.equals(that.stav) : that.stav != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHrad;
        result = 31 * result + (nazov != null ? nazov.hashCode() : 0);
        result = 31 * result + (historickePozadie != null ? historickePozadie.hashCode() : 0);
        result = 31 * result + (jeHrad ? 1 : 0);
        result = 31 * result + rozloha;
        result = 31 * result + (vznik != null ? vznik.hashCode() : 0);
        result = 31 * result + (stav != null ? stav.hashCode() : 0);
        return result;
    }
}
