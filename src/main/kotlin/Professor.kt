class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: String,
    val codigoProfessor: String
) {
    override fun equals(other: Any?): Boolean {
        return (other as? Professor)?.codigoProfessor == this.codigoProfessor
    }
}