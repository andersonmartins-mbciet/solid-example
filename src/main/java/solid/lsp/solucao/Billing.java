package solid.lsp.solucao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Billing {

  private final License license;

  public void execute() {
    var fee = license.calcFee();
    // TODO: calcular cobrança
  }

}
