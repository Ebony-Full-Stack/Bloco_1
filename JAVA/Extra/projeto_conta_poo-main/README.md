# Projeto Conta Bancária - POO (Em desenvolvimento)

<br />

<div align="center">
   <img src="https://i.imgur.com/IaD4lwg.png" title="source: imgur.com" width="25%"/>
</div>

<br /><br />

## Diagrama de Classes

```mermaid
classDiagram
class Conta {
  - numero : int
  - agencia : String
  - tipo : String
  - titular : String
  - saldo : float
  + int getNumero()
  + String getAgencia()
  + String getTipo()
  + String getTitular()
  + float getSaldo()
  + void setNumero(int numero)
  + void setAgencia(String agencia)
  + void setTipo(String tipo)
  + void setTitular(String titular)
  + void setSaldo(float saldo)
  + boolean saque(float valor)
  + void visualiza()
}
class ContaCorrente {
  - limite : float
  + float getLimite()
  + void setLimite(float limite)
  + boolean deposito(float valor)
  + boolean saque(float valor)
  + boolean transferencia(float valor, ContaCorrente contaDestino)
  + void visualiza()
}
class ContaInss {
  - beneficio : String
  + String getBeneficio()
  + void setBeneficio(String beneficio)
  + void visualiza()
}
ContaCorrente --> Conta
ContaInss --> Conta
```

<br /><br />

## Print da Tela

<div align="center">
   <img src="https://i.imgur.com/x7e1sBp.png" title="source: imgur.com" />
</div>
