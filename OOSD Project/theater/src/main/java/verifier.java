public class verifier 
{
    LoginWrongInfoException loginWrongInfoException = new LoginWrongInfoException();
    public boolean verify(String username, String password)
    {
        if(username.equals("admin") && password.equals("admin"))
        {
            return true;
        }
        else
        {
            try
            {
                throw loginWrongInfoException;
            }
            catch(LoginWrongInfoException e)
            {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }
}
