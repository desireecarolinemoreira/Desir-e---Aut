#language: pt
#endcoding: UTF-8
  @UI
Funcionalidade: Trello UI
  @UI
  Esquema do Cenario: Criado, comentado e deletado um card
     Dado que esteja logado no trello
     E acesse o board
     Quando crio um card com o nome "<card Name>"
     E comento "<comment>"
     Então o card deve estar na lista
    Quando excluo o card
    Entao o card nao existe mais

 Exemplos:
    |car Name | Comment  |
    |Desiree Card | Comentario Desiree Card |
    |Desiree Card 2 | Coments 2 |



