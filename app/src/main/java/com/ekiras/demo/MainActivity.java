package com.ekiras.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ekiras.demo.adapter.PersonAdapter;
import com.ekiras.demo.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private PersonAdapter personAdapter;
    private int bootCounter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonAdapter personAdapter = new PersonAdapter(this,bootData(bootCounter));
        listView = (ListView) findViewById(R.id.person_list);
        listView.setAdapter(personAdapter);

    }



    private List<Person> bootData(int start){
        List<Person> persons = new ArrayList<Person>();
        for(int i=start;i<start+20;i++){
            Person person = new Person();
            person.setName("person-" + i);
            person.setDesc("description :" + i);
            person.setEmail("person" + i + "@ekiras.com");
            person.setImage(R.drawable.user);
            persons.add(person);
        }
        return persons;
    }
}
