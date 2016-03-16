package co.com.ceiba.solid.without.singleresponsability;

public class UserService {
	private DatabaseLayer database;
	private SmtpClient smtpClient;

	public void register(String email, String password)
    {
         if (!email.contains("@")) {
             throw new ValidationException("Email is not an email!");
         }

        User user = new User(email, password);
        database.Save(user);

        smtpClient.Send(new MailMessage("mysite@nowhere.com", email, "HEllo fool!"));
    }
}
//**http://blog.gauffin.org/2011/07/18/single-responsibility-prinicple/**//