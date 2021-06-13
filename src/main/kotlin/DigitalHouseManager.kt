class DigitalHouseManager(
    var listaAluno: MutableList<Aluno> = mutableListOf<Aluno>(),
    var listaProfessores: MutableList<Professor> = mutableListOf<Professor>(),
    var listaCursos: MutableList<Curso> = mutableListOf<Curso>(),
    var listaMatriculas: MutableList<Matricula> = mutableListOf<Matricula>()
) {

    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        qtdMaximaDeAlunos: Int
    ) {

        val novoCurso = Curso(nome, codigoCurso, qtdMaximaDeAlunos)
        listaCursos.add(novoCurso)
        println("novo curso adicionado $nome $codigoCurso")
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.removeAt(codigoCurso)
        println("Curso removido $codigoCurso")
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        qtdHorasMonitoria: Int
    ) {
        val professoresAdjuntos = ProfessoresAdjuntos(
            nome,
            sobrenome,
            0,
            codigoProfessor,
            qtdHorasMonitoria
        )
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        val professorTitular = ProfessoresTitulares(
            nome,
            sobrenome,
            codigoProfessor,
            0,
            especialidade
        )
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.removeAt(codigoProfessor)
        println("Professor removido $codigoProfessor")
    }

    fun matricularAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {

        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAluno.add(novoAluno)
        println("novo curso adicionado $nome $codigoAluno")
    }

    fun matricularAlunoCruso(
        codigoAluno: Int,
        codigoCurso: Int
    ) {

        val curso = listaCursos.find { it.codigoCurso == codigoCurso }
        val aluno = listaAluno.find { it.codigoAluno == codigoAluno }

        if (curso != null && aluno != null) {
            if (curso.adicionarUmAluno(aluno)) {
                listaMatriculas.add(Matricula(aluno, curso))
                println("Aluno Matricula")
            } else {
                println("Não foi possível realizar a matricula.")
            }
        }
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {

        val professorTitular =
            listaProfessores.find { it is ProfessoresTitulares && it.codigoProfessor == codigoProfessorTitular }
        val professorAdjunto =
            listaProfessores.find { it is ProfessoresAdjuntos && it.codigoProfessor == codigoProfessorAdjunto }

        if (listaCursos.find { it.codigoCurso == codigoCurso } != null && professorAdjunto != null && professorTitular != null) {
            listaCursos.find { it.codigoCurso == codigoCurso }?.professoresAdjuntos =
                professorAdjunto as ProfessoresAdjuntos
            listaCursos.find { it.codigoCurso == codigoCurso }?.professoresTitulares =
                professorTitular as ProfessoresTitulares
        }
    }
}


