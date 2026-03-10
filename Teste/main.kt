fun main() {

    // ── Valores de entrada ──────────────────────────────
    val a  = 8.0
    val b  = 5.0
    val c  = 12.0
    val pa = 3.0  // peso de a
    val pb = 2.0  // peso de b
    val pc = 5.0  // peso de c

    // ── 1. MAIOR número usando if / else if ─────────────
    val maior: Double

    if (a >= b && a >= c) {
        maior = a
        println("O maior é A = $a")
    } else if (b >= a && b >= c) {
        maior = b
        println("O maior é B = $b")
    } else {
        maior = c
        println("O maior é C = $c")
    }

    // ── 2. MÉDIA SIMPLES ────────────────────────────────
    val media = (a + b + c) / 3.0
    println("Média simples: ${"%.2f".format(media)}")

    // Classifica a média com if
    if (media >= 9.0) {
        println("Conceito: A — Excelente")
    } else if (media >= 7.0) {
        println("Conceito: B — Bom")
    } else if (media >= 5.0) {
        println("Conceito: C — Regular")
    } else {
        println("Conceito: D — Insuficiente")
    }

    // ── 3. MÉDIA PONDERADA ──────────────────────────────
    val somaPesos = pa + pb + pc

    val mediaPonderada: Double

    if (somaPesos == 0.0) {
        println("ERRO: soma dos pesos não pode ser zero!")
        return
    } else {
        mediaPonderada = (a * pa + b * pb + c * pc) / somaPesos
        println("Média ponderada: ${"%.2f".format(mediaPonderada)}")
    }

    // ── 4. DIVISÃO com verificação de divisão por zero ──
    if (b == 0.0) {
        println("ERRO: não é possível dividir por zero!")
    } else if (a > b) {
        val divisao = a / b
        println("A ÷ B = ${"%.2f".format(divisao)} (A é maior)")
    } else if (a < b) {
        val divisao = a / b
        println("A ÷ B = ${"%.2f".format(divisao)} (resultado < 1)")
    } else {
        println("A ÷ B = 1.00 (são iguais)")
    }

    // ── 5. MULTIPLICAÇÃO com análise do resultado ───────
    val produto = a * b * c
    println("A × B × C = $produto")

    if (produto > 1000) {
        println("Produto muito alto (> 1000)")
    } else if (produto > 100) {
        println("Produto alto (100 a 1000)")
    } else if (produto > 0) {
        println("Produto baixo (0 a 100)")
    } else {
        println("Produto negativo ou zero")
    }
}