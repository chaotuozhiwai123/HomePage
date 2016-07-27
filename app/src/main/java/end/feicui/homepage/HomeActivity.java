package end.feicui.homepage;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(listener);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // 在滑动中做actionbar的打开和关闭,icon的动画等等
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    private NavigationView.OnNavigationItemSelectedListener listener=new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.github1_1:
                    Toast.makeText(HomeActivity.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github1_2:
                    Toast.makeText(HomeActivity.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github1_3:
                    Toast.makeText(HomeActivity.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github2_1:
                    Toast.makeText(HomeActivity.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github2_2:
                    Toast.makeText(HomeActivity.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github2_3:
                    Toast.makeText(HomeActivity.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github3_1:
                    Toast.makeText(HomeActivity.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github3_2:
                    Toast.makeText(HomeActivity.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.github3_3:
                    Toast.makeText(HomeActivity.this, "9", Toast.LENGTH_SHORT).show();
                    break;

            }
            return false;
        }
    };
}
