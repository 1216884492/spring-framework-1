package org.springframework.jdbc.transaction.annotation.dhf.book.dao;

import org.springframework.jdbc.transaction.annotation.dhf.book.model.User1;

public interface User1Dao {
    int insert(User1 record);

    int getLargestUserId();
}