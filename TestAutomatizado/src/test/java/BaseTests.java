import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public  abstract class BaseTests {
    private static final Logger logger = LogManager.getLogger(ReqResTests.class);

    @BeforeAll
    public static void setup(){
        logger.info("Iniciando la configuracion");
        RestAssured.baseURI= "http://localhost:8080/topazinterpretedws";
        //new RequestSpecBuilder().addFilter(filters);

        logger.info("Configuracion exitosa");
      //  RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        List<Filter> filters = new ArrayList<>();
        filters.add(new RequestLoggingFilter());
        filters.add(new ResponseLoggingFilter());
        filters.add(new AllureRestAssured());
       // new RequestSpecBuilder().addFilter(filters);

    }
}
