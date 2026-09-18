# 11-java-thread

---

```bash
git add . && git commit -m "Exemplo" && git push
```

---


```bash
javac *.java
```

---

```bash
java Coletor https://docs.oracle.com/javase/tutorial/essential/concurrency/threads.html https://docs.oracle.com/javase/tutorial/essential/concurrency/join.html https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html > saida.txt
```

---

## Exercícios

Altere o algoritmo desta prática de forma que:

1. Receba um número indeterminado de URLs a partir do teclado e as armazene em um vetor. 

2. Todas as URLs informadas devem ser distribuídas entre 5 threads para coleta da respectiva página HTML. 

3. Todas as palavras distintas das páginas coleadas devem ser armazenadas em um vetor com a respectiva frequência. 

4. A frequência de cada palavra corresponde à soma do número de vezes em que a palavra ocorre nas páginas coletadas.

5. Imprima o vetor de palavras distintas na tela, com as respectivas frequências.

6. Permita que o usuário escolha imprimir o vetor de palavras em ordem:

  - Alfabética das palavras.

7. Permita que o usuário escolha imprimir o vetor de palavras em ordem alfabética inversa das palavras.

8. Permita que o usuário escolha imprimir o vetor de palavras em ordem crescente da frequência das palavras. 

9. Permita que o usuário escolha imprimir o vetor de palavras em ordem decrescente da frequência das palavras. 