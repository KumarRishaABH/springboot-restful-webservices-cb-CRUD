package com.RESTCB.springbootrestfulwebservicescb.repository;

import com.RESTCB.springbootrestfulwebservicescb.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {
}
