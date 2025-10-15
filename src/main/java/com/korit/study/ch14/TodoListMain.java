package com.korit.study.ch14;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoList todoLsit = new TodoList();
        TodoService todoservice = new TodoService(todoLsit);
        TodoListView view = new TodoListView(userService, todoservice);

        view.homeView();

        System.out.println("==<< 프로그램 종료 >>==");
    }
}
