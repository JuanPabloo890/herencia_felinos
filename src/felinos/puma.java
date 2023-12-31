package felinos;

public class puma extends felinos {
    private String habitat;
    private String tamanio;
    private String caza;
    private String pelaje;

    public puma(String nombre, int vida, String color, double peso, String velocidad,String habitat, String tamanio, String caza, String pelaje) {
        super(nombre, vida, color, peso, velocidad);
        this.habitat=habitat;
        this.tamanio=tamanio;
        this.caza=caza;
        this.pelaje=pelaje;
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

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void mostrarPuma(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Tiempo de vida: "+ this.getVida() + " años");
        System.out.println("Color principal: "+ this.getColor());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Maxima Velocidad: "+ this.getVelocidad());
        System.out.println("Pelaje del puma: "+this.getPelaje());
        System.out.println("Habitat del puma: "+this.getHabitat());
        System.out.println("Caza del puma: "+this.getCaza());
        System.out.println("Tamaño del puma: "+this.getTamanio());
    }
}
