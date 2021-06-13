abstract class Professor(
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codigoProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        return (other as? Professor)?.codigoProfessor == this.codigoProfessor
    }
}