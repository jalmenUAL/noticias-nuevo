package noticias.views.vistaverregistradositem;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Verregistradositem")
@Route(value = "vista-verregistradositem")
@Uses(Icon.class)
public class VistaVerregistradositemView extends Composite<VerticalLayout> {

    public VistaVerregistradositemView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
