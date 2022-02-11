package teoria2;

public class Matricula {
	
	private String curso;
	private String expediente;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	
	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public String toString() {
		return "MATRICULA [curso=" + curso + ", expediente=" + expediente + "]";
	}
	public Matricula(String curso, String expediente) {
		this.curso = curso;
		this.expediente = expediente;
	}
}



