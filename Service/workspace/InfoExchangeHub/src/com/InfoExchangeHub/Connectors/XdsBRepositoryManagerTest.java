/**
 * 
 */
package com.InfoExchangeHub.Connectors;

import static org.junit.Assert.*;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

import org.junit.Test;
import org.apache.log4j.Logger;

/**
 * @author A. Sute
 *
 */
public class XdsBRepositoryManagerTest
{
    /** Logger */
    public static final Logger log = Logger.getLogger(XdsBRepositoryManagerTest.class);

	private static final String xdsBRegistryEndpointURI = "http://ihexds.nist.gov:80/tf6/services/xdsregistryb";
	private static final String xdsBRepositoryEndpointURI = "http://ihexds.nist.gov:80/tf6/services/xdsrepositoryb";
	private static final String xdsBRegistryTLSEndpointURI = "https://ihexds.nist.gov:12091/tf6/services/xdsregistryb";
	private static final String xdsBRepositoryTLSEndpointURI = "https://ihexds.nist.gov:12091/tf6/services/xdsrepositoryb";
	private static XdsBRepositoryManager XdsBRepository = null;
	/**
	 * Test method for {@link com.InfoExchangeHub.Connectors.XdsBRepositoryManager#ProvideAndRegisterDocumentSet(java.lang.String, java.util.List)}.
	 */
	@Test
	public void testProvideAndRegisterDocumentSet()
	{
		String cdaFilename = "c:/temp/b2 Adam Everyman ToC.xml";
		try
		{
			log.info("Repository ProvideAndRegisterDocumentSet (ITI-41) unit test started...");
			XdsBRepository = new XdsBRepositoryManager(xdsBRegistryEndpointURI,
					xdsBRepositoryEndpointURI);
			
			// Read contents of file into string...
			byte[] fileContents = readAllBytes(get(cdaFilename));
			
			XdsBRepository.provideAndRegisterDocumentSet(fileContents,
					"text/xml");
			
			log.info("XDS.b document set query response in log message immediately following...");
//			OMElement requestElement = documentSetResponse.getOMElement(RetrieveDocumentSetResponse.MY_QNAME,
//					soapFactory);
//			log.info(requestElement);

			log.info("Repository ProvideAndRegisterDocumentSet (ITI-41) unit test ending.");
		}
		catch (Exception e)
		{
			fail("Error - " + e.getMessage());
		}
	}
	
	/**
	 * Test method for {@link com.InfoExchangeHub.Connectors.XdsBRepositoryManager#ProvideAndRegisterDocumentSet(java.lang.String, java.util.List)}.
	 */
	@Test
	public void testTLSProvideAndRegisterDocumentSet()
	{
		String cdaFilename = "c:/temp/b2 Adam Everyman ToC.xml";
		try
		{
			log.info("Repository TLS ProvideAndRegisterDocumentSet (ITI-41) unit test started...");
			XdsBRepository = new XdsBRepositoryManager(xdsBRegistryTLSEndpointURI,
					xdsBRepositoryTLSEndpointURI,
					true);
			
			// Read contents of file into string...
			byte[] fileContents = readAllBytes(get(cdaFilename));
			
			XdsBRepository.provideAndRegisterDocumentSet(fileContents,
					"text/xml");
			
			log.info("XDS.b document set query response in log message immediately following...");
//			OMElement requestElement = documentSetResponse.getOMElement(RetrieveDocumentSetResponse.MY_QNAME,
//					soapFactory);
//			log.info(requestElement);

			log.info("Repository TLS ProvideAndRegisterDocumentSet (ITI-41) unit test ending.");
		}
		catch (Exception e)
		{
			fail("Error - " + e.getMessage());
		}
	}
}