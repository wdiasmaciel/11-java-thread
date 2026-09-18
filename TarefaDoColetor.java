import java.io.*;
import java.net.*;

/*
 * Classe para comunicação HTTP.
 */
public class TarefaDoColetor extends Thread {
  private String nome;
  private String stringDaUrl;

  public TarefaDoColetor(String nome, String urlInformadaPeloUsuario) {
    this.nome = nome;
    this.stringDaUrl = urlInformadaPeloUsuario;
  }

  public void run() {
    try {
      URL url = URI.create(stringDaUrl).toURL();
      URLConnection urlConnection = url.openConnection();
      InputStreamReader reader = new InputStreamReader(urlConnection.getInputStream());
      BufferedReader inputBuffer = new BufferedReader(reader);

      String linha;
      StringBuffer texto = new StringBuffer();

      while ((linha = inputBuffer.readLine()) != null)
        texto.append(linha);

      imprimeTexto(texto.toString());
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public synchronized void imprimeTexto(String texto) {
    String[] conjuntoDeTermos = texto.replaceAll("<.*?>", "").toLowerCase().split(" ");
    
    System.out.println("---[" + nome + "]---");
    System.out.println("Termos da página [" + stringDaUrl + "]:");
    for (int i = 0; i < conjuntoDeTermos.length; i++)
      if ((conjuntoDeTermos[i].equals(" ") == false) && (conjuntoDeTermos[i].equals("") == false))
        System.out.println(conjuntoDeTermos[i]);
  }
}