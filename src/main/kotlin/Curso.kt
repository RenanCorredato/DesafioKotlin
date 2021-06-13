class Curso(
    val nome: String,
    val codigoCurso: Int,
    val qtdMaximaAluno:Int
) {
    lateinit var professoresTitulares: ProfessoresTitulares
    lateinit var professoresAdjuntos:ProfessoresAdjuntos
    var listaAlunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.codigoCurso == this.codigoCurso
    }
}