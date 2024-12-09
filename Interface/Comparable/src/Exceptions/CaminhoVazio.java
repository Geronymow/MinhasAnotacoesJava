package Exceptions;

public class CaminhoVazio {

    public static void mensagem(String path) throws DomainException {
        if (path.isEmpty()) {
            throw new DomainException("O caminho está vazio");
        }
    }
}
