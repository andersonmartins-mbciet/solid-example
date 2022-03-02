package solid.dip.solucao;


public class PasswordReminder {

  private DBConnectionInterface dbConnection;

  public PasswordReminder(DBConnectionInterface connection) {
    this.dbConnection = connection;
  }
}
