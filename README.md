
Aplicação de criação de eventos e inscrição de usuários para o evento desenvolvida utilizando o framework Spring-boot;
Banco de dados utilizando: H2;
Java version: 11;

🚀 Funcionalidades disponiveis:

[✔] Criação de um usuário
[✔] Criação de um evento
[✔] Busca de Usuários por id
[✔] Busca de Eventos por id
[✔] Listagem de eventos
[✔] Exclusão de um usuário
[✔] Exclusão de um evento
[✔] Listagem de usuários
[✔] Remoção de Usuários de um evento por id;

--------------------------------------------------------------------

🛠 SERVIÇOS DISPONÍVEIS PARA O EVENTO: 

PARA A CRIAÇÃO DE UM EVENTO: http://localhost:8080/eventos/criarEvento 

* PARA EXECUTAR A BUSCA UTILIZANDO O ID DO EVENTO: http://localhost:8080/eventos/buscar_por_id/{idEvento};

PARA LISTAR TODOS OS EVENTOS: http://localhost:8080/eventos/todos_os_eventos

* PARA DELETAR UM EVENTO CRIADO: http://localhost:8080/eventos/delete_evento/{idEvento}

** Substitua as chaves pelo id. 

----------------------------------------------------------------------

🛠 SERVIÇOS DISPONÍVEIS PARA O USUÁRIO.

PARA CRIAR USUÁRIO: http://localhost:8080/usuarios/criarUsuario 

PARA EXECUTAR UMA BUSCA UTILIZANDO O ID DO USUÁRIO: http://localhost:8080/usuarios/buscar_por_id/{idUsuario}

PARA LISTAR TODOS OS USUÁRIOS: http://localhost:8080/usuarios/todos_os_usuarios

PARA DELETAR UM USUÁRIO CRIADO: http://localhost:8080/usuarios/delete_usuario/{IdUsuario}

* PARA ADICIONAR O USUÁRIO NO EVENTO: http://localhost:8080/usuarios/http://localhost:8080/eventos/adicionar_evento?idUsuario={idUsuario}&idEvento={idEvento}

* PARA REMOVER O USUÁRIO DE UM EVENTO: http://localhost:8080/usuarios/http://localhost:8080/eventos/remover_evento?idUsuario={idUsuario}&idEvento={idEvento}

* Substitua o valor das chaves.