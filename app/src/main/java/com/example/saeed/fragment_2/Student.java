package com.example.saeed.fragment_2;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saeed on 9/2/2017.
 */

public class Student implements Parcelable {
    public String Id="";
    public  String Name="";
    public int Score=0;
    public Student(String Id,String Name,int Score){
        this.Id=Id;
        this.Name=Name;
        this.Score=Score;
    }
    public static List<Student>SampleStudentList(){
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student("A12345","John",10));
        list.add(new Student("A12346","Deivid",12));
        list.add(new Student("A12347","Luis",15));
        list.add(new Student("A12348","Saeed",14));
        list.add(new Student("A12349","Rachel",13));
        list.add(new Student("A123410","Alireza",12));
        list.add(new Student("A123411","Rouja",11));
        list.add(new Student("A123412","Sahar",15));
        list.add(new Student("A123413","Messi",10));
        list.add(new Student("A123414","Iniesata",19));
        list.add(new Student("A123415","Buffon",20));
        return list;

    }

    @Override
    public String toString() {
        return Name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Id);
        parcel.writeString(Name);
        parcel.writeInt(Score);

    }
    public Student(Parcel parcel){
        this.Id=parcel.readString();
        this.Name=parcel.readString();
        this.Score=parcel.readInt();
    }
    public  static Creator <Student>CREATOR=new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel parcel) {
            return new Student(parcel);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
