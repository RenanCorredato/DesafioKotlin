class Curso(
    val nome: String,
    val codigoCurso: Int
) {

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.codigoCurso == this.codigoCurso
    }
}