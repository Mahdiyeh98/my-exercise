package com.mahdiyeh_rezaei.convertxmltohtml.stax;

import javax.xml.stream.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StaxTransformer {

    private Map<String, String> map;

    public StaxTransformer(String resourcePath) throws IOException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
        factory.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
        XMLStreamReader input = null;
        try (FileInputStream file = new FileInputStream(resourcePath)) {
            input = factory.createXMLStreamReader(file);
            map = buildMap(input);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public String html() throws XMLStreamException, IOException {
        try (Writer output = new StringWriter()) {
            XMLStreamWriter writer = XMLOutputFactory
                    .newInstance()
                    .createXMLStreamWriter(output);
            //Head
            writer.writeDTD("<!DOCTYPE html>");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("html");
            writer.writeAttribute("lang", "en");
            writer.writeNamespace("th", "https://www.thymeleaf.org");
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("head");
            writer.writeCharacters(String.format("%n"));
            writer.writeDTD("<META http-equiv=\"Content-Type\" content=\"text/html\" charset=\"UTF-8\">");
            writer.writeCharacters(String.format("%n"));
            writer.writeDTD("<META name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            writer.writeCharacters(String.format("%n"));
            writer.writeDTD("<META name=\"author\" content=\"Mahdiyeh Rezaei\">");
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("title");
            writer.writeCharacters("LVS-006");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("link");
            writer.writeAttribute("rel", "canonical");
            writer.writeAttribute("href", "https://getbootstrap.com/docs/5.0/examples/blog/");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));

            writer.writeComment(" Bootstrap core CSS ");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("link");
            writer.writeAttribute("href", "../static/css/bootstrap.min.css");
            writer.writeAttribute("rel", "stylesheet");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("link");
            writer.writeAttribute("href", "../static/css/custom.css");
            writer.writeAttribute("rel", "stylesheet");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));

            //Body
            writer.writeStartElement("body");
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "container");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "header");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "row");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "col-md-4");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "img");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("img"); //<img>
            writer.writeAttribute("src", "https://up.7Learn.com/m/bnr/flutter-r10.png");
            writer.writeAttribute("class", "img-fluid rounded-start img-size");
            writer.writeAttribute("alt", "image");
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();  //</img>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();  //</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();  //</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div");  //<div>
            writer.writeAttribute("class", "col-md-8");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("h5");  //<h5>
            writer.writeAttribute("class", "bold");
            writer.writeCharacters(map.get("GHNAME"));
            writer.writeEndElement(); // </h5>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement(); //</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement(); //</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement(); //</div>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "content");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "row mt-5");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "col-md-12 border border-dark rounded");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("ul"); //<ul>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("li"); //<li>
            writer.writeCharacters(map.get("LIEFNR"));
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters(map.get("SPED"));
            writer.writeEndElement();//</li>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</ul>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "row mt-2");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "col-md-12");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("ul"); //<ul>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("li"); //<li>
            writer.writeCharacters("test");
            writer.writeEndElement();
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</ul>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "row mt-3");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "col-md-3 border border-end-0 border-dark rounded");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "img");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("img"); //<img>
            writer.writeAttribute("src", "https://up.7Learn.com/m/bnr/flutter-r10.png");
            writer.writeAttribute("class", "img-fluid rounded-start img-size");
            writer.writeAttribute("alt", "img2");
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</img>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("div");
            writer.writeAttribute("class", "col-md-9 border border-dark rounded");
            writer.writeCharacters(String.format("%n"));
            writer.writeCharacters("Falschlieferung");
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("div"); //<div>
            writer.writeAttribute("class", "row mt-4");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("table"); //<table>
            writer.writeAttribute("class", "table text-center");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("thead"); //<thead>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("tr"); //<tr>
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("NVE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("ARTIKEL");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("GTINBE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("GTINKE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("SOLL MENGE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("IST MENGE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("th"); //<th>
            writer.writeAttribute("scope", "col");
            writer.writeCharacters("CHARGE");
            writer.writeEndElement(); //</th>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</thead>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</tbody>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("tbody"); //<tbody>
            writer.writeCharacters(String.format("%n"));
            writer.writeComment("/*@thymesVar id=\"map\" type=\"java.util.Map\"*/-");
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("tr"); //<tr>
            writer.writeAttribute("th", ":", "each", "map1 : ${map}");
            writer.writeStartElement("td");//<td>
            writer.writeCharacters(map.get("NVE"));
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters(map.get("MATERIAL"));
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters(map.get("GTIN_BME"));
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters(map.get("GTIN_KO"));
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters("144");
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters("202");
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeStartElement("td");//<td>
            writer.writeCharacters("#");
            writer.writeEndElement();//</td>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</tr>

            for (int i = 0; i < 5; i++) {
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("tr"); //<tr>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("test");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("test");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("test");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("test");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("144");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("202");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeStartElement("td");//<td>
                writer.writeCharacters("#");
                writer.writeEndElement();//</td>
                writer.writeCharacters(String.format("%n"));
                writer.writeEndElement();//</tr>
            }


            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</tbody>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</table>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();//</div>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndElement();// last </div>
            writer.writeCharacters(String.format("%n"));

            writer.writeStartElement("script");
            writer.writeAttribute("src", "../static/js/bootstrap.bundle.min.js");
            writer.writeEndElement();// </script>
            writer.writeCharacters(String.format("%n"));

            writer.writeEndElement();//</body>
            writer.writeCharacters(String.format("%n"));
            writer.writeEndDocument();//</html>
            writer.writeCharacters(String.format("%n"));
            writer.flush();

            return output.toString();
        }
    }

    private Map<String, String> buildMap(XMLStreamReader input) throws XMLStreamException {
        Map<String, String> tempMap = new HashMap<>();
        while (input.hasNext()) {
            input.next();
            if (input.isStartElement()) {

                if (input.getLocalName().equals("NVE")) {
                    tempMap.put("NVE", input.getElementText());
                }
                if (input.getLocalName().equals("MATERIAL")) {
                    tempMap.put("MATERIAL", input.getElementText());
                }
                if (input.getLocalName().equals("GTIN_BME")) {
                    tempMap.put("GTIN_BME", input.getElementText());
                }
                if (input.getLocalName().equals("GTIN_KO")) {
                    tempMap.put("GTIN_KO", input.getElementText());
                }
                if (input.getLocalName().equals("SPED")) {
                    tempMap.put("SPED", input.getElementText());
                }
                if (input.getLocalName().equals("LIEFNR")) {
                    tempMap.put("LIEFNR", input.getElementText());
                }
                if (input.getLocalName().equals("GHNAME")) {
                    tempMap.put("GHNAME", input.getElementText());
                }
            }
        }
        return tempMap;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void createFile(String resourcePath, String fileName, String htmlOutput) throws IOException {

        File file = new File(resourcePath + fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(htmlOutput);
        bw.close();
    }
}
