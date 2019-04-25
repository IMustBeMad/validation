package validation.api.demo.validation.domain.array;

import validation.api.demo.validation.common.SingleCondition;
import validation.api.demo.validation.domain.object.AbstractObjectValidation;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractArrayValidation<T> extends AbstractObjectValidation<T[]> {

    public AbstractArrayValidation<T> contains(T element, String onError) {
        memoize(new SingleCondition<>(array -> Arrays.asList(array).contains(element), onError));

        return this;
    }

    public AbstractArrayValidation<T> ofSize(int size, String onError) {
        memoize(new SingleCondition<>(array -> array.length == size, onError));

        return this;
    }

    @Override
    public AbstractArrayValidation<T> isNull(String onError) {
        return (AbstractArrayValidation<T>) super.isNull(onError);
    }

    @Override
    public AbstractArrayValidation<T> isNotNull(String onError) {
        return (AbstractArrayValidation<T>) super.isNotNull(onError);
    }

    @Override
    public AbstractArrayValidation<T> isEqualTo(T[] otherObj, String onError) {
        return (AbstractArrayValidation<T>) super.isEqualTo(otherObj, onError);
    }

    @Override
    public AbstractArrayValidation<T> isNotEqualTo(T[] otherObj, String onError) {
        return (AbstractArrayValidation<T>) super.isNotEqualTo(otherObj, onError);
    }

    @Override
    public AbstractArrayValidation<T> withTerm(Predicate<T[]> predicate, String onError) {
        return (AbstractArrayValidation<T>) super.withTerm(predicate, onError);
    }

    @Override
    public AbstractArrayValidation<T> isAnyOf(SingleCondition<T[]> condition1, SingleCondition<T[]> condition2, String onError) {
        return ((AbstractArrayValidation<T>) super.isAnyOf(condition1, condition2, onError));
    }

    @Override
    public AbstractArrayValidation<T> isAllOf(SingleCondition<T[]> condition1, SingleCondition<T[]> condition2, String onError) {
        return ((AbstractArrayValidation<T>) super.isAllOf(condition1, condition2, onError));
    }

    @Override
    public AbstractArrayValidation<T> or() {
        return ((AbstractArrayValidation<T>) super.or());
    }

    @Override
    public AbstractArrayValidation<T> log(String msg, Object... values) {
        return (AbstractArrayValidation<T>) super.log(msg, values);
    }

    @Override
    public <R> AbstractArrayValidation<T> inspecting(Function<T[], R> mapper, Predicate<R> predicate, String onError) {
        return (AbstractArrayValidation<T>) super.inspecting(mapper, predicate, onError);
    }

    @Override
    public <R> AbstractArrayValidation<T> inspecting(Function<T[], R> mapper, Function<R, AbstractObjectValidation<R>> validator) {
        return (AbstractArrayValidation<T>) super.inspecting(mapper, validator);
    }
}
