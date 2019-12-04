package Zadania.RejestrOsob;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RejestrOsob {

    List<Osoba> osoby = new ArrayList<>();

    public RejestrOsob(ArrayList<Osoba> osoby) {
        this.osoby = osoby;
    }

    @Override
    public String toString() {
        return "W rejestrze osób jest " + osoby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RejestrOsob that = (RejestrOsob) o;
        return Objects.equals(osoby, that.osoby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osoby);
    }

    public List<Osoba> getOsoby() {
        return osoby;
    }

    public void setOsoby(List<Osoba> osoby) {
        this.osoby = osoby;
    }
}
