data class User (
    val username: String = "Maks",
    val email: String = "geeks@gmail.com",
    val age: Int = 19,
    val password: Int = 2023
): Verifiable {
    override fun verifiable(classUser: User) {
        if (classUser == User()) {
            println("Вход выполнен успешно!")
        }else{
             throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}
