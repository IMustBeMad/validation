package validation.api.demo.data.feature;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import validation.api.demo.data.common.Attachment;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DeepInspectingTest {

    @Test
    public void should_beNoErrors_when_validationsHaveNoErrors() {
        List<Attachment> attachments = List.of(
                getAttachment(1L, "test"),
                getAttachment(2L, "test1"),
                getAttachment(3L, "test2"),
                getAttachment(4L, "test3")
        );

//        Validation.verifyIf(attachments)
//                  .ofSize(4, "incorrect.size")
//                  .each(attachment -> Validation.verifyIf(attachment)
//                                                .inspecting(Attachment::getId, () -> LongConditions.isGt(0L), "not.gt")
//                                                .inspecting(Attachment::getOriginalName, () -> StringConditions.matches("test.*"), "not.matches")
//                                                .failOn(TerminationMode.LAST_ERROR_ENCOUNTERED)
//                  )
//                  .failOn(TerminationMode.FIRST_ERROR_ENCOUNTERED)
//                  .examine();
    }

    @Test
    public void should_beErrorOnSecondItem_when_validationHaveErrors() {
        List<Attachment> attachments = List.of(
                getAttachment(1L, "test"),
                getAttachment(-2L, "error"),
                getAttachment(3L, "test2"),
                getAttachment(4L, "test3")
        );
//
//        Validation.verifyIf(attachments)
//                  .ofSize(4, "incorrect.size")
//                  .each(attachment -> Validation.verifyIf(attachment)
//                                                .inspecting(Attachment::getId, () -> LongConditions.isGt(0L), "not.gt")
//                                                .inspecting(Attachment::getOriginalName, () -> StringConditions.matches("test.*"), "not.matches")
//                                                .failOn(TerminationMode.LAST_ERROR_ENCOUNTERED)
//                  )
//                  .failOn(TerminationMode.FIRST_ERROR_ENCOUNTERED)
//                  .examine();
    }

    private Attachment getAttachment(Long id, String name) {
        Attachment attachment = new Attachment();
        attachment.setId(id);
        attachment.setOriginalName(name);

        return attachment;
    }
}