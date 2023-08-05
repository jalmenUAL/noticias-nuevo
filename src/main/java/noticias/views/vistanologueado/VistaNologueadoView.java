package noticias.views.vistanologueado;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Nologueado")
@Route(value = "vista-nologueado")
@Uses(Icon.class)
public class VistaNologueadoView extends Composite<VerticalLayout> {

    public VistaNologueadoView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
