package sg.edu.np.mad.madpractical3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_message);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btng1 = findViewById(R.id.Group1btn);
        Button btng2 = findViewById(R.id.Group2btn);
        btng1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                Group1 group1 = new Group1();
                FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                fragmenttransaction.replace(R.id.fragment_container,group1);
                fragmenttransaction.addToBackStack(null);
                fragmenttransaction.commit();
            }
        });
        btng2.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                BlankFragment fragment = new BlankFragment();
                FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                fragmenttransaction.replace(R.id.fragment_container,fragment);
                fragmenttransaction.addToBackStack(null);
                fragmenttransaction.commit();
            }
        });
    }
}