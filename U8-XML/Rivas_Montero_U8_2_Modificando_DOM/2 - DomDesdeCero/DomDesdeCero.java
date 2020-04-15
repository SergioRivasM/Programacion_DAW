package DOM_ModificarDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {
    public static void main(String[] args) {

        //Creo el ArrayList de objetos comic
        ArrayList <Comic> listaComic = new ArrayList<>();

        //Creo los 10 objetos para el ArrayList
        listaComic.add(new Comic("Stan Lee", "Spider-Man", "Superhéroes", 3.75));
        listaComic.add(new Comic("Gene Colan", "Iron Man", "Superhéroes", 2.60));
        listaComic.add(new Comic("Jason Masters", "Capitán América", "Superhéroes", 5.30));
        listaComic.add(new Comic("Jack Kirby", "Thor", "Superhéroes", 6.75));
        listaComic.add(new Comic("Jason Cafu", "Valquiria", "Superhéroes", 2.80));
        listaComic.add(new Comic("Javier Pina", "Doctor Extraño", "Superhéroes", 4.25));
        listaComic.add(new Comic("Armentaro", "Viuda Negra", "Superhéroes", 8.50));
        listaComic.add(new Comic("Daniel Acuña", "Pantera Negra", "Superhéroes", 7.10));
        listaComic.add(new Comic("Fraction", "Ojo de Halcón", "Superhéroes", 9.20));
        listaComic.add(new Comic("Marco Checchetto", "Daredevil", "Superhéroes", 2.90));

        try {

            //Obtengo la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //Obtengo un nuevo fichero
            Document doc = db.newDocument();

            //Creo el elemento raíz ya que está vacío
            Element root = doc.createElement("catalogo");

            //Añado el elemento raíz
            doc.appendChild(root);

            //Con un bucle recorro el ArrayList para añadir los distintos nodos al XML
            for (int i = 0; i < listaComic.size(); i++) {

                //Creo la etiqueta padre que voy a almacenar en el fichero
                Element comicTag = doc.createElement("comic");

                //Creo las respectivas etiquetas hija de comic
                Element titulo = doc.createElement("titulo");
                titulo.setTextContent(listaComic.get(i).getTitulo());

                Element autor = doc.createElement("autor");
                autor.setTextContent(listaComic.get(i).getAutor());

                Element genero = doc.createElement("genero");
                genero.setTextContent(listaComic.get(i).getGenero());

                Element precio = doc.createElement("precio");
                precio.setTextContent(Double.toString(listaComic.get(i).getPrecio()));

                //Añado las hijas a asignatura
                comicTag.appendChild(titulo);
                comicTag.appendChild(autor);
                comicTag.appendChild(genero);
                comicTag.appendChild(precio);

                //Añado esa nueva etiqueta al nodo raíz
                root.appendChild(comicTag);
            }

            //Vuelco todas las moficiaciones al fichero XML
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            //Fichero XML que va a ser mi destino con las modificaciones realizadas
            File nuevoComic = new File("cero.xml");
            StreamResult destino = new StreamResult(nuevoComic);

            //Hago la transformación
            transformer.transform(origenDOM, destino);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}