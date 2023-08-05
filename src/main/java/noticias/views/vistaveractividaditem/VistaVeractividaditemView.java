package noticias.views.vistaveractividaditem;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Veractividaditem")
@Route(value = "vista-veractividaditem")
@Uses(Icon.class)
public class VistaVeractividaditemView extends Composite<VerticalLayout> {

    public VistaVeractividaditemView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
