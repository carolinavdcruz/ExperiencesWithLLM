import java.io.File
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.Base64

fun main(){
    val path = "sporting.jpg"

    val prompt = "Descreve o que vês na imagem"

    try {
        println("A ler a imagem...")

        val imageBase64 = convertImageToBase64(path)

        askOllama(prompt, imageBase64)
    } catch (e: Exception) {
        println("Não foi possível. Verifica se a imagem existe e se o Ollama está a correr")
        e.printStackTrace() // devolve o nome da classe, mensagem de erro e a linha exata onde ocorreu a exceção
    }
}

/*
Output:

 Resposta dada pelo LLAVA:
{
    "model":"llava",
    "created_at":"2026-04-02T16:43:21.691392Z",
    "response":
        " A imagem mostra um logotipo do Sporting Clube de Portugal, conhecido por seu apelido SCP. O emblema está
            composto por três letras \"SCP\" no top e uma imagem de uma faixa verde com letras brancas abaixo, junto
            com a palavra \"PORTUGAL\". Há também um símbolo em um escudo que parece ser o brasão de armas do Sporting
            Clube de Portugal. ",
    "done":true,
    "done_reason":"stop",
    "context":[733,16289,28793,733,5422,28733,28734,28793,2715,961,333,289,955,363,17194,1879,3809,366,733,28748,16289,28793,330,3809,366,1080,520,3205,2085,322,508,28709,511,11093,288,1366,4276,340,16160,28725,379,265,20234,1959,7987,979,301,2750,318,4100,28723,451,877,982,705,11176,623,10583,1959,467,17194,462,12423,345,3315,28753,28739,708,1830,317,5912,3809,366,340,5912,3586,27375,1429,450,432,462,12423,1170,834,293,534,28708,833,28709,28725,21396,432,264,4785,494,520,345,5021,12894,1086,2586,382,28820,17591,3205,18002,1757,5053,877,3205,3431,9297,955,13103,358,1201,289,20493,2069,340,3648,293,511,11093,288,1366,4276,340,16160,28723,28705],
    "total_duration":17762155959,
    "load_duration":4755298167,
    "prompt_eval_count":596,
    "prompt_eval_duration":7166365375,
    "eval_count":110,
    "eval_duration":5151056370
}
 */