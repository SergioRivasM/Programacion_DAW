package MOD_DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {

        try {

            //-- 1 - CARGA EL CONTENIDO DEL XML EN LA ESTRUCTURA DOM --//
            //------------------------------------------------------//

            //Obtengo la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //Parseo el documento XML para tenerlo cargado en memoria
            Document doc = db.parse(new File("comicsXML.xml"));

            //Obtengo el nodo raíz
            Node root = doc.getDocumentElement();


            //-- 2 - AÑADIR ANTES DE CADA NODO HIJO DE TIPO ETIQUETA  (EN EL EJEMPLO LOS NODOS HIJOS ERAN <PERSONA>  EL SIGUIENTE COMENTARIO <!-- COMENTARIO AÑADIDO DESDE DOM -->//
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------//

            //Creo el comentario
            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");

            NodeList nl = doc.getElementsByTagName("comic");

            //Insertamos un nodo comentario antes de cada comic
            for (int i = 0; i < nl.getLength(); i++) {
                root.insertBefore(comentario.cloneNode(false), nl.item(i));
            }

            //-- 3 - AÑADIR UNA NUEVA ETIQUETA HIJA (EN EL EJEMPLO UNA NUEVA PERSONA) COMO ÚLTIMO HIJO --//
            //---------------------------------------------------------------------------------------//

            //Insertamos un nuevo nodo Element comic

            //Creo la etiqueta padre comic y le doy nombre
            Element comic = doc.createElement("comic");
            comic.setAttribute("id","06");

            //Creo las etiquetas hijas correspondientes y les doy valor
            Element autor = doc.createElement("autor");
            autor.setTextContent("Jason Cafu");

            Element titulo = doc.createElement("titulo");
            titulo.setTextContent("Valquiria");

            Element genero = doc.createElement("genero");
            genero.setTextContent("Superhéroes");

            Element precio = doc.createElement("precio");
            precio.setTextContent("2.85");

            Element fechapublicacion = doc.createElement("fechapublicacion");
            fechapublicacion.setTextContent("05-03-2020");

            Element descripcion = doc.createElement("descripcion");
            descripcion.setTextContent("El enemigo de Valquiria descubre su rostro para enseñar a la guardiana de los caídos una importante lección.");

            //Construyo toda la estructura general de la etiqueta
            comic.appendChild(autor);
            comic.appendChild(titulo);
            comic.appendChild(genero);
            comic.appendChild(precio);
            comic.appendChild(fechapublicacion);
            comic.appendChild(descripcion);

            //Añado ese nuevo nodo al root
            root.appendChild(comic);

            //Clono el último nodo y modificamos el atributo
            NodeList nlc = doc.getElementsByTagName("comic");
            Node node = nlc.item(nlc.getLength()-1);
            Element comicClonado = (Element) node.cloneNode(true);

            //Cambio el valor del atributo
            comicClonado.setAttribute("id","07");

            //Añado ese nuevo nodo al root
            root.appendChild(comicClonado);


            //-- 4 - CREAR UN NUEVO NODO ETIQUETA (EN EL EJEMPLO UNA NUEVA PERSONA) Y REEMPLAZAR LA PRIMERA ETIQUETA HIJA POR ESE NODO CREADO. --//
            //-------------------------------------------------------------------------------------------------------------------------------//

            //Voy a reemplazar el primer comic por el último clonado anteriormente

            //Creo la variable para el primer comic (índice 0)
            Element primerComic = (Element) doc.getElementsByTagName("comic").item(0);

            //reemplazo el comic clonado anteriormente por el primer comic
            root.replaceChild(comicClonado,primerComic);

            //-- 5 - VOLCAR TODAS LAS MODIFICACIONES A UN FICHERO XML LLAMADO DOM_MODIFICADO.XML --//
            //-------------------------------------------------------------------------------//

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
            File nuevoComic = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoComic);

            //Hago la transformación
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}