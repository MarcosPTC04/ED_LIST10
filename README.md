## 📌 Descrição

Este repositório apresenta a implementação inicial de um TAD de Lista Dinâmica Encadeada Genérica em Java. O objetivo é praticar conceitos fundamentais de estruturas de dados dinâmicas, como criação de nós encadeados, manipulação de referências e organização da arquitetura do projeto utilizando interfaces e classes genéricas.

O projeto demonstra como os elementos são conectados dinamicamente na memória através de nós (`Node`) e como as operações fundamentais da lista são estruturadas para futuras implementações.

🛠 Recursos Utilizados

Linguagem: Java  
IDE: IntelliJ IDEA  
Controle de versão: Git  
Plataforma de hospedagem: GitHub  

---

## 📋 Estrutura do Código

🔹 Interface MyList<T>

Define as operações da lista, como:

Inserção (início, final ou posição específica)  
Remoção (início, final ou posição)  
Busca e consulta  
Gerenciamento da estrutura da lista  

🔹 Classe MyLinkedList<T>

Responsável por implementar a estrutura da lista dinâmica encadeada, contendo:

Referência para o primeiro nó (`head`)  
Referência para o último nó (`tail`)  
Controle de tamanho da lista (`size`)  
Declaração de todas as operações da interface  

🔹 Classe Interna Node<T>

Responsável pela representação dos nós da lista, contendo:

Valor armazenado  
Referência para o próximo nó  
Métodos getters e setters  

🔹 Classe MyLinkedListTests

Responsável por realizar os testes iniciais da estrutura e validar a criação da lista encadeada.

---

## ⚙️ Observações sobre a implementação

Estrutura baseada em nós encadeados  
Uso de referências entre elementos  
Implementação genérica utilizando `<T>`  
Organização em pacotes padronizados em inglês  
Separação entre interface, estrutura e testes  

---

▶️ Logs de Execução

Linked List created successfully  
Current size: 0  

---

## 👨‍💻 Autor

Marcos Antonio  
Curso: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS  
Disciplina: Estrutura de Dados I
