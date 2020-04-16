package STAX_Comic;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
    public static void main(String[] args) {

        //Creo el ArrayList de objetos comic
        ArrayList<Comic> listaComic = new ArrayList<>();

        //Creo los 10 objetos y los añado a la lista
        listaComic.add(new Comic(1,"Spider-Man", "Stan Lee", "Superhéroes", 3.75));
        listaComic.add(new Comic(2,"Iron Man", "Gene Colan", "Superhéroes", 2.65));
        listaComic.add(new Comic(3,"Capitán América", "Jason Masters", "Superhéroes", 5.35));
        listaComic.add(new Comic(4,"Thor", "Jack Kirby", "Superhéroes", 6.75));
        listaComic.add(new Comic(5,"Valquiria", "Jason Cafu", "Superhéroes", 2.85));
        listaComic.add(new Comic(6,"Doctor Extraño", "Javier Pina", "Superhéroes", 4.25));
        listaComic.add(new Comic(7,"Viuda Negra", "Armentaro", "Superhéroes", 8.55));
        listaComic.add(new Comic(8,"Pantera Negra", "Daniel Acuña", "Superhéroes", 7.15));
        listaComic.add(new Comic(9,"Ojo de Halcón", "Fraction", "Superhéroes", 9.25));
        listaComic.add(new Comic(10,"Daredevil", "Marco Checchetto", "Superhéroes", 2.95));


        try {

            //Objeto para escribir en el fichero XML
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            //Objeto que me va a servir para crear los eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Evento de inicio de documento escritura
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            //Evento para introducir el salto de línea y el salto de línea con tabulador
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            //Creo el evento necesario para crear la etiqueta raíz catalogo
            StartElement catalogoStartElement = eventFactory.createStartElement("","","catalogo");
            xmlWriter.add(catalogoStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Variable para controlar cuál es el último comic, para ofrecer una salida por pantalla distinta a la etiqueta fin de catalogo
            int longitud = 0;

            //Recorro la lista y voy creando las etiquetas necesarias para cada una de ellas
            for (Comic c : listaComic) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los comics
                StartElement comicStart = eventFactory.createStartElement("","","comic");
                StartElement tituloStart = eventFactory.createStartElement("","","titulo");
                StartElement autorStart = eventFactory.createStartElement("","","autor");
                StartElement generoStart = eventFactory.createStartElement("","","genero");
                StartElement precioStart = eventFactory.createStartElement("","","precio");

                //Creo el atribudo id de la etiqueta comic
                Attribute id = eventFactory.createAttribute("id",Integer.toString(c.getId()));

                //Creo todas las etiquetas de cierre que va a tener cada uno de los comics
                EndElement comicEnd = eventFactory.createEndElement("","","comic");
                EndElement tituloEnd = eventFactory.createEndElement("","","titulo");
                EndElement autorEnd = eventFactory.createEndElement("","","autor");
                EndElement generoEnd = eventFactory.createEndElement("","","genero");
                EndElement precioEnd = eventFactory.createEndElement("","","precio");

                //Creo los contenidos de las distintas etiquetas
                Characters titulo = eventFactory.createCharacters(c.getTitulo());
                Characters autor  = eventFactory.createCharacters(c.getAutor());
                Characters genero = eventFactory.createCharacters(c.getGenero());
                Characters precio = eventFactory.createCharacters(Double.toString(c.getPrecio()));

                //Añado todos los elementos correspondientes a un comic en el orden establecido
                xmlWriter.add(comicStart);

                //Añado el atributo de la etiqueta comic
                xmlWriter.add(id);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Escribo los hijos de cada comic
                xmlWriter.add(tituloStart);
                xmlWriter.add(titulo);
                xmlWriter.add(tituloEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(autorStart);
                xmlWriter.add(autor);
                xmlWriter.add(autorEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(generoStart);
                xmlWriter.add(genero);
                xmlWriter.add(generoEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(precioStart);
                xmlWriter.add(precio);
                xmlWriter.add(precioEnd);

                xmlWriter.add(saltoDeLineaTab);

                //Cierro el comic que estoy escribiendo
                xmlWriter.add(comicEnd);

                //Si estoy en el final del documento o en la última etiqueta comic
                if (longitud == listaComic.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;
            }

            //Evento necesario para cerrar la etiqueta raíz catalogo
            EndElement catalogoEndElement = eventFactory.createEndElement("","","catalogo");
            xmlWriter.add(catalogoEndElement);
            xmlWriter.add(saltoDeLinea);

            //Evento de finalización del documento y escritura
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}