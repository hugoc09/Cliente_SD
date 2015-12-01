package Exceptions;

public class ServidoresOfflineExceptions extends Exception {
	private static final long serialVersionUID = 1L;

	public ServidoresOfflineExceptions(Throwable causa) {
		super("Conexão Inexistente: " + causa);
	}
}

