package com.example.demo.figures;


import com.example.demo.Color;
import com.example.demo.Position;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public abstract class Figure {
   private Color color;
   private Position position;

   public Figure(Color color) {
      this.color = color;
   }

   public abstract boolean isPossible(Position position1, Position position2, Figure[][] figures);

}
