package org.springframework.jdbc.transaction.annotation.dhf.book.dao;

import org.springframework.jdbc.transaction.annotation.dhf.book.model.User2;

public interface User2Dao {
    int insert(User2 record);

	int getLargestUserId();
}