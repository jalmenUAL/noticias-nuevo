package noticias.views.vistaverdetalleitem;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Verdetalleitem")
@Route(value = "vista-verdetalleitem")
@Uses(Icon.class)
public class VistaVerdetalleitemView extends Composite<VerticalLayout> {

    public VistaVerdetalleitemView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
