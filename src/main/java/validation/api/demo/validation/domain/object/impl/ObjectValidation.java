package validation.api.demo.validation.domain.object.impl;

import validation.api.demo.validation.dict.ErrorMode;
import validation.api.demo.validation.dict.MatchMode;
import validation.api.demo.validation.dict.PurposeMode;
import validation.api.demo.validation.domain.object.AbstractObjectClause;
import validation.api.demo.validation.common.ValidationError;

import java.util.List;

public class ObjectValidation<T> extends AbstractObjectClause<T> {

    public ObjectValidation(T obj, MatchMode matchMode, PurposeMode purposeMode) {
        super();
        this.obj = obj;
        this.modeManager = new ModeManager(matchMode, purposeMode);
    }

    @Override
    public List<ValidationError> examine() {
        return super.examine();
    }

    @Override
    public List<ValidationError> examine(ErrorMode errorMode) {
        return super.examine(errorMode);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectValidation<T> onError(String error) {
        return (ObjectValidation<T>) super.onError(error);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectValidation<T> groupError(String error) {
        return (ObjectValidation<T>) super.groupError(error);
    }
}
