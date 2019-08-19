package validation.api.demo.validation.domain.number.impl;

import validation.api.demo.validation.exception.SystemMessage;
import validation.api.demo.validation.domain.number.AbstractLongClause;

import java.util.List;

public class LongValidation extends AbstractLongClause {

    public LongValidation(Long aLong) {
        super();
        this.obj = aLong;
    }

    @Override
    public List<SystemMessage> examine() {
        return super.examine();
    }

    @Override
    public LongValidation onError(String error) {
        return (LongValidation) super.onError(error);
    }

    @Override
    public LongValidation onGroupError(String error) {
        return (LongValidation) super.onGroupError(error);
    }
}
