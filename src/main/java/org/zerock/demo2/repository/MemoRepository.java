package org.zerock.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.demo2.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long>{ }
