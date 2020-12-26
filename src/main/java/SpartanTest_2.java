//import io.restassured.RestAssured; // bunu static yapinca her defasinda RestAssured.get yazmamiza gerek kalmaz.
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SpartanTest_2 {   //web sayfasinin authentication gerektiren sekilde kullanmadigimiz icin onunla ilgili islem yapmamiza gerek yok.

    @Test
    public void spartan1(){
      //  Response response = RestAssured.get("http://52.90.77.165:8000/api/spartans");  // 8000 port --> number
                                                                                            // api/spartans --> path
        //import static io.restassured.RestAssured.*; bunu static import yaptigimiz icin her defasinda RestAssured.get yazmamiza gerek kalmaz.
        Response response =get("http://52.90.77.165:8000/api/spartans");

        Response response1 = get("http://52.90.77.165:8000/api/spartans/10");

        System.out.println(response.asString()); // response bir obje oldugu icin  print olmaz onun icin toString yazmaliyiz.
     // [{"id":1,"name":"B2011","gender":"Male","phone":9237326768},{"id":2,"name":"Nels","gender":....,
        System.out.println(response.prettyPrint());
        /*
        [
    {
        "id": 1,
        "name": "B2011",
        "gender": "Male",
        "phone": 9237326768
    }, ...... sonra ayni formatta digerlerini de print eder
         */
        System.out.println(response1.prettyPrint());
    }

    @Test
    public void spartanGetOne(){
        Response response = get("http://52.90.77.165:8000/api/spartans/10");
        response.prettyPrint(); // System.out olmadan print edebilir
        /*
        { // sadece bunu print eder
    "id": 10,
    "name": "Lorenza",
    "gender": "Female",
    "phone": 3312820936
}
         */
    }
}
