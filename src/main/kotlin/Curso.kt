class Curso(
    val nome: String,
    val codigoCurso: Int,
    val qtdMaximaAluno: Int
) {
    lateinit var professoresTitulares: ProfessoresTitulares
    lateinit var professoresAdjuntos: ProfessoresAdjuntos
    var listaAlunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.codigoCurso == this.codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (listaAlunosMatriculados.size < qtdMaximaAluno) {
            println("Aluno adicionado $listaAlunosMatriculados.add(umAluno)")
            return true
        } else {
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
        println("Aluno removido")
    }
}