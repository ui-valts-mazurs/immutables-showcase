package com.ui.showcase.immutables;

import java.util.Objects;
import javax.annotation.concurrent.ThreadSafe;
import org.immutables.criteria.Criterion;
import org.immutables.criteria.backend.Backend;
import org.immutables.criteria.backend.WriteResult;
import org.immutables.criteria.repository.Repository;
import org.immutables.criteria.repository.Updater;
import org.immutables.criteria.repository.sync.SyncReadable;
import org.immutables.criteria.repository.sync.SyncReader;
import org.immutables.criteria.repository.sync.SyncRepository;
import org.immutables.criteria.repository.sync.SyncWritable;

/**
 * A {@code StorageUseCaseRepository} provides access for storing and retrieving objects
 * from a generic data-source based on {@link StorageUseCaseCriteria}.
 */
@ThreadSafe
public class StorageUseCaseRepository implements Repository<StorageUseCase>, SyncRepository.Readable<StorageUseCase>, SyncRepository.Writable<StorageUseCase> {

  private final Backend backend;

  private final SyncReadable<StorageUseCase> readable;
  private final SyncWritable<StorageUseCase> writable;

  public StorageUseCaseRepository(Backend backend) {
    this.backend = Objects.requireNonNull(backend, "backend");
    final Backend.Session session = backend.open(StorageUseCase.class);
    this.readable = new SyncReadable<StorageUseCase>(session);
    this.writable = new SyncWritable<StorageUseCase>(session);
  }

  @Override
  public SyncReader<StorageUseCase> find(Criterion<StorageUseCase> arg0) {
     return readable.find(arg0);
  }

  @Override
  public SyncReader<StorageUseCase> findAll() {
     return readable.findAll();
  }

  @Override
  public WriteResult insert(StorageUseCase doc) {
     return writable.insert(doc);
  }

  @Override
  public WriteResult insertAll(Iterable<? extends StorageUseCase> arg0) {
     return writable.insertAll(arg0);
  }

  @Override
  public WriteResult delete(Criterion<StorageUseCase> arg0) {
     return writable.delete(arg0);
  }

  @Override
  public WriteResult upsert(StorageUseCase doc) {
     return writable.upsert(doc);
  }

  @Override
  public WriteResult upsertAll(Iterable<? extends StorageUseCase> arg0) {
     return writable.upsertAll(arg0);
  }

  @Override
  public WriteResult update(StorageUseCase doc) {
     return writable.update(doc);
  }

  @Override
  public WriteResult updateAll(Iterable<? extends StorageUseCase> arg0) {
     return writable.updateAll(arg0);
  }

  @Override
  public Updater<StorageUseCase,WriteResult> update(Criterion<StorageUseCase> arg0) {
     return writable.update(arg0);
  }
}
