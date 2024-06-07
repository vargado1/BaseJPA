package JPA.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@IdClass(JPA.entities.MajordomPK.class)
public class Majordom {
    @Basic
    @jakarta.persistence.Column(name = "doba_sluzby_od")
    private Date dobaSluzbyOd;

    public Date getDobaSluzbyOd() {
        return dobaSluzbyOd;
    }

    public void setDobaSluzbyOd(Date dobaSluzbyOd) {
        this.dobaSluzbyOd = dobaSluzbyOd;
    }

    @Basic
    @jakarta.persistence.Column(name = "doba_sluzby_do")
    private Date dobaSluzbyDo;

    public Date getDobaSluzbyDo() {
        return dobaSluzbyDo;
    }

    public void setDobaSluzbyDo(Date dobaSluzbyDo) {
        this.dobaSluzbyDo = dobaSluzbyDo;
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
    @jakarta.persistence.Column(name = "titul")
    private String titul;

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    @Id
    @Column(name = "dvorania_meno")
    private String dvoraniaMeno;

    public String getDvoraniaMeno() {
        return dvoraniaMeno;
    }

    public void setDvoraniaMeno(String dvoraniaMeno) {
        this.dvoraniaMeno = dvoraniaMeno;
    }

    @Id
    @Column(name = "dvorania_hrad_zamok")
    private String dvoraniaHradZamok;

    public String getDvoraniaHradZamok() {
        return dvoraniaHradZamok;
    }

    public void setDvoraniaHradZamok(String dvoraniaHradZamok) {
        this.dvoraniaHradZamok = dvoraniaHradZamok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Majordom majordom = (Majordom) o;

        if (dobaSluzbyOd != null ? !dobaSluzbyOd.equals(majordom.dobaSluzbyOd) : majordom.dobaSluzbyOd != null)
            return false;
        if (dobaSluzbyDo != null ? !dobaSluzbyDo.equals(majordom.dobaSluzbyDo) : majordom.dobaSluzbyDo != null)
            return false;
        if (priezvisko != null ? !priezvisko.equals(majordom.priezvisko) : majordom.priezvisko != null) return false;
        if (titul != null ? !titul.equals(majordom.titul) : majordom.titul != null) return false;
        if (dvoraniaMeno != null ? !dvoraniaMeno.equals(majordom.dvoraniaMeno) : majordom.dvoraniaMeno != null)
            return false;
        if (dvoraniaHradZamok != null ? !dvoraniaHradZamok.equals(majordom.dvoraniaHradZamok) : majordom.dvoraniaHradZamok != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dobaSluzbyOd != null ? dobaSluzbyOd.hashCode() : 0;
        result = 31 * result + (dobaSluzbyDo != null ? dobaSluzbyDo.hashCode() : 0);
        result = 31 * result + (priezvisko != null ? priezvisko.hashCode() : 0);
        result = 31 * result + (titul != null ? titul.hashCode() : 0);
        result = 31 * result + (dvoraniaMeno != null ? dvoraniaMeno.hashCode() : 0);
        result = 31 * result + (dvoraniaHradZamok != null ? dvoraniaHradZamok.hashCode() : 0);
        return result;
    }
}
