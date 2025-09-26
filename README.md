# Locadora-de-veiculos
Aqui está um guia simplificado para usar o aplicativo:

**O que você precisa**

* Java JDK 8 ou posterior instalado.
* Um terminal ou um Ambiente de Desenvolvimento Integrado (IDE) como Eclipse, IntelliJ ou NetBeans para compilar e executar o programa.

**Como executar o programa (usando a linha de comando)**

1. Coloque os quatro arquivos .java na mesma pasta.
2. Abra o terminal e navegue até a pasta.
3. Compile todos os arquivos usando este comando: `javac *.java`
4. Execute o aplicativo com: `java Principal`

O programa então apresentará um menu interativo. Você pode usar as opções de 1 a 6 para adicionar carros e clientes, alugar carros, devolver carros e visualizar listas.

**Observações importantes**

* Ao adicionar um carro, ele é automaticamente marcado como disponível.
* Ao alugar um carro, o sistema busca o primeiro carro disponível correspondente ao modelo informado (a busca não diferencia maiúsculas de minúsculas) e o marca como indisponível.
* Ao devolver um carro, o sistema busca um carro com o modelo especificado que esteja indisponível no momento e o marca como disponível.
* A função `listarCarrosDisponiveis()` exibe apenas os carros que estão disponíveis no momento.
