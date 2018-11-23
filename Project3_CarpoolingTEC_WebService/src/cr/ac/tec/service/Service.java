package cr.ac.tec.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@ApplicationPath("users")
@Path("test")
public class Service extends Application {

	public static String listToSortString;
	
	@POST
	@Path("postString")
	@Consumes("text/plain")
	public void postList(String strList) {
		listToSortString = strList;
		System.out.println("-------------------------------------------------------------");
		System.out.println(listToSortString);
//		System.out.println("Funcionó"); 
	}
	
	@GET
	@Path("getString") //sort = 2
//	@Produces("application/xml")
	public String getQuickSort(){
		return listToSortString;
	}
	
}