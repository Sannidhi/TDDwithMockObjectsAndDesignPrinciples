import org.junit.Test;
import tddmicroexercises.tirepressuremonitoringsystem.Sensor;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SensorTest {

    @Test
    public void shouldReturnPsiValueBetween17And21() throws Exception {
        Sensor sensor = new Sensor();
        assertThat(sensor.popNextPressurePsiValue(), is(allOf(greaterThan(17.0),lessThan(21.0))));
    }
}