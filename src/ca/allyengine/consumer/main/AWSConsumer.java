package ca.allyengine.consumer.main;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class AWSConsumer {
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(
				"https://lhq9qwci84.execute-api.us-west-2.amazonaws.com/prod/allyenginewrapper2?graphfile=graph.meerkat&method=authority"
				);
		
		// Get the response from web service
		System.out.println(
				target.request(MediaType.APPLICATION_JSON).get(String.class)
				);
	}

}

