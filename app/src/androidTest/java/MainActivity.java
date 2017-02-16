import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;

import com.example.a2mitsf51.mapping.R;
import com.example.a2mitsf51.mapping.SetLocationActivity;

/**
 * Created by 2mitsf51 on 16/02/2017.
 */
public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    public void onClick(View view) {

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.choosemap) {
            //react to the menu item being selected...
            return true;
        } else if (item.getItemId() == R.id.setlocation) {
            Intent intent = new Intent(this, SetLocationActivity.class);
            StartActivity(intent);
        }
        return false;

    }
}
