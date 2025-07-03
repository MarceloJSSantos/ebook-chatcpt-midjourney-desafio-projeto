# Produto API

## 📝 Descrição Geral

A **Produto API** é uma aplicação RESTful desenvolvida em Node.js para gerenciar produtos de forma eficiente e segura. Permite operações de cadastro, consulta, atualização e remoção de produtos, seguindo boas práticas de design de APIs.

## 🎯 Objetivos

- Facilitar o gerenciamento de produtos.
- Oferecer endpoints claros e seguros.
- Garantir validação de dados e respostas padronizadas.

## ⚙️ Funcionalidades

- Cadastro de novos produtos.
- Consulta de produtos (individual e lista).
- Atualização de informações de produtos.
- Remoção de produtos.

## 🛠️ Tecnologias Utilizadas

- Node.js
- Express.js
- MongoDB (ou outro banco de dados, conforme implementação)
- Joi (ou biblioteca similar para validação)

## 🐳 Instruções de Instalação com Docker

1. Certifique-se de ter o [Docker](https://www.docker.com/get-started) instalado em sua máquina.

2. Clone o repositório do projeto:
    ```bash
    git clone https://github.com/MarceloJSSantos/bootcamp-tonnie-java-and-europe-escrevendo-prompts-eficazes
    cd produto-api-copilot
    ```

3. Construa e inicie os containers usando Docker Compose:
    ```bash
    docker-compose up --build
    ```

4. A API estará disponível em `http://localhost:3000` (ou porta configurada no `docker-compose.yml`).

5. Para parar os containers:
    ```bash
    docker-compose down
    ```

> Consulte os arquivos `Dockerfile` e `docker-compose.yml` para detalhes de configuração.

## 🔗 Endpoints

### 1. Listar Produtos

**GET** `/produtos`

**Exemplo de Requisição:**
```http
GET /produtos
```

**Resposta:**
```json
[
    {
        "id": "1",
        "nome": "Produto A",
        "preco": 100.0,
        "descricao": "Descrição do Produto A"
    }
]
```

---

### 2. Obter Produto por ID

**GET** `/produtos/{id}`

**Exemplo de Requisição:**
```http
GET /produtos/1
```

**Resposta:**
```json
{
    "id": "1",
    "nome": "Produto A",
    "preco": 100.0,
    "descricao": "Descrição do Produto A"
}
```

---

### 3. Criar Produto

**POST** `/produtos`

**Exemplo de Requisição:**
```json
{
    "nome": "Produto B",
    "preco": 150.0,
    "descricao": "Descrição do Produto B"
}
```

**Resposta:**
```json
{
    "id": "2",
    "nome": "Produto B",
    "preco": 150.0,
    "descricao": "Descrição do Produto B"
}
```

**Validações:**
- `nome`: obrigatório, string, mínimo 3 caracteres.
- `preco`: obrigatório, número, maior que zero.
- `descricao`: opcional, string.

---

### 4. Atualizar Produto

**PUT** `/produtos/{id}`

**Exemplo de Requisição:**
```json
{
    "nome": "Produto B Atualizado",
    "preco": 180.0,
    "descricao": "Nova descrição"
}
```

**Resposta:**
```json
{
    "id": "2",
    "nome": "Produto B Atualizado",
    "preco": 180.0,
    "descricao": "Nova descrição"
}
```

**Validações:** iguais ao endpoint de criação.

---

### 5. Remover Produto

**DELETE** `/produtos/{id}`

**Exemplo de Requisição:**
```http
DELETE /produtos/2
```

**Resposta:**
```json
{
    "mensagem": "Produto removido com sucesso."
}
```

---

## ✅ Validações Gerais

- Todos os campos obrigatórios devem ser informados.
- Retorno de erros claros em caso de validação ou recurso não encontrado.
- Utilização de códigos HTTP adequados (200, 201, 400, 404, 500).

---

## ⚠️ Exemplo de Resposta de Erro

```json
{
    "erro": "Nome do produto é obrigatório."
}
```

---

## 💡 Observações

- Autenticação e autorização podem ser adicionadas conforme necessidade.
- Para mais detalhes, consulte o código-fonte e os testes automatizados.


## Objetivos

- Facilitar o gerenciamento de produtos.
- Oferecer endpoints claros e seguros.
- Garantir validação de dados e respostas padronizadas.

## Funcionalidades

- Cadastro de novos produtos.
- Consulta de produtos (individual e lista).
- Atualização de informações de produtos.
- Remoção de produtos.

## Tecnologias Utilizadas

- Node.js
- Express.js
- MongoDB (ou outro banco de dados, conforme implementação)
- Joi (ou biblioteca similar para validação)

## Instruções de Instalação com Docker

1. Certifique-se de ter o [Docker](https://www.docker.com/get-started) instalado em sua máquina.

2. Clone o repositório do projeto:
    ```bash
    git clone https://github.com/seu-usuario/produto-api-copilot.git
    cd produto-api-copilot
    ```

3. Construa e inicie os containers usando Docker Compose:
    ```bash
    docker-compose up --build
    ```

4. A API estará disponível em `http://localhost:3000` (ou porta configurada no `docker-compose.yml`).

5. Para parar os containers:
    ```bash
    docker-compose down
    ```

> Consulte os arquivos `Dockerfile` e `docker-compose.yml` para detalhes de configuração.

## Endpoints

### 1. Listar Produtos

**GET** `/produtos`

**Exemplo de Requisição:**
```http
GET /produtos
```

**Resposta:**
```json
[
    {
        "id": "1",
        "nome": "Produto A",
        "preco": 100.0,
        "descricao": "Descrição do Produto A"
    }
]
```

---

### 2. Obter Produto por ID

**GET** `/produtos/{id}`

**Exemplo de Requisição:**
```http
GET /produtos/1
```

**Resposta:**
```json
{
    "id": "1",
    "nome": "Produto A",
    "preco": 100.0,
    "descricao": "Descrição do Produto A"
}
```

---

### 3. Criar Produto

**POST** `/produtos`

**Exemplo de Requisição:**
```json
{
    "nome": "Produto B",
    "preco": 150.0,
    "descricao": "Descrição do Produto B"
}
```

**Resposta:**
```json
{
    "id": "2",
    "nome": "Produto B",
    "preco": 150.0,
    "descricao": "Descrição do Produto B"
}
```

**Validações:**
- `nome`: obrigatório, string, mínimo 3 caracteres.
- `preco`: obrigatório, número, maior que zero.
- `descricao`: opcional, string.

---

### 4. Atualizar Produto

**PUT** `/produtos/{id}`

**Exemplo de Requisição:**
```json
{
    "nome": "Produto B Atualizado",
    "preco": 180.0,
    "descricao": "Nova descrição"
}
```

**Resposta:**
```json
{
    "id": "2",
    "nome": "Produto B Atualizado",
    "preco": 180.0,
    "descricao": "Nova descrição"
}
```

**Validações:** iguais ao endpoint de criação.

---

### 5. Remover Produto

**DELETE** `/produtos/{id}`

**Exemplo de Requisição:**
```http
DELETE /produtos/2
```

**Resposta:**
```json
{
    "mensagem": "Produto removido com sucesso."
}
```

---

## Validações Gerais

- Todos os campos obrigatórios devem ser informados.
- Retorno de erros claros em caso de validação ou recurso não encontrado.
- Utilização de códigos HTTP adequados (200, 201, 400, 404, 500).

---

## Exemplo de Resposta de Erro

```json
{
    "erro": "Nome do produto é obrigatório."
}
```

---

## Observações

- Autenticação e autorização podem ser adicionadas conforme necessidade.
- Para mais detalhes, consulte o código-fonte e os testes automatizados.
