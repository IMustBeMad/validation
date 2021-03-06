package vapidsl.termination.mode;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import vapidsl.Validation;
import vapidsl.domain.object.ObjectConditions;

import java.util.List;

@RunWith(JUnit4.class)
public class NoneGroupMatchTerminationModeTest {

    @Test
    public void should_throwError_when_noneGroupIsMatched() {
        String isNotEmptyError = "is.not.empty";
        String isNotNullError = "is.not.null";

        Assertions.assertThatThrownBy(() -> Validation.succeedIf("test")
                                                      .isEmpty().onError(isNotEmptyError)
                                                      .or()
                                                      .isNull().onError(isNotNullError)
                                                      .examine())
                  .hasMessage(isNotEmptyError + "\n" + isNotNullError);
    }

    @Test
    public void should_beNoErrors_when_anyGroupIsMatched() {
        Validation.succeedIf(List.of(42L, 42L))
                  .isEmpty().onError("not.empty")
                  .or()
                  .inspecting(it -> it.get(0), ObjectConditions::isNull).onError("is.not.null")
                  .or()
                  .hasSize(2).onError("incorrect.size")
                  .examine();
    }
}
