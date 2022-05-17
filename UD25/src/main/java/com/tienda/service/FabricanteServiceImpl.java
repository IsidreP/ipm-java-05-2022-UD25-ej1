package com.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dao.IFabricanteDAO;
import com.tienda.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IFabricanteDAO iFabricanteDAO;
		
		@Override
		public List<Fabricante> listarFabricantes() {
			
			return iFabricanteDAO.findAll();
		}

		@Override
		public Fabricante guardarFabricante(Fabricante fabricante) {
			
			return iFabricanteDAO.save(fabricante);
		}

		@Override
		public Fabricante fabricanteXID(int id) {
			
			return iFabricanteDAO.findById(id).get();
		}

		@Override
		public Fabricante actualizarFabricante(Fabricante fabricante) {
			
			return iFabricanteDAO.save(fabricante);
		}

		@Override
		public void eliminarFabricante(int id) {
			
			iFabricanteDAO.deleteById(id);
			
		}


}
