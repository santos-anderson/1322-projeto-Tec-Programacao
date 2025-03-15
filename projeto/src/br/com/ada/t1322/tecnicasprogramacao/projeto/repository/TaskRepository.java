package br.com.ada.t1322.tecnicasprogramacao.projeto.repository;

import br.com.ada.t1322.tecnicasprogramacao.projeto.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Task save(Task task);

    List<Task> findAll();

    List<Task> findByStatus(String status);

    Optional<Task> findById(Long id);

    boolean deleteById(Long id);

    void deleteAll();
}