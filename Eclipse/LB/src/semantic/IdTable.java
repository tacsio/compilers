package semantic;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import ast.terminais.Id;

public class IdTable {

	private Map<String, TipoPrimitivo> escopoGlobal;// Escopo_global
	private Map<String, TipoPrimitivo> escopoAtual;// Escopo_atualmente_usado
	private Map<String, Vector<Tupla>> escopoMetodos; // Guarda_os_parametros_tem_como_chave_id
	private boolean isGlobal;

	public IdTable() {

		this.escopoAtual = new HashMap<String, TipoPrimitivo>();
		this.escopoGlobal = new HashMap<String, TipoPrimitivo>();
		this.escopoMetodos = new HashMap<String, Vector<Tupla>>();
		this.isGlobal = true;
	}

	/**
	 * Retorna o tipo primitivo aparti do identificador
	 * 
	 * @param id
	 * @return
	 */
	public TipoPrimitivo getTipo(Id id) {

		TipoPrimitivo retorno;

		if (isGlobal) {
			retorno = this.escopoGlobal.get(id.getText());
		} else {
			retorno = this.escopoAtual.get(id.getText());
		}
		return retorno;
	}

	/**
	 * Abre escopo local
	 */
	public void abrirEscopo() {
		this.isGlobal = false;
		atualizaEscopo();
	}

	/**
	 * fecha escopo local
	 */
	public void fecharEscopo() {
		this.isGlobal = true;
		this.escopoAtual.clear();// apaga as variaveis do escopo local
	}

	/**
	 * atualiza o escopo
	 */
	private void atualizaEscopo() {
		for (String key : this.escopoGlobal.keySet()) {
			this.escopoAtual.put(key, escopoGlobal.get(key));
		}
	}

	/**
	 * adiciona variavel ao escopo a qual ela pertence
	 * 
	 * @param id
	 * @param tipo
	 */
	public void addVar(Id id, TipoPrimitivo tipo) {
		if (this.isGlobal) {
			this.escopoGlobal.put(id.getText(), tipo);
		} else {
			this.escopoAtual.put(id.getText(), tipo);
		}
	}

	/**
	 * verifica se o identificador ja foi declarado
	 * 
	 * @param id
	 * @return
	 */
	public boolean hasVar(Id id) {
		boolean retorno;

		if (isGlobal) {
			retorno = this.escopoGlobal.containsKey(id.getText());
		} else {
			retorno = this.escopoAtual.containsKey(id.getText());
		}
		return retorno;
	}

	/**
	 * Adiciona o metodo (procedimento ou funcao) na tabela propria, contendo
	 * seu identificador e sua lista de parametros
	 * 
	 * @param metodo
	 */
	public void addMetodo(Id metodo) {
		this.escopoMetodos.put(metodo.getText(), new Vector<Tupla>());
	}

	/**
	 * Adiciona os parametros ao metodo
	 * 
	 * @param metodo
	 * @param id
	 * @param tipo
	 */
	public void addParametros(Id metodo, Id id, TipoPrimitivo tipo) {

		Tupla t = new Tupla(id.getText(), tipo);
		Vector<Tupla> v = this.escopoMetodos.get(metodo.getText());
		v.addElement(t);

	}

	/**
	 * retorna se o metodo existe pelo seu identificador
	 * 
	 * @param id
	 * @return
	 */
	public boolean hasMetodo(Id id) {
		return this.escopoMetodos.containsKey(id.getText());
	}

	/**
	 * retorna os parametros do metodo (tupla)
	 * 
	 * @param id
	 * @return
	 */
	public Vector<Tupla> getArgs(Id id) {

		return this.escopoMetodos.get(id.getText());
	}

	/**
	 * Retorna o numero de parametros que o metodo possui
	 * 
	 * @param id
	 * @return
	 */
	public int getNumeroArgumentos(Id id) {

		return this.escopoMetodos.get(id.getText()).size();
	}

	/**
	 * verifica se a variavel pertence ao escopo global
	 * 
	 * @param id
	 * @return
	 */
	public boolean hasGlobal(Id id) {
		return this.escopoGlobal.containsKey(id.getText());
	}

	/**
	 * retorna o vetor com os argumentos do metodo identificado pelo id
	 * 
	 * @param id
	 * @return
	 */
	public Vector<TipoPrimitivo> getTipoArgumentos(Id id) {

		Vector<TipoPrimitivo> retorno = new Vector<TipoPrimitivo>();
		Vector<Tupla> tuplas = this.escopoMetodos.get(id.getText());

		for (int i = 0; i < tuplas.size(); i++) {
			retorno.add(tuplas.get(i).tipo);
		}

		return retorno;
	}

}

class Tupla {

	String id;
	public TipoPrimitivo tipo;

	public Tupla(String id, TipoPrimitivo tipo) {
		this.id = id;
		this.tipo = tipo;
	}

}
