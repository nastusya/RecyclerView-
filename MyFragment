package androidhive.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nastusya on 11.11.2016.
 */

public class MyFragment extends android.support.v4.app.Fragment {


    private List<Student> studentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private StudentAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        return view;

    }


    @Override
    public void onResume() {
        super.onResume();
        prepareStudentData();
        StudentAdapter mAdapter = new StudentAdapter(studentList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }



    private void prepareStudentData() {
        Student student = new Student("Max", "Yablonskiy", "20");
        studentList.add(student);

        Student student1 = new Student("Tom", "Hiddleston", "17");
        studentList.add(student1);

        Student student2 = new Student("Olga", "Way", "21");
        studentList.add(student2);

        Student student3 = new Student("Ann", "Iero", "19");
        studentList.add(student3);

        Student student4 = new Student("Daniel", "Fedirko", "19");
        studentList.add(student4);



    }
}
