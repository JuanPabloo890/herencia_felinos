public class leopardo extends felinos{
    private String pelaje;
    private String habitat;
    private String caza;

    public leopardo(String nombre, int vida, String color, double peso, String velocidad, String pelaje, String habitat, String caza) {
        super(nombre, vida, color, peso, velocidad);
        this.pelaje=pelaje;
        this.habitat=habitat;
        this.caza=caza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCaza() {
        return caza;
    }

    public void setCaza(String caza) {
        this.caza = caza;
    }
    public void mostrarLeopardo(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Tiempo de vida: "+ this.getVida() + " años");
        System.out.println("Color principal: "+ this.getColor());
        System.out.println("Peso: "+ this.getPeso());
        System.out.println("Maxima Velocidad: "+ this.getVelocidad());
        System.out.println("Pelaje del leopardo: "+this.getPelaje());
        System.out.println("Habitat del leopardo: "+this.getHabitat());
        System.out.println("Caza del leopardo: "+this.getCaza());
    }
}
