package examples;

import java.util.List;

public class CollectionsExample1 {

    public static void main(String[] args) {
        // в 9 появились
        var someList = List.of("");
        // Ну вот тут уже в ошибку упадем( Жаль, что нельзя как в котлин(
        // Хотя наполнять так коллекцию когда элементы известны удобней, чем через Add
        someList.add("hello");
        someList.remove("");
    }
}
