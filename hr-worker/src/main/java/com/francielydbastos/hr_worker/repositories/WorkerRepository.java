package com.francielydbastos.hr_worker.repositories;

import com.francielydbastos.hr_worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}