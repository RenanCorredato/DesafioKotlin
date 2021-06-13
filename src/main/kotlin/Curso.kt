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
        return if (listaAlunosMatriculados.find { it == umAluno } == null && listaAlunosMatriculados.size < qtdMaximaAluno) {
            listaAlunosMatriculados.add(umAluno)
            println("Aluno adicionado")
            true
        } else {
            false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
        println("Aluno removido")
    }
}