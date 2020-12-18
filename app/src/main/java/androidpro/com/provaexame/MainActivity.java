package androidpro.com.provaexame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView CachorroRy;

    private List<Cachorro> listacao = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CachorroRy = findViewById(R.id.recycler);
        criar();

        Adaptador adaptador = new Adaptador(this.listacao);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        CachorroRy.setLayoutManager(layoutManager);
        CachorroRy.setHasFixedSize(true);
        CachorroRy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        CachorroRy.setAdapter(adaptador);
    }
    public void criar() {
        Cachorro Dog = new Cachorro("Nino", "Rusky", "Masculino");
        this.listacao.add(Dog);
        Dog = new Cachorro("Eli", "Pastor", "Feminino");
        this.listacao.add(Dog);
        Dog = new Cachorro("Zeus", "Boxer", "Masculino");
        this.listacao.add(Dog);
        Dog = new Cachorro("Tótó", "Rotvailer", "Masculino");
        this.listacao.add(Dog);
    }
}




