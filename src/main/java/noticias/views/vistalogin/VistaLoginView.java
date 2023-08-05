package noticias.views.vistalogin;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vista Login")
@Route(value = "vista-login")
@Uses(Icon.class)
public class VistaLoginView extends Composite<VerticalLayout> {

    private LoginForm loginForm = new LoginForm();

    public VistaLoginView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().add(loginForm);
    }
}
