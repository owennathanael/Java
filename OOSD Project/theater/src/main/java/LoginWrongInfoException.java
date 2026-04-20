public class LoginWrongInfoException extends Exception
{
    public LoginWrongInfoException()
    {
        super("Wrong username or password");
    }
    public LoginWrongInfoException(String message)
    {
        super(message);
    }
}