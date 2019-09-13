package me.smash;

import java.util.List;

interface CreateReadUpdateDelete<E> {

  void create(E entity);

  E readOne(long id);

  List<E> readAll();

  void update(E entity);

  void delete(E entity);
}

