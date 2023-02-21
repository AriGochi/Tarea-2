public class Main {
    public static void main(String[] args) {

        System.out.println("Programa que capture una cadena que tenga un nombre, una profesión y una nacionalidad. ");
        System.out.println("Ejemplo: Ruben Abogado México");

        String s = "Ruben Abogado México";

        String s1 = s.substring(0,5); //retorna: Ruben
        String may =s1.toUpperCase();
        System.out.println("Nombre:" + s1.toUpperCase());

        String s2 = s.substring (6,13); //retorna: Abogado
        String mayu =s2.toUpperCase();
        System.out.println("Profesión:" + s2.toUpperCase());

        String s3 = s.substring (14); //retorna: México
        String mayus =s3.toUpperCase();
        System.out.println("País:" + s3.toUpperCase());
    }
}