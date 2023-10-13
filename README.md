# Desafio de Controle de Fluxo em Java

Este é um projeto Java que aborda o controle de fluxo, utilizando um simples programa que recebe dois parâmetros e, em seguida, realiza a contagem e impressão de números. Além disso, o código lida com exceções personalizadas.

## Funcionamento

1. O programa recebe dois números inteiros como entrada do usuário no console.
2. Ele verifica se o primeiro número é menor ou igual ao segundo número.
3. Se o primeiro número for maior que o segundo, ele lança uma exceção personalizada `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
4. Caso contrário, o programa realiza uma contagem a partir do primeiro número até o segundo número, imprimindo cada número no console.

## Instruções de Uso

Certifique-se de que você tem o Java instalado no seu sistema. Para executar o programa:

__1. Clone este repositório:__

```
git clone [url](https://github.com/anajvn/controle-fluxo.git)
```

__2. Navegue até o diretório do projeto:__
```
cd controle-fluxo
```

__3. Compile o código-fonte:__
```
javac Contador.java ParametrosInvalidosException.java
```

__4. Execute o programa:__

```
java Contador
```

__5. Siga as instruções no console para inserir os dois parâmetros.__

## Estrutura do Projeto

- `Contador.java`: O arquivo principal que contém a lógica do programa.
- `ParametrosInvalidosException.java`: A classe que define a exceção personalizada `ParametrosInvalidosException`.

## Exemplo de Execução

~~~ 
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 19
Imprimindo o número 20
~~~

## Notas Adicionais

Certifique-se de criar a classe `ParametrosInvalidosException` conforme descrito no desafio antes de compilar e executar o programa.

Esse código é um exemplo simples de controle de fluxo em Java e manipulação de exceções personalizadas.
