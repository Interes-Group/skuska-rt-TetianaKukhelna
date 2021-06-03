package sk.stuba.fei.uim.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StromTlacidlo implements ActionListener {
    private Graphic graphic;

    StromTlacidlo (Graphic graphic) {
        this.graphic = graphic;
    }

    public void actionPerformed(ActionEvent e){
        graphic.getCanvas().removeMouseListener(graphic.getCanvas().getMouseClick());
        graphic.getCanvas().removeMouseMotionListener(graphic.getCanvas().getMouseClick());
        graphic.getCanvas().setMouseClick(new StromEvent(graphic));
        graphic.getCanvas().addMouseMotionListener(graphic.getCanvas().getMouseClick());
        graphic.getCanvas().addMouseListener(graphic.getCanvas().getMouseClick());
    }
}
