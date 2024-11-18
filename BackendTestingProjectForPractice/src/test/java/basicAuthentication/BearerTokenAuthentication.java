package basicAuthentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BearerTokenAuthentication {

	@Test
	public void sampleTest()
	{
		given()
		.auth().oauth2("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJsZUN3YUNPai00RXVlbzJkTFFrTmZuLXh2M0F3Nm5ZdWZtS0pINXBFWkNNIn0.eyJleHAiOjE3MjkxNjMyOTcsImlhdCI6MTcyOTE2MTUxNywianRpIjoiNGVlNDEyN2ItMWFhZS00ODJmLWE1ZmEtOTIyYjQyZGM5YzNjIiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiMDk0YWQ2NjYtNzlkYy00NjVhLWFhMTQtMzQzYWUwYTIxMTM0IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiMDk0YWQ2NjYtNzlkYy00NjVhLWFhMTQtMzQzYWUwYTIxMTM0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.YeANVOueZapvFMJX4rfC4iA5i_vduFKPzb3r96jI6ZOpaC-KIT1uHyj1VPVMvLwAe1ncoMiG0qrbDjW0818_RyaAVx65DVXaurNIgpkeTd_Y7qMSHhq4XCY2xgfSO4Q3_NrlhKyvfpTnFaG6HQ5rlxfF4GddcqcC1jUCLz6WUPHjdo-6Fg6Wxgwst19anEmJO9mNT6EkMRb-MNrTQiHAHrBZMx7a40HdT5tVi4pcdAus4xfC-F-Fr0eKKv_qKMWLAdBM2Fdt5CzFda4V20S558G4EL5keH4ybc0mZCNbz2JgopQ5thpgD3k8aUHXcIznAg6Jy90s9m-c5YcmqAVBxA")
		.log().all()
		.when()
		.get("http://49.249.28.218:8091/projects")
		.then()
		.log().all();
	
	}
}
