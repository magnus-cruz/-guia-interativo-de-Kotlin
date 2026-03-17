fun verificarSinal(valor: Double): String {
	return if (valor >= 0) {
		"Positivo"
	} else {
		"Negativo"
	}
}

fun main() {
	val valor = -7.5
	println("O valor $valor é ${verificarSinal(valor)}.")
}
