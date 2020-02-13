package com.example.demo;


import com.example.demo.figures.Figure;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
@Slf4j
public class Board {
    public Board(Figure[][] figures) {
        this.figures = figures;
    }

    Figure[][] figures;
    public void drow(){
        for(int i = 1; i<9; i++){
            for(int k = 1; k<9; k++){
                if(figures[i][k] != null) {
                    System.out.print(""+figures[i][k]+"");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
