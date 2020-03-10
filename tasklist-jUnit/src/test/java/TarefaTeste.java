import static org.junit.jupiter.api.Assertions.*;

import java.awt.Button;
import java.awt.TextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TarefaTeste {

	private Tarefa tarefa = new Tarefa("testar", "testar o trabalho", "09/03/2020");
	Random r = new Random();
	int sort;
	boolean bancoOn;
	boolean listaAtt;
	
	@BeforeAll
	
	public static void constructor() throws InterruptedException {
		System.out.println("Abrindo conexão com o banco.");
		
	}
	
	@Test
	void testData(){
		LocalDate tempo;
		tempo = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataatt = dtf.format(tempo);
		assertEquals(dataatt, tarefa.getData(), "A data está inválida.");
	}
	
	@Test
	void testID() {
		Tarefa tarefa = new Tarefa("teste", "teste", "teste");
		Tarefa tarefa1 = new Tarefa("teste1", "teste2", "teste3");
		assertNotEquals(tarefa, tarefa1, "Os IDs não podem ser iguais.");
	}
	
	@Test
	void testIDNotNull(){
		Tarefa tarefa = new Tarefa(null, "teste2", "teste");
		assertNull(tarefa.getTitulo(), "ID não pode ser nulo.");
	}
	
	@Test
	void testNullPointer() {
		assertThrows(NullPointerException.class, () -> tarefa.checkID(), "O ID não pode ser nulo.");
		
	}
	
	@Test
	void testTaskFull() {
		LocalDate tempo;
		tempo = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataatt = dtf.format(tempo);
		assertAll("Tarefa", 
				() -> assertNotNull(tarefa.getTitulo()),
				() -> assertEquals(dataatt, tarefa.getData()));
	}
	
	@BeforeEach
	@Test
	void testBd() {
		bancoOn = r.nextBoolean();
		if(bancoOn) {
			bancoOn = true;
		}else {
			bancoOn = false;

		}
		
	}
	
	@AfterEach
	@Test
	void testAtt() {
		listaAtt = r.nextBoolean();
		if(listaAtt) {
			System.out.println("Lista Atualizada.");
			
		}else {
			System.out.println("Erro, o sistema não pode atualizar a lista.");
		}
		
	}

	@Disabled
	@Test
	void testDescription() {
		if(tarefa.getDescricao().isBlank()) {
			tarefa.setDescricao("Salve");
		}
	}
	
	@Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
	@Test
	void testLogin() throws InterruptedException {
		Random r = new Random();
		int randomicamente = r.nextInt(1000);
		Thread.sleep(randomicamente);
		System.out.println("Bem-vindo a sua lista de tarefas.");
		
	}
	
	@Test
	void testSearchTask() {
		TextField txtSearch = new TextField();
		txtSearch.setText("Eae");
		Assumptions.assumeFalse(txtSearch.getText().isBlank());
		
	}
	
	@Test
	void testUpdate() {
		Button selected = new Button();
		Assumptions.assumeTrue(selected.isEnabled());
		
	}
	@AfterAll
	public static void destructor() {
		System.out.println("Fechando conexão com o banco.");
		
	}
	
}
