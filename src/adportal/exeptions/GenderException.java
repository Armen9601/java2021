package adportal.exeptions;

public class GenderException extends RuntimeException {


    @Override
    public String getMessage() {
        return "PLease input male or female";

    }
}
