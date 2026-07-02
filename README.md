# Lab 05 — Sistema Integrado de Gestão (Padrão Facade)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Implementação do padrão de projeto **Facade (Fachada)**: a classe `SIGFacade` oferece uma interface única e simplificada para um Sistema Integrado de Gestão escolar, escondendo a complexidade dos seis subsistemas internos.

```
Cliente ──> SIGFacade ──┬──> SubsysAdministrative  (reuniões, entrevistas)
                        ├──> SubsysFinancial       (balanço, folha de pagamento)
                        ├──> SubsysTeachers        (alocação, tempo de casa)
                        ├──> SubsysStudents        (histórico, RDM)
                        ├──> SubsysWarehouse       (estoque, pedidos de compra)
                        └──> SubsysInfrastructure  (alocação de salas)
```

O cliente (`Main`) interage apenas com a fachada, sem conhecer os subsistemas.

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`.

## Testes

```bash
mvn test
```

Os testes cobrem todas as operações expostas pela fachada.
