package Clases;

public class BusquedaInterpolacion {
    public static int BusquedaInterpolacion(int[] Vector, int ElementoABuscar) {
    int IndiceInicial = 0;
    int IndiceFinal = (Vector.length - 1);
    while ((IndiceInicial <= IndiceFinal) && (ElementoABuscar >= Vector[IndiceInicial]) &&
           (ElementoABuscar <= Vector[IndiceFinal])) {
        //Usando la fórmula de la Interpolación para encontrar, probablemente, la mejor posición para que exista el elemento.
        int Posicion = IndiceInicial + (((IndiceFinal-IndiceInicial) /
          (Vector[IndiceFinal]-Vector[IndiceInicial]))*
                        (ElementoABuscar - Vector[IndiceInicial]));
        if (Vector[Posicion] == ElementoABuscar)
            return Posicion;
        if (Vector[Posicion] < ElementoABuscar)
            IndiceInicial = Posicion + 1;
        else
            IndiceFinal = Posicion - 1;
    }
    return -1;

}
}
