package Game;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class CommunicationTest {

	public static void main(String[] args) throws UnirestException {
		HttpRequest jsonResponse = Unirest.get("http://localhost:4567/dice");
		HttpResponse<JsonNode> node = jsonResponse.asJson();
		JsonNode jn = node.getBody();
				
				
		System.out.println(jn);

	}

}
