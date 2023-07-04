package tn.esprit;

import java.util.Objects;

public class Achats {
    private int ref;
    private String libelle;

    private String prix;

    private String description;

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achats achats = (Achats) o;
        return ref == achats.ref && Objects.equals(libelle, achats.libelle) && Objects.equals(prix, achats.prix) && Objects.equals(description, achats.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, libelle, prix, description);
    }
}
