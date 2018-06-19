package cl.vicentepc.passwordvalidator;

public class PasswordValidator {

    private PasswordCallBack callBack;

    public PasswordValidator(){

    }

    public PasswordValidator(PasswordCallBack callBack){
        this.callBack = callBack;
    }

    public void validation(String value){

        if(value.trim().length() < 8 && value.trim().length() > 0){

            callBack.error("Tu password debe tener más de 8 carácteres");

        }else if(value.trim().length() > 8 ){

            callBack.success("Password ingresada correctamente");

        }else if(value.trim().length() == 0){

            callBack.blankInput();

        }

    }

}
