package noticias.views.vistabuscar;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Vista Buscar")
@Route(value = "vista-buscar")
@Uses(Icon.class)
public class VistaBuscarView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private Icon icon = new Icon();

    private TextField textField = new TextField();

    public VistaBuscarView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        icon.getElement().setAttribute("icon", "lumo:user");
        textField.setLabel("Text field");
        layoutRow.setFlexGrow(1.0, textField);
        getContent().add(layoutRow);
        layoutRow.add(icon);
        layoutRow.add(textField);
    }
}
