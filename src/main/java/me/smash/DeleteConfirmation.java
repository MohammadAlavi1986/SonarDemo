package me.smash;

import java.io.IOException;
import java.util.List;

class DeleteConfirmation<E> implements CreateReadUpdateDelete<E> {

  private transient final CreateReadUpdateDelete<E> delegate;

  public DeleteConfirmation(CreateReadUpdateDelete<E> delegate) {
    this.delegate = delegate;
  }

  @Override
  public void create(E entity) {
    delegate.create(entity);
  }

  @Override
  public E readOne(long id) {
    return delegate.readOne(id);
  }

  @Override
  public List<E> readAll() {
    return delegate.readAll();
  }

  @Override
  public void update(E entity) {
    delegate.update(entity);
  }

  @Override
  public void delete(E entity) {
    System.out.println("Are you sure you want to delete this record?");
    try {
      if (System.in.read() == 'y') {
        delegate.delete(entity);
      }
    } catch (IOException e) {
      // ignore
    }
  }
}
