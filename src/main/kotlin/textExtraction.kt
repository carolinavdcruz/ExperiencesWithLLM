fun main() {

    val path = "receipt.jpg"

    val prompt = "Quais foram os produtos comprados?"

    try{

        println("A ler imagem ...")

        val imageBase64 = convertImageToBase64(path)

        askOllama(prompt, imageBase64)

    }catch (e: Exception){

        println("Não foi possível. Verifica se a imagem existe e se o Ollama está a correr")
        e.printStackTrace() // devolve o nome da classe, mensagem de erro e a linha exata onde ocorreu a exceção

    }
}