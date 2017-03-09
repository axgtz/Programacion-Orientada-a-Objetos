/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */

public class EjecutableZoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		
        z.altaAnimal("Gato", "Lisandro", 20);
        z.altaAnimal("Borrego", "Alex Guti", 30);
        z.altaAnimal("Toro", "Garrote", 19);
        z.altaAnimal("Perro", "Mariano", 10);
        System.out.println("El promedio de edad de los animales es: " + z.promEdad() );
        System.out.println("El numero de perros es: " + z.cuantosRaza("Perro"));
        System.out.println(z.toString());
	}

}

