public class Persona {
  int edad;
  int cantidadMateriasCursadas;
  int cantidadMateriasDesaprobadas;


  public int cuantasFaltanParaRecibirse(int cantidadTotalCarrera){
    return cantidadTotalCarrera - cantidadMateriasCursadas;
  }


}
