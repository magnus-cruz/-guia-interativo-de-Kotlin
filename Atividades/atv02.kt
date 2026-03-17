fun calcularPesoIdeal(altura: Double, sexo: Char): Double {
	return when (sexo.lowercaseChar()) {
		'm' -> 72.7 * altura - 58
		'f' -> 62.1 * altura - 44.7
		else -> throw IllegalArgumentException("Sexo inválido. Use 'm' para masculino ou 'f' para feminino.")
	}
}

fun main() {
	val alturaHomem = 1.80
	val alturaMulher = 1.65

	println("Peso ideal para homem: ${"%.2f".format(calcularPesoIdeal(alturaHomem, 'm'))} kg")
	println("Peso ideal para mulher: ${"%.2f".format(calcularPesoIdeal(alturaMulher, 'f'))} kg")
}
