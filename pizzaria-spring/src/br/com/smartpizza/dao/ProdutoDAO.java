package br.com.smartpizza.dao;

import java.util.List;

import br.com.smartpizza.dto.ProdutoDTO;
import br.com.smartpizza.model.Produto;

public interface ProdutoDAO extends GenericDao<Produto>{
	public List<Produto> findByName(String name);
	public List<ProdutoDTO> findByNameDTO(String name);
	public List<ProdutoDTO> findByNameType(Long type);
	public List<ProdutoDTO> findByNameTypeAndSize(String name, Long type, String size);
}
