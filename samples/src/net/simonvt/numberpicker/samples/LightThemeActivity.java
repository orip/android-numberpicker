package net.simonvt.numberpicker.samples;

import net.simonvt.widget.NumberPicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class LightThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_light);

        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        np.setMaxValue(20);
        np.setMinValue(0);
        np.setFocusable(true);
        np.setFocusableInTouchMode(true);

        android.widget.NumberPicker npn = (android.widget.NumberPicker) findViewById(R.id.numberPickerNative);
        npn.setMaxValue(20);
        npn.setMinValue(0);
        npn.setFocusable(true);
        npn.setFocusableInTouchMode(true);
    }
}
