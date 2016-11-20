package androidhive.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

        private MyFragment fragment;
        private List<Student> studentList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView firstname, age, lastname;

public View itemView;


            public MyViewHolder(View view) {
                super(view);
                itemView = view;
                firstname = (TextView) view.findViewById(R.id.firstname);
                lastname = (TextView) view.findViewById(R.id.lastname);
                age = (TextView) view.findViewById(R.id.age);
            }
        }


        public StudentAdapter(List<Student> studentList, MyFragment fragment) {
            this.studentList = studentList;
            this.fragment = fragment;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.student_list_row, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Student student = studentList.get(position);
            holder.firstname.setText(student.getFirstName());
            holder.lastname.setText(student.getLastName());
            holder.age.setText(student.getAge());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity activity = (MainActivity) fragment.getActivity();
                    activity.showDetails();
                }
            });
        }

        @Override
        public int getItemCount() {
            return studentList.size();
        }

    }
