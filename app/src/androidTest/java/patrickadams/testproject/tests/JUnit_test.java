package patrickadams.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import patrickadams.testproject.MyActivity;
import patrickadams.testproject.R;


/**
 * Created by Patrick on 4/18/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity>{

    MyActivity myActivity;
    public JUnit_test(){
        super(MyActivity.class);
    }

    public void test_first(){
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }

}
