import java.util.List;
import java.util.ArrayList;

/**
 * Lista de libro de una biblioteca
 *
 */
public class ListaLibros {
    List <Libro> listLibros;

    /**
     * Constructor
     */
    public ListaLibros() {
        this.listLibros= new ArrayList();
    }

    /**
     * Incluye un nuevo libro en la lista
     * @param valor -> libro nuevo
     */
    public void pon(Libro valor){
        this.listLibros.add(valor);
    }

    /**
     * Comprueba que la lista está vacia
     * @return ->True (si esta vacia) o False (si no lo esta)
     */
    public boolean estaVacia(){
        return ( this.listLibros.size() == 0 );
    }

    /**
     * Quita un libro de la lista
     * @param id -> id libro devuelto
     * @return -> Libro (si lo encuentra) o null (si no existe)
     */
    public Libro quitar ( int id ) {
        for (int i=0; i<this.listLibros.size(); i++){
           if (this.listLibros.get(i).getId() == id){
               return this.listLibros.remove(i);
            }
        }
        System.out.println("No existe libro con id: "+ id);
        return null;
    }

    /**
     * Busca libro en la lista
     * @param titulo -> libro a buscar
     * @return -> id del libro (si lo encuentra) o -1 (si no esta)
     */
    public int buscarId ( String titulo ){
        for (int i=0; i<this.listLibros.size(); i++){
            if (this.listLibros.get(i).getTitulo().equals(titulo)){
                return this.listLibros.get(i).getId();
            }
        }
        System.out.println("No existe libro con titulo: "+ titulo);
        return -1;
    }

    /**
     * Muestra los libros almacenados
     */
    public void verCatalogo (){
        for (int i=0; i<this.listLibros.size(); i++){
            if (this.listLibros.get(i) != null){
                System.out.println(this.listLibros.get(i).toString());
            }
        }
    }
}