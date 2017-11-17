public class User {
    String login;
    String pas;
    int id;

    public User(String login, String pas, int id) { // Добавляем в конструктор параметры типа String и int
                                                    // Разобраться что такое конструктор и this
        this.login = login; // Используем значение аргумента для инициализации переменных login, pas, id
        this.pas = pas;     // this означает что мы хотим использовать переменную id в этом классе
        this.id = id;
