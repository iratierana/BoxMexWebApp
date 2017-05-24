package fitxategiTratamentua;

import java.io.File;
import java.io.StringReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

/**
 * The Class PacketValidator.
 */
@Path("/packetValidator")
public class PacketValidator {

	/**
	 * Validate XML rest web service.
	 *
	 * @param paketeXml the pakete xml
	 * @return the string
	 */
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes("application/x-www-form-urlencoded")
	public String validateXML(@FormParam("paketeXml") final String paketeXml) {

		try {

			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File("D:/Uni3/2Semester/POPBL6/Kodigua/BoxMexWebApp/pakete.xsd"));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new StringReader(paketeXml)));

		} catch (Exception e) {
			return Boolean.FALSE.toString();
		}
		return Boolean.TRUE.toString();

	}

}
