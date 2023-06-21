public class felinos {
    //atributos

    private String nombre;
    private int vida;
    private String color;
    private double peso;
    private String velocidad;

    public felinos(String nombre, int vida, String color, double peso, String velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.color = color;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void mostrarFelinos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Tiempo de vida: "+this.vida + " años");
        System.out.println("Color principal: "+this.color);
        System.out.println("Peso: "+this.peso);
        System.out.println("Maxima Velocidad: "+this.velocidad);
    }
}
