package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


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
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1998");
        $(".react-datepicker__month-select").selectOption("July");
        $("[aria-label=Choose Thursday, July 9th, 1998]").click();
        $("#subjectsContainer").click();
        $("#subjectsInput").setValue("his").pressEnter();
        $("label[for=hobbies-checkbox-2]").click();
        $("input#uploadPicture").uploadFile(new File("C:/Users/kristina.ushakova/Desktop/Hwnevkmpgw8.jpg"));
        $("#currentAddress").setValue("test").scrollTo();
        $("#state").click();
        $("#react-select-3-input").append("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").append("Delhi").pressEnter();
        $("#submit").click();


      //assert
      $(".modal-content").shouldBe(visible);
      $(".modal-title").shouldHave(text("Thanks for submitting the form"));
      $(".modal-body").shouldBe(text("Label"),text("Values"));
      $(".table-responsive").shouldBe(text("Kris Ushakova"),text("test@test.ru"),text("Female"),text("8962352658"),text("14 July 1998"),text("History"),text("Reading"),text("Hwnevkmpgw8.jpg"),text("test"),text("NCR Delhi"));










   }

}
