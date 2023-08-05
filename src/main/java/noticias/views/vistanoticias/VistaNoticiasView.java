package noticias.views.vistanoticias;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Vista Noticias")
@Route(value = "vista-noticias")
@RouteAlias(value = "")
@Uses(Icon.class)
public class VistaNoticiasView extends Composite<VerticalLayout> {

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H1 h1 = new H1();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private Button buttonPrimary = new Button();

    private Button buttonPrimary2 = new Button();

    private Button buttonPrimary3 = new Button();

    public VistaNoticiasView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        h1.setText("Noticias");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Ocultar");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Ver Detalle");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Imprimir");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h1);
        layoutColumn2.add(layoutColumn3);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);
        layoutRow.add(buttonPrimary3);
    }
}
