class Principal {
}

fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Renan", "Corredato", 123, "kotlin")
    digitalHouseManager.registrarProfessorTitular("João", "Silva", 456, "Android")

    digitalHouseManager.registrarProfessorAdjunto("Cleber", "Donato", 125, 30)
    digitalHouseManager.registrarProfessorAdjunto("Pedro", "Barbosa", 569, 50)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)


    digitalHouseManager.alocarProfessores(20001, 123, 125)

    digitalHouseManager.matricularAluno("aluno1", "1", 1)
    digitalHouseManager.matricularAluno("aluno2", "2", 2)
    digitalHouseManager.matricularAluno("aluno3", "3", 3)
    digitalHouseManager.matricularAluno("aluno4", "4", 4)

    digitalHouseManager.matricularAlunoCruso(1,20001)
    digitalHouseManager.matricularAlunoCruso(2,20001)
    digitalHouseManager.matricularAlunoCruso(3,20001)




}

