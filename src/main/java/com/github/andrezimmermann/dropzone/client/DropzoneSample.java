package com.github.andrezimmermann.dropzone.client;

import com.github.andrezimmermann.dropzone.client.Dropzone;
import com.github.andrezimmermann.dropzone.client.interfaces.DropzoneOptions;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DropzoneSample implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
      DropzoneOptions options = Dropzone.options();
      options.setUrl("upload");

      Dropzone dropzone = new Dropzone(options);

      SimplePanel dropContainer = new SimplePanel();
      dropContainer.setWidth("50%");
      dropContainer.getElement().getStyle().setProperty("margin", "0 auto");
      dropContainer.add(dropzone);

      RootPanel.get().add(dropContainer);
  }
}
