package br.com.irmaoscocati.util;

public enum CaminhoArquivoEnum {

	CAMINHO_ARQUIVO_PROCESSO("file:/data/tiquei-batch/bmf/execucao/*"),//
	CAMINHO_ARQUIVO_ENTRADA("/data/tiquei-batch/bmf/entrada/"), //
	CAMINHO_ARQUIVO_ERRO("/data/tiquei-batch/bmf/erro/"),//
	CAMINHO_ARQUIVO_EXECUCAO("/data/tiquei-batch/bmf/execucao/"),//
	CAMINHO_ARQUIVO_SAIDA("/data/tiquei-batch/bmf/saida/");

	private String caminho;

	private CaminhoArquivoEnum(String caminho) {
		this.caminho = caminho;
	}

	public String getCaminho() {
		return caminho;
	}

}
