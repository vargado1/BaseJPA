package JPA.entities;

import jakarta.persistence.*;

@Entity
public class Dvorania {

    @Id
    @jakarta.persistence.Column(name = "id_dvorana")
    private int idDvorana;

    public int getIdDvorana() {
        return idDvorana;
    }

    public void setIdDvorana(int idDvorana) {
        this.idDvorana = idDvorana;
    }

    @Basic
    @Column(name = "meno")
    private String meno;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
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

    @Basic
    @Column(name = "nadriadeny")
    private Integer nadriadeny;

    public Integer getNadriadeny() {
        return nadriadeny;
    }

    public void setNadriadeny(Integer nadriadeny) {
        this.nadriadeny = nadriadeny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dvorania dvorania = (Dvorania) o;

        if (idDvorana != dvorania.idDvorana) return false;
        if (meno != null ? !meno.equals(dvorania.meno) : dvorania.meno != null) return false;
        if (hradZamok != null ? !hradZamok.equals(dvorania.hradZamok) : dvorania.hradZamok != null) return false;
        if (nadriadeny != null ? !nadriadeny.equals(dvorania.nadriadeny) : dvorania.nadriadeny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDvorana;
        result = 31 * result + (meno != null ? meno.hashCode() : 0);
        result = 31 * result + (hradZamok != null ? hradZamok.hashCode() : 0);
        result = 31 * result + (nadriadeny != null ? nadriadeny.hashCode() : 0);
        return result;
    }
}
