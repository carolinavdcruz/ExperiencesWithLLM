import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

// Função que constrói o JSON e faz a chamada HTTP
fun askOllama(prompt: String, imageBase64: String) {

    // Ollama exige que seja criado o json manualmente
    val json = """
        {
            "model": "llava",
            "prompt": "$prompt",
            "stream": false,
            "images": ["$imageBase64"]
        }
    """.trimIndent()

    // criar cliente http
    val client = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("http://localhost:11434/api/generate"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(json))
        .build()

    //enviar pedido e receber resposta
    val response = client.send(request, HttpResponse.BodyHandlers.ofString())
    println("\n Resposta dada pelo LLAVA:")
    println(response.body())

}