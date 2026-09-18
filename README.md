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

1. Altere o algoritmo desta prática de forma que:

a) Receba um número indeterminado de URLs a partir do teclado e as armazene em um vetor. 

b) Todas as URLs informadas devem ser distribuídas entre 5 threads para coleta da respectiva página HTML. 

c) Todas as palavras distintas das páginas coleadas devem ser armazenadas em um vetor com a respectiva frequência. 

d) A frequência de cada palavra corresponde à soma do número de vezes em que a palavra ocorre nas páginas coletadas.

e) Imprima o vetor de palavras distintas na tela, com as respectivas frequências.

f) Permita que o usuário escolha imprimir o vetor de palavras em ordem alfabética das palavras.

g) Permita que o usuário escolha imprimir o vetor de palavras em ordem alfabética inversa das palavras.

h) Permita que o usuário escolha imprimir o vetor de palavras em ordem crescente da frequência das palavras. 

i) Permita que o usuário escolha imprimir o vetor de palavras em ordem decrescente da frequência das palavras. 