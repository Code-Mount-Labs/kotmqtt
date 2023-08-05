import core.Connection

fun main() {
    val connection = Connection("localhost", 1883, "admin", "password")
    // initialize new connection
    connection.connect()
}