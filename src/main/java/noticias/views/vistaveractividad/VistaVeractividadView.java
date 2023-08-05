package noticias.views.vistaveractividad;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Veractividad")
@Route(value = "vista-veractividad")
@Uses(Icon.class)
public class VistaVeractividadView extends Composite<VerticalLayout> {

    private H1 h1 = new H1();

    public VistaVeractividadView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        h1.setText("Actividad");
        getContent().add(h1);
    }
}
