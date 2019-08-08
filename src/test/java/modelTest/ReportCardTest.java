package modelTest;

import model.ReportCard;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

public class ReportCardTest {

    public static final String MARK_LIST_IS_NULL = "Mark list is null";
    public static final String MARK_LIST_IS_EMPTY = "Mark list is empty";

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @InjectMocks
    private ReportCard reportCard;

    @Test
    public void validateCalculateAverageMarkListIsNull(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(MARK_LIST_IS_NULL);
        List<Double> marks = null;
        reportCard.calculateAverage(marks);
    }

    @Test
    public void validateCalculateAverageMarkListIsEmpty(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(MARK_LIST_IS_EMPTY);
        List<Double> marks = new ArrayList<>();
        reportCard.calculateAverage(marks);
    }
}
