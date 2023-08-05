package noticias.views.vistaverregistrados;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Verregistrados")
@Route(value = "vista-verregistrados")
@Uses(Icon.class)
public class VistaVerregistradosView extends Composite<VerticalLayout> {

    private H1 h1 = new H1();

    public VistaVerregistradosView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        h1.setText("Registrados");
        getContent().add(h1);
    }
}
