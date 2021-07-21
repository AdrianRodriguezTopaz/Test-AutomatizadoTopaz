import com.fasterxml.jackson.databind.ser.Serializers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;


public class ReqResTests extends BaseTests {


    @Test
    public void mandarParametros(){
        pruebaGet(   1000322, "CONTA_CORRENTE_PF", 800,"Credito de prueba4", "algo3", "algo3");
        }


    LocalDateTime dateNow = LocalDateTime.now();
    String fechaNow = dateNow.toString();

    public void pruebaGet(int numeroConta, String tipoConta, int valor, String concepto, String referencia, String comprobante){
        RequestPrueba requestPOJO = new RequestPrueba();
        requestPOJO.setNumeroConta(numeroConta);
        requestPOJO.setTipoConta(tipoConta);
        requestPOJO.setValor(valor);
        requestPOJO.setConcepto(concepto);
        requestPOJO.setReferencia(referencia);
        requestPOJO.setComprobante(comprobante);


      String response =  RestAssured.given()
              .header("Topaz-Channel", "MOBILE")
              .header("Topaz-Transaction-ID", fechaNow)
              .header("Topaz-User", "TOP")
              .header("Topaz-Company", 358)
              .header("Topaz-Branch", 1001)
              .header("Content-Type", "application/json;charset=UTF-8")
              .header("Authorization", "Bearer 45684184")
              .header("Topaz-Transaction-IDStep", 57)
              .header("Topaz-Ip-Address", "127.0.0.0")
              .header("Topaz-Mac-Address", "00-14-22-01-23-45")

                .contentType(ContentType.JSON)
                .body(requestPOJO)

                .get( "ContasService/v1/PruebaWebServices")
                .then()
                .log().all()
              .extract().asString();

        System.out.println(response);

    }

}
