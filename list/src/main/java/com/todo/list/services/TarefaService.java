package com.todo.list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.entities.Usuario;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.StatusDaTarefa;
import com.todo.list.repositories.TarefaRepository;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class TarefaService {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO salvarTarefa(TarefaDTO dto) {
		
		Tarefas task = new Tarefas();
		task.setDescricao(dto.getDescricao());
		task.setSetor(dto.getSetor());
		task.setPrioridade(Prioridade.BAIXA);;
		task.setDataCadastro(dto.getDataCadastro());
		task.setStatus(StatusDaTarefa.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getId());
		task.setUsuario(user);
		task = tarefaRepository.save(task);
		return new TarefaDTO(task);
	}
	
	public List<Tarefas> listarTarefas() {
		List<Tarefas> tarefas = tarefaRepository.findAll();
		return tarefas;
	}
}
