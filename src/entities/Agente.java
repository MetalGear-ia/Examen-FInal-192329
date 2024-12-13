package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivel;

    public Agente(int id, String nombre, String habilidadEspecial, int nivel) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivel = nivel;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public int getNivel(){
        return nivel;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }
    public void subirNivel (Agente agente){
        nivel = nivel +1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
