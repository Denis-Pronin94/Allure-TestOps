package test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


@Feature("Авторизация")
@Owner("admin1")
@Story("Авторизация через сторонние системы")
public class AuthTest {

    @Test
    @AllureId("10946")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("blocker"), @Tag("web")})
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'Mr. Random'", () -> {
            step("Вводим логин 'random-user'");
            step("Вводим пароль 'random-pass'");
            step("Нажимаем кнопку войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен заполнен из Google", () -> {
            step("Имя 'Mr. Random'");
            step("Login 'random-user'");
            step("Аватарка ");
        });
        step("Разлогиниваемся");
    }


}
