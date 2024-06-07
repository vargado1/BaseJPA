package JPA.entities;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "geograficke_umiestnenie", schema = "public", catalog = "vargado1")
public class GeografickeUmiestnenie {

    @Id
    @jakarta.persistence.Column(name = "id_poloha")
    private int idPoloha;

    public int getIdPoloha() {
        return idPoloha;
    }

    public void setIdPoloha(int idPoloha) {
        this.idPoloha = idPoloha;
    }

    @Basic
    @Column(name = "GPS_suradnice")
    private String gpsSuradnice;

    public String getGpsSuradnice() {
        return gpsSuradnice;
    }

    public void setGpsSuradnice(String gpsSuradnice) {
        this.gpsSuradnice = gpsSuradnice;
    }

    @Basic
    @Column(name = "opis_okolia")
    private String opisOkolia;

    public String getOpisOkolia() {
        return opisOkolia;
    }

    public void setOpisOkolia(String opisOkolia) {
        this.opisOkolia = opisOkolia;
    }

    @Basic
    @Column(name = "kraj")
    private String kraj;

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @Basic
    @Column(name = "hrad_zamok")
    private String hradZamok;

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

        GeografickeUmiestnenie that = (GeografickeUmiestnenie) o;

        if (idPoloha != that.idPoloha) return false;
        if (gpsSuradnice != null ? !gpsSuradnice.equals(that.gpsSuradnice) : that.gpsSuradnice != null) return false;
        if (opisOkolia != null ? !opisOkolia.equals(that.opisOkolia) : that.opisOkolia != null) return false;
        if (kraj != null ? !kraj.equals(that.kraj) : that.kraj != null) return false;
        if (hradZamok != null ? !hradZamok.equals(that.hradZamok) : that.hradZamok != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPoloha;
        result = 31 * result + (gpsSuradnice != null ? gpsSuradnice.hashCode() : 0);
        result = 31 * result + (opisOkolia != null ? opisOkolia.hashCode() : 0);
        result = 31 * result + (kraj != null ? kraj.hashCode() : 0);
        result = 31 * result + (hradZamok != null ? hradZamok.hashCode() : 0);
        return result;
    }
}
