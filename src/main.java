import felinos.*;

public class main {
    public static void main(String[] args) {
        felinos feli = new felinos("Gato",18,"Diferentes colores",5,"48 km/h");
        leopardo leo= new leopardo("Leopardo",17,"Amarillo-Negro",35,"58 km/h","Motas rectangullares","Africa","Solitario");
        tigre tiger = new tigre("Tigre",15,"Negro-Amarillo-Blanco",310,"65 km/h","Selva Tropical","3,1m","Solitario-Sigilo y un buen nadador","Lineas negras en todo el cuerpo");
        pantera pant = new pantera("Pantera",25,"Negro",90,"60 km/h","Montañas","1,5m","Solitario - Arriba de los arboles","1 vez al año gestacion de 93 a 110 dias");
        puma puma = new puma("Puma",13,"Cafe",100,"80 km/h","Sabana","2,4m","Esconderse entre arboles","Corto y aspero");
        leon leon = new leon("Leon",16, "Naranja",190,"80 km/h","Sabanas","2,1m","Caza en manadas","Melena varios colores","72kg por cm2 = 4450 newtons");

        feli.mostrarFelinos();
        System.out.println(" ");
        leo.mostrarLeopardo();
        System.out.println(" ");
        tiger.mostrartigre();
        System.out.println(" ");
        pant.mostrarPantera();
        System.out.println(" ");
        puma.mostrarPuma();
        System.out.println(" ");
        leon.mostrarLeon();

    }
}
