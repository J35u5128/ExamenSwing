public class Usuario {
    private String email;
    private String pais;
    private String plataforma;

    public Usuario(String email, String pais, String plataforma) {
        this.email = email;
        this.pais = pais;
        this.plataforma = plataforma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String toString() {
        return "email='" + email + '\'' +
                ", pais='" + pais + '\'' +
                ", plataforma='" + plataforma + '\'';
    }
}
