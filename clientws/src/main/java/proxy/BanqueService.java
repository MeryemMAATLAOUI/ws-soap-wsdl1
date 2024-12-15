
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod(operationName = "ListComptes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListComptes", targetNamespace = "http://ws/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "ListComptesResponse", targetNamespace = "http://ws/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws/BanqueService/ListComptesRequest", output = "http://ws/BanqueService/ListComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "CoversionEuroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CoversionEuroToDh", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDh")
    @ResponseWrapper(localName = "CoversionEuroToDhResponse", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDhResponse")
    @Action(input = "http://ws/BanqueService/CoversionEuroToDhRequest", output = "http://ws/BanqueService/CoversionEuroToDhResponse")
    public double coversionEuroToDh(
        @WebParam(name = "Montant", targetNamespace = "")
        double montant);

}
