package idv.leo.homework2_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews() {
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        SubMenu subMenu = menu.addSubMenu(0, R.id.menu, 0, R.string.menu);
        subMenu.add(0, 0, 1, R.string.ch1);
        subMenu.add(0, 0, 2, R.string.ch2);
        SubMenu subMenu1 = menu.addSubMenu(0, R.id.wallpaper, 0, R.string.wallpaper);
        subMenu1.add(0, 0, 1, R.string.wallpaperA);
        subMenu1.add(0, 0, 2, R.string.wallpaperB);
        subMenu1.add(0, 0, 3, R.string.wallpaperC);
        SubMenu subMenu2 = menu.addSubMenu(0, R.id.color, 0, R.string.color);
        subMenu2.add(0, 0, 1, R.string.yellow);
        subMenu2.add(0, 0, 2, R.string.blue);
        subMenu2.add(0, 0, 3, R.string.red);
        //   getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.w1:
                relativeLayout.setBackgroundResource(R.drawable.a);
                Toast.makeText(MainActivity.this, getString(R.string.wallpaperA), Toast.LENGTH_SHORT).show();
                break;
            case R.id.w2:
                relativeLayout.setBackgroundResource(R.drawable.b);
                Toast.makeText(MainActivity.this, getString(R.string.wallpaperB), Toast.LENGTH_SHORT).show();
                break;
            case R.id.w3:
                relativeLayout.setBackgroundResource(R.drawable.c);
                Toast.makeText(MainActivity.this, getString(R.string.wallpaperC), Toast.LENGTH_SHORT).show();
                break;
            case R.id.c1:
                relativeLayout.setBackgroundColor(Color.parseColor("#FFFF40"));
                Toast.makeText(MainActivity.this, getString(R.string.yellow), Toast.LENGTH_SHORT).show();
                break;
            case R.id.c2:
                relativeLayout.setBackgroundColor(Color.parseColor("#0000CD"));
                Toast.makeText(MainActivity.this, getString(R.string.blue), Toast.LENGTH_SHORT).show();
                break;
            case R.id.c3:
                relativeLayout.setBackgroundColor(Color.parseColor("#FF0000"));
                Toast.makeText(MainActivity.this, getString(R.string.red), Toast.LENGTH_SHORT).show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
    }

