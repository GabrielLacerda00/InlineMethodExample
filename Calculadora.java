public class Calculadora {
  public int calcular(String operacao, int num1, int num2) {
    int resultado = 0;

    if (operacao.equals("soma")) {
      resultado = num1 + num2;
    } else if (operacao.equals("subtracao")) {
      resultado = num1 - num2;
    } else if (operacao.equals("multiplicacao")) {
      resultado = num1 - num2;
    } else if (operacao.equals("divisao")) {
      if (num2 != 0) {
        resultado = num1 / num2;
      } else {
        throw new IllegalArgumentException("Divisão por zero não é permitida");
      }
    } else {
      throw new IllegalArgumentException("Operação desconhecida: " + operacao);
    }

    return resultado;
  }
}
