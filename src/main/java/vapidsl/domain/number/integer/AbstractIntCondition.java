package vapidsl.domain.number.integer;

import vapidsl.common.SingleCondition;
import vapidsl.domain.AbstractBaseValidation;
import vapidsl.domain.number.integer.impl.IntValidation;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class AbstractIntCondition extends AbstractBaseValidation<Integer, IntValidation> {

    AbstractIntCondition(Class<?> selfType) {
        super(selfType);
    }

    public IntValidation isGt(Integer otherInteger) {
        this.registerCondition(IntConditions.isGt(otherInteger));

        return self;
    }

    public IntValidation isGte(Integer otherInteger) {
        this.registerCondition(IntConditions.isGte(otherInteger));

        return self;
    }

    public IntValidation isLt(Integer otherInteger) {
        this.registerCondition(IntConditions.isLt(otherInteger));

        return self;
    }

    public IntValidation isLte(Integer otherInteger) {
        this.registerCondition(IntConditions.isLte(otherInteger));

        return self;
    }

    @Override
    public IntValidation isNull() {
        return super.isNull();
    }

    @Override
    public IntValidation isNotNull() {
        return super.isNotNull();
    }

    @Override
    public IntValidation isEqualTo(Integer otherObj) {
        return super.isEqualTo(otherObj);
    }

    @Override
    public IntValidation isNotEqualTo(Integer otherObj) {
        return super.isNotEqualTo(otherObj);
    }

    @Override
    public IntValidation withTerm(Predicate<Integer> predicate) {
        return super.withTerm(predicate);
    }

    @Override
    public IntValidation withTerm(Supplier<Boolean> supplier) {
        return super.withTerm(supplier);
    }

    @Override
    @SafeVarargs
    public final IntValidation satisfiesAny(SingleCondition<Integer>... conditions) {
        return super.satisfiesAny(conditions);
    }

    @Override
    @SafeVarargs
    public final IntValidation satisfiesAll(SingleCondition<Integer>... conditions) {
        return super.satisfiesAll(conditions);
    }

    @Override
    public IntValidation log(String msg, Object... values) {
        return super.log(msg, values);
    }

    @Override
    public  <R> IntValidation inspecting(Function<Integer, R> mapper, Predicate<R> predicate) {
        return super.inspecting(mapper, predicate);
    }

    @Override
    public  <R> IntValidation inspecting(Function<Integer, R> mapper, Supplier<SingleCondition<R>> condition) {
        return super.inspecting(mapper, condition);
    }

    @Override
    public  <R, OTHER extends AbstractBaseValidation<R, OTHER>> IntValidation deepInspecting(Function<Integer, R> mapper, Function<R, AbstractBaseValidation<R, OTHER>> validator) {
        return super.deepInspecting(mapper, validator);
    }
}