package solid.dip;


import solid.dip.solucao.MySqlConnection;

public class PasswordReminder {

  private MySqlConnection dbConnection;

  public PasswordReminder() {
    this.dbConnection = new MySqlConnection();
  }
}
