package com.soja.vaadincomline;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView(name = ComLineView.VIEW_NAME)
public class ComLineView extends VerticalLayout implements View {

    static final String VIEW_NAME = "view";

    @PostConstruct
    void init() {
        try {
            Process p = ComLineConnection.createConnection();
            int exitValue = p.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
