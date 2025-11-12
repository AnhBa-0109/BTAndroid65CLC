package ntu.nguyenquockhanh.vd_bottomnavigationview;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottom_nav);
        if (savedInstanceState == null) {
            LoadFragment(new HomeFragment());
        }
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment;
                int itemId = menuItem.getItemId();
                if(itemId == R.id.nav_home)
                {
                    selectedFragment = new HomeFragment();
                }
                else if(itemId == R.id.nav_profile)
                {
                    selectedFragment = new ProfileFragment();
                }
                else if(itemId == R.id.nav_search)
                {
                    selectedFragment = new SearchFragment();
                }
                else
                {
                    return false;
                }
                LoadFragment(selectedFragment);
                return true;
            }
        });
    }
    private void LoadFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.nav_host_fragment, fragment)
                .commit();
    }
}