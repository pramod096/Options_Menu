package pramod.com.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch(id) {
            case R.id.first:
                Toast.makeText(this, "First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.third:
                showAlertDialog();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void showAlertDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("SAMPLE ALERT");
        builder.setIcon(R.drawable.smiley);
        builder.setMessage("This is a sample message");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Positive Button is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("NO", null);
        builder.show();
    }

    @Override
    public void onBackPressed() {

        showAlertDialog();
    }
}