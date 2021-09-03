package view;

import java.util.concurrent.Semaphore;
import controller.ThreadPorta;

public class CruzarPorta {

	public static void main(String[] args) {
		int qtdpermitido = 1;
		Semaphore semaforo = new Semaphore(qtdpermitido);

		for (int idPessoa = 1; idPessoa < 5; idPessoa++) {
			Thread pessoa = new ThreadPorta(idPessoa, semaforo);
			pessoa.start();
		}
	}

}