package solid.lsp.solucao;

public class Test {

  public static void main(String[] args) {
    License license = new PersonalLicense();
    Billing billing = new Billing(license);
    billing.execute();
  }

}
