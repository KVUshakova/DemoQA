package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
       Configuration.browserSize = "1920x1080";
        }
   @Test
     void success() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Kris");
        $("#lastName").setValue("Ushakova");
        $("#userEmail").setValue("test@test.ru");
        $("label[for=gender-radio-2]").click();
        $("#userNumber").setValue("89623526589");
        $("#dateOfBirthInput").setValue("30 July 1998");
        $("#subjectsContainer").click();
        $("#subjectsInput").setValue("his").pressEnter();
        $("label[for=hobbies-checkbox-2]").click();
        $("input#uploadPicture").uploadFile(new File("C:/Users/kristina.ushakova/Desktop/Hwnevkmpgw8.jpg"));
        $("#currentAddress").setValue("test").scrollTo();
        $("#state").click();
        $("#state");
        //sleep (5000);
       //$("#city").click();




   }

}
