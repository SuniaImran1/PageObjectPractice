package helpers;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class httpclientUtil {

	public static void main(String[] args) {
		try {

			testXpathXml xmlParser = new testXpathXml("");
			CloseableHttpClient client = HttpClients.createDefault();
			HttpUriRequest request = new HttpGet("https://httpbin.org/xml");

			CloseableHttpResponse response = client.execute(request);

			System.out.println(
					xmlParser.getXpathValueFromXMLStream(response.getEntity().getContent(), "//slide[1]/title"));
			
	

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
