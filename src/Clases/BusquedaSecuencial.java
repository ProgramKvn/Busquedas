package Clases;

public class BusquedaSecuencial{
   //Función modificada: Imprimirá varias posiciones (si las hay) y como parámetro tiene un Vector String 
    public static String BusquedaSecuencial(String []Arreglo, String Dato){
        String Posicion = " ";
        for(int i = 0; i <Arreglo.length; i++){
            if(Arreglo[i].equals(Dato)){
                Posicion += i + ", ";
            }
        }
    return Posicion;
}
}