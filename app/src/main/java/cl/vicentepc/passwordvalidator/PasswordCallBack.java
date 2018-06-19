package cl.vicentepc.passwordvalidator;

public interface PasswordCallBack {

    void blankInput();

    void success(String value);

    void error(String value);

}
