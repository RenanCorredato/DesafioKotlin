class ProfessoresAdjuntos(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    val qtdHorasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}