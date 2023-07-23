package org.example.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
    private static final Map<Color, Cell> CELL_CACHE = new HashMap<>();

    private CellFactory() {

    }

    public static Cell getCell(Color color) {
        // not use prototype
//        if (!CELL_CACHE.containsKey(color)) {
//            Cell cell = new Cell(color.name());
//            CELL_CACHE.put(color, cell);
//        }
//        return CELL_CACHE.get(color);
        if (!CELL_CACHE.containsKey(color)) {
            Cell cell = new Cell(color.name());
            CELL_CACHE.put(color, cell);
        }
        return CELL_CACHE.get(color).clone();
    }
}
