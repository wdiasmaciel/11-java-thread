/*
 * Classe para executar coleta paralela.
 */
public class Coletor {
  public static void main(String args[]) {
    /*
     * O nome da classe (Coletor) não é incluído em args. 
     * No comando:
     *     java Coletor http://url1 http://url2
     * 
     * O conteúdo de args será:
     *     args[0] = "http://url1"
     *     args[1] = "http://url2"
     * 
     * Portanto, para aceitar uma URL ou mais, use:
     *     if (args.length < 1) { ... }
     */
    if (args.length != 2) {
      System.err.println("Sintaxe:");
      System.err.println("Sintaxe: java Coletor http://url1 http://url2 ... http://urln");
      System.exit(1);
    }

    Coletor[] coletores = new Coletor[args.length];
    try {
      for (int i = 0; i < args.length; i++) {
        System.out.println("Thread " + i + ": Coletando página [" + args[i] + "]");
        coletores[i] = new Coletor("Thread_" + i, args[i]);
        coletores[i].start();
      }

      for (int i = 0; i < args.length; i++) {
        System.out.println("Esperando finalização dasthreads...");
        coletores[i].join();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}