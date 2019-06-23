package com.example.recyclerviewdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import com.example.recyclerviewdatabinding.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private RecyclerAdapter recyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerView.setHasFixedSize(true);
        loadData();
    }

    private void loadData(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Tulasi Reddy","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-212.jpg"));
        userList.add(new User("Raju Kumar","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-17.jpg"));
        userList.add(new User("Vinod","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-34.jpg"));
        userList.add(new User("Suresh","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-12-1.jpg"));
        userList.add(new User("Nowshad","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-7.jpg"));
        userList.add(new User("Katrina Kaif","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-1-2.jpg"));
        userList.add(new User("Aliya Bhatt","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-3-1.jpg"));
        userList.add(new User("Sharukh","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-2-1.jpg"));
        userList.add(new User("Mahesh","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-2.jpg"));
        userList.add(new User("Will Smith","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-and-Tamannaah-2.jpg"));
        userList.add(new User("Raju Kumar","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-and-Tamannaah-1.jpg"));
        userList.add(new User("Vinod","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-4-1.jpg"));
        userList.add(new User("Suresh","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-3-1.jpg"));
        userList.add(new User("Nowshad","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-6.jpg"));
        userList.add(new User("Katrina Kaif","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-5.jpg"));
        userList.add(new User("Aliya Bhatt","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-4.jpg"));
        userList.add(new User("Sharukh","http://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-2.jpg"));
        userList.add(new User("Mahesh","http://www.suryanfm.in/wp-content/uploads/2019/03/Kajal-Aggarwal-111.jpg"));
        userList.add(new User("Will Smith","http://www.suryanfm.in/wp-content/uploads/2019/02/Kajal-Aggarwal-Tamannaah-Aditi-Rao-Hydari-Rana-Daggubatti-Maha-Sivaratri-1.jpg"));
        recyclerAdapter = new RecyclerAdapter(this,userList);
        activityMainBinding.recyclerView.setAdapter(recyclerAdapter);
    }


}
