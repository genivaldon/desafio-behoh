# Desafio Java Web

A BeHOH trabalha com sistemas de gestão de eventos e nada melhor que um desafio relacionado ao nosso produto. Elaboramos um teste bem simples em que você deverá desenvolver o software especificado abaixo. Se houver dúvidas sobre os requisitos, envie um e-mail para talentos@behoh.com 

**Instruções gerais:**
* Você terá **4 (quatro) dias** contados a partir da data de envio do e-mail desta convocação para cumprir o desafio.
* Ainda que não sejam resolvidos todos os requisitos até o vencimento do prazo, você poderá nos enviar o teste com os itens que tiver finalizado.
* O código deverá ser colocado no Gitlab ou Github e você deverá enviar o link do repositório para talentos@behoh.com onde o título do e-mail deverá ser: **[Teste Java Web] Seu nome completo**.
* Na raiz do projeto deverá conter um arquivo chamado **README.md** com instruções para que possamos executa-lo em nosso computador.

**O Desafio:**
*  Desenvolver uma API Rest que realize operações básicas com as entidades abaixo:

> **Evento** 

| Atributo | Tipo |
| ------ | ------ |
| Id | Numérico |
| Nome | Texto |
| Vagas | Numérico |
| Data e hora de início | Data |
| Data e hora de fim | Data |

> **Usuário** 

| Atributo | Tipo |
| ------ | ------ |
| Id | Numérico |
| Nome | Texto |

**Operações básicas que deverão ser criadas:**
* Realizar a criação de um evento;
* Realizar a criação de um usuário;
* Realizar a operação de inscrição de um usuário em um evento;
* Realizar o cancelamento de uma inscrição de um usuário em um evento;
* Listar as inscrições de um usuário;
* Listar os inscritos de um evento;
* Realizar entrada do usuário no evento. 

**Regras gerais:**
* Não será permitida a inscrição de usuários quando o limite de vagas for atingido;
* Não será permitida a inscrição de usuários após o evento ter sido iniciado;
* O usuário só poderá entrar no evento no período de uma hora antes do início do evento até a hora de término do evento;
* Não será permitido o cancelamento de uma inscrição após o usuário ter realizado a entrada no evento.

**Diferenciais:**
* Elaborar testes;
* Implementar operação de criação de reservas e conversão de reservas em inscrições.

**Pré-requisitos:**
* Obrigatório a utilização de VRaptor ou Spring Boot como framework;
* Obrigatório a utilização de SQL Server, MySQL ou H2 como Banco de Dados;
* Obrigatório a utilização de Java 8 ou superior.
