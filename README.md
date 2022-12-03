# envioEmailSpringBoot
Nesta API irei criar um sistema de envio de email automático com Spring boot


OLá Meu nome é fernando Corrêa criei esse projeto de envio de resposta automática por email
Sou programador da linguagem java caso queria me contratar este é o meu ZAP(19)992222239

utilizei um email que tenho no gmail para fazer o envio 
a senha que utilzei foi criada uma senha de app para enviar via codigo.
 para criar a senha você terá que ie na sua conta ter ja habilitado o modo dois fatores, e logo abaixo vai ter a opção de criar um app senha.
 
 selecione email e windows.
 
 para testar no postman  selecionei o metodo POST->  Body -> Json
 e coloquei as seguintes informações.
 
{
"assunto" : "Testando envio de email",
"mensagem" : "Tudo deu certo!!!",
"remetente" : "fersolagigitheo@gmail.com",
"destinatario" : [
"nome_de_um_email@gmail.com",
"nome_de_um_email@gmail.com",
"nome_de_um_email@gmail.com"
]

}
