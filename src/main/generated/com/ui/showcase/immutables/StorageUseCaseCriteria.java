package com.ui.showcase.immutables;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;
import org.immutables.criteria.matcher.CriteriaContext;
import org.immutables.criteria.matcher.CriteriaCreator;
import org.immutables.criteria.matcher.Disjunction;
import org.immutables.value.Generated;


/**
 * A {@code StorageUseCaseCriteria} provides fluent, type-safe API for querying documents
 * based on {@link StorageUseCase} model.
 *
 * <p>This class is immutable and thus thread-safe.</p>
 */
@ThreadSafe
@Immutable
@Generated(from = "StorageUseCase", generator = "Criteria")
public class StorageUseCaseCriteria extends StorageUseCaseCriteriaTemplate<StorageUseCaseCriteria>
     implements Disjunction<StorageUseCaseCriteriaTemplate<StorageUseCaseCriteria>>  {

  /** Default criteria instance */
  public static final StorageUseCaseCriteria storageUseCase = new StorageUseCaseCriteria(new CriteriaContext(StorageUseCase.class, creator()));

  /** Used to instantiate StorageUseCaseCriteria by other criterias */
  public static CriteriaCreator<StorageUseCaseCriteria> creator() {
     return StorageUseCaseCriteria::new;
  }

  private StorageUseCaseCriteria(CriteriaContext context) {
     super(context);
  }
}
