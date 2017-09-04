package brokenBank;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/productos")
public class ConsultaProductos {
	
	@Path("/consultarproductos")
	@POST
	@Produces("application/json")
	public Producto consultarProductos(){
		
		Producto p = new Producto();
		p.setInteres("6");
		p.setTipoTasa("NB");
		
		return p;
	}

}
