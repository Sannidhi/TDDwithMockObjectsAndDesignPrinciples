import org.junit.Test;
import tddmicroexercises.tirepressuremonitoringsystem.Alarm;
import tddmicroexercises.tirepressuremonitoringsystem.Sensor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {

    @Test
    public void shouldSetAlarmToTrueWhenPressureIsLessThan17() {
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue()).thenReturn(5.0);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(true));
    }

    @Test
    public void shouldSetAlarmToFalseWhenPressureIsGreatarThan21() {
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue()).thenReturn(20.0);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertThat(alarm.isAlarmOn(), is(false));
    }
}