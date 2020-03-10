package ba.unsa.etf.rma.vj_18527;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button pretraga;
    private ListView lista;
    private EditText poljeUnosa;
    private ArrayList<String> entries;
    private ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, entries);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pretraga = (Button) findViewById(R.id.searchBtn);
        lista = (ListView) findViewById(R.id.listView);
        poljeUnosa = (EditText) findViewById(R.id.imeFilmaField);
        entries = new ArrayList<String>();

        lista.setAdapter(adapter);

        pretraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(poljeUnosa.getText());
                entries.add(s);

            }
        });
    }
}
