public class App {
    public static void main(String[] args) throws Exception {
        //Crear la instancia de la (clase u objeto) MetodosOrdenamiento

        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

        int[] numeros = {30, 7, 12, 5};

        //Mandar a imprimir mi arreglo
        metodosOrdenamiento.imprime(numeros);

        //Llamo al metodo sortyBbble y su respuesta guardo en
        //la variable arregloOrdenadoBbuble
        int[] arregloOrdenadoBuble = metodosOrdenamiento.sortBybblue(numeros);
        //Mando a imprimir mi nuevi arregki que ya fue ordenado 
        metodosOrdenamiento.imprime(arregloOrdenadoBuble);

        //Todo: Hacer un menu que elija el metodo



    }
}
