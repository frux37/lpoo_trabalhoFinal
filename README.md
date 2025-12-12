# Sistema de Gerenciamento de Finanças e investimentos

##  Descrição do Projeto
Sistema desktop desenvolvido em **Java** para gerenciamento de investimentos financeiros, permitindo o cadastro, edição, consulta e exclusão de diferentes tipos de investimentos, com análise de riscos e rentabilidade.

---

##  Funcionalidades

###  CRUD de Investimentos
- Cadastro de novos investimentos  
- Listagem de todos os investimentos ativos  
- Edição de investimentos existentes  
- Exclusão lógica (soft delete)

###  Análise de Investimentos
- Classificação por nível de risco (Baixo, Médio, Alto, Altíssimo)  
- Cálculo de rentabilidade anual e mensal  
- Organização por tipos de investimento  
- Informações sobre liquidez e taxas
---
##  Modelo de Dados

### Tabela: `investimentos`

| Campo                   | Tipo             | Descrição                       |
|------------------------|------------------|---------------------------------|
| inv_id                 | BIGINT (PK)      | Identificador único             |
| inv_nome               | VARCHAR(100)     | Nome do investimento            |
| inv_descricao          | VARCHAR(500)     | Descrição                       |
| inv_tipo               | ENUM             | Tipo do investimento            |
| inv_risco              | ENUM             | Nível de risco                  |
| inv_rentabilidade_anual| DECIMAL(5,2)     | Rentabilidade anual             |
| inv_liquidez           | VARCHAR(50)      | Tipo de liquidez                |
| inv_taxa_adm           | DECIMAL(5,2)     | Taxa de administração           |
| inv_data_criacao       | DATE             | Data de criação                 |
| inv_ativo              | BOOLEAN          | Soft delete                     |

---

##  Tecnologias Utilizadas

### Backend
- **Java 19**
- **Java Swing**
- **JPA/Hibernate**
- **PostgreSQL**
- **Maven**
---
#  Classes Principais

## **Investimento.java**
- Classe principal do modelo  
- Enums de tipo e risco  
- Anotações JPA  
- Métodos de cálculo de rentabilidade  
- Validações  

---

## **InvestimentoDAO.java**
### Métodos:
- `salvar()`  
- `listarTodos()`  
- `listarAtivos()`  
- `excluir()` (soft delete)  
- Consultas por critérios diversos  

---

## **ListaInvestimentoJF.java**
- Tela principal com tabela de investimentos  
- Botões de ação (Novo, Editar, Excluir)  
- Filtros e ordenações  
- Atualização automática  

---

## **CadastroInvestimentoJD.java**
- Formulário completo para cadastro/edição  
- Comboboxes para enums  
- Validação  
- Modo edição/cadastro  

---

#  Tipos de Investimentos Suportados
- Poupança  
- CDB  
- LCI  
- LCA  
- Tesouro Direto  
- Fundo Renda Fixa  
- Fundo de Ações  
- Ação  
- Fundo Imobiliário  
- Previdência Privada  
- Criptomoeda  

---

#  Níveis de Risco
- **Baixo** – conservadores  
- **Médio** – moderado  
- **Alto** – volátil  
- **Altíssimo** – especulativos  

---

#  Cálculos Automáticos
- Rentabilidade mensal com base na anual  
- Formatação de percentuais  
- Validações monetárias  

---

#  Caso de Uso — Definir e Alcançar Objetivo Financeiro

**Criar Plano de Vida e Estimar Tempo para Conclusão**

---

## Objetivo
Permitir que o usuário defina um plano de vida (ex: aposentadoria, comprar casa, carro, viagem) e calcular automaticamente **em quanto tempo** ele alcançará esse objetivo com base nos investimentos cadastrados.

---

##  Atores
- **Usuário** – Pessoa que utiliza o sistema para planejar e acompanhar metas financeiras.

---

##  Pré-condições
- O usuário deve estar cadastrado e autenticado no sistema.
- Deve existir pelo menos um **tipo de investimento** cadastrado.
- O usuário deve ter cadastrado **investimentos ativos** com rentabilidade definida.

---

##  Fluxo do Sistema

1. O usuário acessa o sistema.
2. O sistema exibe o menu principal.
3. O usuário seleciona **"Cadastrar Objetivo / Plano de Vida"**.
4. O sistema exibe um formulário solicitando:
   - Nome do objetivo  
   - Valor alvo (quantia necessária para realizar o plano)  
   - Prazo desejado
   - Categoria do objetivo (aposentadoria, casa, carro, viagem etc.)
5. O usuário confirma o cadastro do objetivo.
6. O sistema analisa todos os investimentos cadastrados pelo usuário:
   - Rentabilidade anual/mensal  
   - Valor total investido  
   - Liquidez  
   - Taxas associadas  
7. O sistema calcula automaticamente:
   - Crescimento mensal estimado dos investimentos
   - Previsão de acúmulo de capital ao longo do tempo
   - Tempo estimado para atingir o valor-alvo do objetivo
8. O sistema exibe ao usuário:
   - **Tempo estimado para conclusão do objetivo**
   - Gráfico ou tabela com projeção de crescimento
   - Sugestões de otimização (ex.: aumentar aporte, mudar tipo de investimento)
9. O usuário confirma o plano e o sistema salva o objetivo.

## **2. Editar Investimento**
- Selecionar item  
- Clicar **Editar**  
- Modificar  
- Salvar  

## **3. Excluir**
- Selecionar  
- Clicar **Excluir**  
- Confirmar  

#  Padrões de Projeto
- DAO  
- MVC  
- Singleton  
- Strategy  

---

#  Boas Práticas
- Tratamento de exceções  
- Validação frontend e backend  
- Camadas separadas  

---

#  Melhorias Futuras
- Relatórios PDF/Excel  
- Gráficos  
- Importação/Exportação  
- Backup automático  
- Autenticação  
- Dashboard  
- API REST  
- App Mobile  
---


# Licença

Projeto sob MIT License.


# Autor

Carlos Augusto Segala Aguirre – Desenvolvedor do Sistema de Gerenciamento de Investimentos