package noticias.views.vistaverdetalle;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Verdetalle")
@Route(value = "vista-verdetalle")
@Uses(Icon.class)
public class VistaVerdetalleView extends Composite<VerticalLayout> {

    private H1 h1 = new H1();

    public VistaVerdetalleView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        h1.setText("Detalles de las Noticias");
        getContent().add(h1);
    }
}
