package JPA.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class MajordomPK implements Serializable {

    @Id
    @Column(name = "dvorania_meno")
    private String dvoraniaMeno;

    @Id
    @Column(name = "dvorania_hrad_zamok")
    private String dvoraniaHradZamok;

    public MajordomPK() {}

    public MajordomPK(String dvoraniaMeno, String dvoraniaHradZamok) {
        this.dvoraniaMeno = dvoraniaMeno;
        this.dvoraniaHradZamok = dvoraniaHradZamok;
    }

    public String getDvoraniaMeno() {
        return dvoraniaMeno;
    }

    public void setDvoraniaMeno(String dvoraniaMeno) {
        this.dvoraniaMeno = dvoraniaMeno;
    }

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
        MajordomPK that = (MajordomPK) o;
        return Objects.equals(dvoraniaMeno, that.dvoraniaMeno) &&
                Objects.equals(dvoraniaHradZamok, that.dvoraniaHradZamok);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dvoraniaMeno, dvoraniaHradZamok);
    }
}
