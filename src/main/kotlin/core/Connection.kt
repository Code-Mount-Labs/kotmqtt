package core

import java.net.ServerSocket

class Connection(
    private var host: String,
    private var port: Int = 1883,
    private var username: String,
    private var password: String = ""
) {

    init {
        if (host == "")
            throw Exception("Host cannot be empty")
        if (username == "")
            throw Exception("Username cannot be empty")
        if (port < 0 || port > 65535)
            throw Exception("Port must be between 0 and 65535")
    }

    fun connect() {
        println("Connected with:$host:$port with $username & $password")
        // Listen to TCP/IP port for new packets
        val serverSocket = ServerSocket(1883)

    }

    fun disconnect() {
        println("Disconnected")
    }

}