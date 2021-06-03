package sk.stuba.fei.uim.oop;

import java.awt.event.MouseAdapter;


public class MouseClick extends MouseAdapter{

    protected Graphic graphic;


    MouseClick(Graphic graphic) {
        this.graphic = graphic;
    }

    public void setGraphic(Graphic graphic) {
        this.graphic = graphic;
    }


    public Graphic getGraphic() {
        return graphic;
    }
}
