//Exercício 1
//A função Desfazer (Ctrl+Z) é mais parecida com uma fila ou uma pilha?
//É uma pilha, porque o último comando que eu fiz é o primeiro que vai ser desfeito. Ou seja, ela segue a regra LIFO, o último a entrar é o primeiro a sair.

//Exercício 2
//Um laboratório precisa registrar exames na ordem de chegada e, no final do dia, imprimir na ordem inversa. Que estrutura deve usar? Deve ser com vetor (array) ou lista encadeada?
//Acho melhor usar uma pilha, porque os exames chegam em uma ordem, mas no final precisam ser impressos de trás pra frente. Se eu já souber o número máximo de exames, posso usar um array, mas se a quantidade variar muito, é melhor usar uma lista encadeada, já que ela cresce conforme precisa e não desperdiça espaço.

//Exercício 3
//Exercício 3
//Um sistema recebe tarefas numa fila, mas as mais urgentes vão pra uma pilha de prioridade. Qual é a ordem final de execução?
//Primeiro o sistema faz as tarefas da pilha de prioridades, porque são as mais urgentes e seguem a regra LIFO. Quando a pilha estiver vazia, ele volta pra fila normal e faz as tarefas na ordem que chegaram, seguindo a regra FIFO. Então, primeiro vão as urgentes (pilha) e depois as normais (fila).
