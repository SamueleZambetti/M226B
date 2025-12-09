import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {
    @Test
    void addAndMultiplyByTwoTest(){
        //Given
        Calculator calc = new Calculator();
        CalculatorService service = new CalculatorService(calc);
        //When
        int result = service.addAndMultiplyByTwo(3, 4);
        //Then
        assertEquals(14, result);
    }


    @Test
    void addAndMultiplyByTwoMockedTest(){
        //Given
        Calculator mockCalc = mock(Calculator.class);
        when(mockCalc.add(3, 4)).thenReturn(7);
        CalculatorService service = new CalculatorService(mockCalc);
        //When
        int result = service.addAndMultiplyByTwo(3, 4);
        //Then
        assertEquals(14, result);
    }
}
