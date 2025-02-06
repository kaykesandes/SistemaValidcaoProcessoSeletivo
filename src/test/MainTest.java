package src.test;

import src.candidatura.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testValorPretendido() {
        double valor = Main.valorPretendido();
        assertTrue(valor >= 1800.0 && valor <= 2200.0, "Valor pretendido fora do intervalo esperado");
    }

    @Test
    void testEntrandoEmContato() {
        // Este teste será mais complexo porque envolve aleatoriedade e efeitos colaterais (impressão no console).
        // Você pode querer refatorar o código para torná-lo mais testável.
        // Por enquanto, vamos apenas chamar o método para garantir que ele execute sem exceções.
        Main.entrandoEmContato("Test Candidato");
    }

    @Test
    void testMain() {
        // Este teste apenas chamará o método main para garantir que ele execute sem exceções.
        String[] args = {};
        Main.main(args);
    }
}