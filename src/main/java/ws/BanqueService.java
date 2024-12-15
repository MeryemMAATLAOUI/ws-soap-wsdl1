package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ws.Compte;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "CoversionEuroToDh")
    public double conversion(@WebParam(name = "Montant")double mt){
        return mt*11;
    }
    @WebMethod
    public ws.Compte getCompte(@WebParam(name="code")int code){
        return new ws.Compte(code, 1000+Math.random()*9000, new Date());
    }
    @WebMethod
    public List<Compte> ListComptes(){
        return List.of(
                new Compte(1, 1000+Math.random()*9000, new Date()),
                new Compte(2, 1000+Math.random()*9000, new Date()),
                new Compte(3, 1000+Math.random()*9000, new Date())
        );
    }

}
