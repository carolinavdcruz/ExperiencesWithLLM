import java.io.File
import java.util.Base64

// Função que lê o ficheiro da imagem e converte para Base64
fun convertImageToBase64(path: String): String {
    // transformar imagem numa sequência de bytes em formato binário
    val bytes = File(path).readBytes()
    // traduz esses bytes para uma string base 64
    return Base64.getEncoder().encodeToString(bytes)
}
