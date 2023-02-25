package services;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class AllBooksAPI {
    private Response res;
    public AllBooksAPI(){
        RestAssured.baseURI = "https://demoqa.com";
        RequestSpecification h = RestAssured.given();
        res = h.get("/BookStore/v1/Books");
    }
    public String [] responseParse() {
        JsonPath jsnPath = res.jsonPath();
        String[] books = jsnPath.getList("books.title").toArray(new String[0]);
        return books;
    }

    public int verifyBookList(){
        return res.getStatusCode();
    }
}
