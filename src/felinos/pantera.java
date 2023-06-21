package felinos;

public class pantera extends felinos {

    private String habitat;
    private String tamanio;
    private String caza;
    private String reproduccion;

    public pantera(String nombre, int vida, String color, double peso, String velocidad,String habitat, String tamanio, String caza, String reproduccion) {
        super(nombre, vida, color, peso, velocidad);
        this.habitat=habitat;
        this.tamanio=tamanio;
        this.caza=caza;
        this.reproduccion=reproduccion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getCaza() {
        return caza;
    }

    public void setCaza(String caza) {
        this.caza = caza;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public void mostrarPantera(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Tiempo de vida: "+ this.getVida() + " años");
        System.out.println("Color principal: "+ this.getColor());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Maxima Velocidad: "+ this.getVelocidad());
        System.out.println("Pelaje de la pantera: "+this.reproduccion);
        System.out.println("Habitat de la pantera: "+this.getHabitat());
        System.out.println("Tamaño de la pantera: "+this.getTamanio());
    }
}
