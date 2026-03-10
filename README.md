# Curso Prático de Kotlin (com exemplos e testes)

Ele contém **5 módulos progressivos**, cada um com exemplos comentados e saídas esperadas:

| Módulo | Conteúdo |
|---|---|
| 01 · Básico | `val/var`, tipos, nullable (`?`, `?:`, `!!`), `if` como expressão, `when`, loops |
| 02 · Funções | Funções simples e de expressão, defaults, extension functions, lambdas, `filter`/`map` |
| 03 · Classes | `class`, `data class`, `sealed class`, herança, estados de UI |
| 04 · Coleções | `List`, `Set`, `Map`, pipelines funcionais encadeados, `groupBy`, estatísticas |
| 05 · Avançado | Scope functions (`apply`, `let`, `also`), Coroutines, `async/await`, `Flow`, Generics |

Cada exemplo tem um botão **Copiar** para você testar no [play.kotlinlang.org](https://play.kotlinlang.org/) ou em sua IDE.

## Operações cobertas (com `if / else if / else`)

O programa cobre todas as operações pedidas, cada uma usando `if / else if / else`.

### O que o código faz

| Operação | Lógica com IF |
|---|---|
| Maior número | Compara A, B e C com `if (a >= b && a >= c)` |
| Média simples | Classifica o resultado em A/B/C/D com `else if` encadeado |
| Média ponderada | Verifica se a soma dos pesos `== 0` antes de dividir |
| Divisão | Protege contra divisão por zero com `if (b == 0.0)` |
| Multiplicação | Classifica o produto em faixas (`>1000`, `>100`, `>0`, etc.) |

Você pode inserir qualquer número nos campos e clicar em **▶ CALCULAR TUDO** para ver os resultados ao vivo.

O código Kotlin embaixo também atualiza com os valores digitados para você copiar e testar no [play.kotlinlang.org](https://play.kotlinlang.org/).

## Contato

- Luis Cruz: luis.cruz@estudante.iftm.edu.br
