package STAX_Comic;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarStax {
    public static void main(String[] args) {

        try {
            //Obtengo el lector de XML
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("comicsXML.xml"));

            //Recorro la lista de eventos
            while (xmlReader.hasNext()) {
                //Obtengo el evento siguiente que voy a tratar
                XMLEvent xmlEvent = xmlReader.nextEvent();

                //Evento de apertura de etiqueta
                if (xmlEvent.isStartElement()) {

                    //Obtengo la información de la etiqueta
                    StartElement startTag = xmlEvent.asStartElement();

                    String tagName = startTag.getName().getLocalPart();

                    switch (tagName) {
                        case "catalogo":
                            //Establezco cuál es la etiqueta que estoy tratando, en este caso la etiqueta raíz
                            System.out.println("<" + startTag.getName().getLocalPart() + ">");
                            break;

                        case "comic":
                            //Establezco la siguiente etiqueta hija, la tabulo para darle formato, y hago llamada a su atributo id
                            System.out.print('\t' + "<" + startTag.getName().getLocalPart());
                            Attribute id = startTag.getAttributeByName(new QName("id"));
                            System.out.println(" "+id.getName()+"=\""+id.getValue()+"\""+">");
                            break;

                            //Establezco la estructura para el resto de etiquetas
                        case "titulo":
                        case "autor":
                        case "genero":
                        case "precio":
                            System.out.print("\t\t" + "<" + startTag.getName().getLocalPart() + ">");
                            break;
                    }

                    //Evento de cierre de etiqueta
                } else if (xmlEvent.isEndElement()) {

                    //Obtengo la información de la etiqueta
                    EndElement endTag = xmlEvent.asEndElement();

                    String tagName = endTag.getName().getLocalPart();
                    switch (tagName) {
                        case "comic":
                            System.out.println('\t' + "</" + endTag.getName().getLocalPart() + ">");
                            break;

                        //Establezco la estructura para el resto de etiquetas
                        case "titulo":
                        case "autor":
                        case "genero":
                        case "precio":
                            System.out.println("</" + endTag.getName().getLocalPart() + ">");
                            break;
                    }

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();
                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}