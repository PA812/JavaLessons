package com.company.Lesson4.generics;

public interface BaseEntity<T, I> {

      T getById(I id);

      boolean save(T t);

      T update(T t);

      boolean delete(I id);

}


class User{
      Long id;
      String name;
}


class Student{
      Long id;
      String email;
}

class StudentCrudImpl implements BaseEntity<Student, Long>{
      @Override
      public Student getById(Long id) {
            return null;
      }

      @Override
      public boolean save(Student student) {
            return false;
      }

      @Override
      public Student update(Student student) {
            return null;
      }

      @Override
      public boolean delete(Long id) {
            return false;
      }
}

class UserCrudImpl implements BaseEntity<User, Long>{

      @Override
      public User getById(Long id) {
            return null;
      }

      @Override
      public boolean save(User user) {
            return false;
      }

      @Override
      public User update(User user) {
            return null;
      }

      @Override
      public boolean delete(Long id) {
            return false;
      }
}
