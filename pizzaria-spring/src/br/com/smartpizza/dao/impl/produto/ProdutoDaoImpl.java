package br.com.smartpizza.dao.impl.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.smartpizza.dao.ProdutoDAO;
import br.com.smartpizza.dto.ProdutoDTO;
import br.com.smartpizza.model.Produto;

public class ProdutoDaoImpl implements ProdutoDAO {
	
	@Override
	public void saveOrUpdate(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void merge(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto findById( Long primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdutoDTO> findByNameDTO(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdutoDTO> findByNameType(Long tipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProdutoDTO> findByNameTypeAndSize(String name, Long type, String size) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
