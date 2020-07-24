package com.ui.showcase.immutables;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;
import org.immutables.criteria.Criterion;
import org.immutables.criteria.matcher.AbstractContextHolder;
import org.immutables.criteria.matcher.AndMatcher;
import org.immutables.criteria.matcher.CriteriaContext;
import org.immutables.criteria.matcher.NotMatcher;
import org.immutables.criteria.matcher.OrMatcher;
import org.immutables.criteria.matcher.Projection;
import org.immutables.criteria.matcher.StringMatcher;
import org.immutables.criteria.matcher.WithMatcher;
import org.immutables.value.Generated;


/**
 * Base class for {@link StorageUseCaseCriteria} also used as matcher attribute on other criterias.
 * @param <R> root self-type for fluent API
 */
@ThreadSafe
@Immutable
@Generated(from = "StorageUseCase", generator = "Criteria")
public abstract class StorageUseCaseCriteriaTemplate<R> extends AbstractContextHolder implements Criterion<StorageUseCase>,
            AndMatcher<StorageUseCaseCriteria>, OrMatcher<StorageUseCaseCriteria>,
            NotMatcher<R, StorageUseCaseCriteria>,
            WithMatcher<R, StorageUseCaseCriteria>, Projection<StorageUseCase> {

   public final StringMatcher.Template<R> id;
   public final StringMatcher.Template<R> name;

   @SuppressWarnings("unchecked")
   StorageUseCaseCriteriaTemplate(CriteriaContext context) {
     super(context);
     this.id = (StringMatcher.Template<R>) StringMatcher.creator().create(context.newChild(StorageUseCase.class, "id", StringMatcher.creator()));
     this.name = (StringMatcher.Template<R>) StringMatcher.creator().create(context.newChild(StorageUseCase.class, "name", StringMatcher.creator()));
   }
}
