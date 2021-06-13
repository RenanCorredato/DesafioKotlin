class Aluno(
    val nome: String,
    val sobrenome: String,
    val codigoAluno: Int) {

        override fun equals(other: Any?): Boolean {
            return (other as? Aluno)?.codigoAluno == codigoAluno
    }
    }