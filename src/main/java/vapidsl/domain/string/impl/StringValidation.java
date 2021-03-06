package vapidsl.domain.string.impl;

import vapidsl.common.ValidationError;
import vapidsl.dict.ErrorMode;
import vapidsl.dict.MatchMode;
import vapidsl.dict.PurposeMode;
import vapidsl.domain.Binder;
import vapidsl.domain.string.StringClauseBinder;

import java.util.List;

public class StringValidation extends StringClauseBinder {

    public StringValidation(String obj, MatchMode matchMode, PurposeMode purposeMode) {
        super(StringValidation.class);
        this.obj = obj;
        this.modeManager = new Binder.ModeManager(matchMode, purposeMode);
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
    public StringValidation onError(String error) {
        return super.onError(error);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringValidation onError(String field, String error) {
        return super.onError(field, error);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringValidation groupError(String error) {
        return super.groupError(error);
    }
}
