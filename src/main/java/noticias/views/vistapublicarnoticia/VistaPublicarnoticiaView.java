package noticias.views.vistapublicarnoticia;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Publicarnoticia")
@Route(value = "vista-publicarnoticia")
@Uses(Icon.class)
public class VistaPublicarnoticiaView extends Composite<VerticalLayout> {

    private TextField textField = new TextField();

    private H6 h6 = new H6();

    private RichTextEditor richTextEditor = new RichTextEditor();

    private Button buttonPrimary = new Button();

    public VistaPublicarnoticiaView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        textField.setLabel("Título de la Noticia");
        textField.setWidthFull();
        h6.setText("Texto de la noticia");
        richTextEditor.setWidthFull();
        getContent().setFlexGrow(1.0, richTextEditor);
        buttonPrimary.setText("Publicar la Noticia");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(textField);
        getContent().add(h6);
        getContent().add(richTextEditor);
        getContent().add(buttonPrimary);
    }
}
